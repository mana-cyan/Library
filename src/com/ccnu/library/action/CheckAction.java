package com.ccnu.library.action;

import com.ccnu.library.Utils;
import com.ccnu.library.data.BookinfoEntity;
import com.ccnu.library.data.HibernateUtils;
import com.ccnu.library.data.RequestEntity;
import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class CheckAction extends ActionSupport {

    private String requestID;
    private Session session;
    private Transaction transaction;

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String refuse() throws Exception {

        try {
            HibernateUtils.createSessionFactory();
            session = HibernateUtils.getSession();
            transaction = session.beginTransaction();

            String del = "delete from RequestEntity where id=:requestID";
            Query delQuery = session.createQuery(del);
            delQuery.setInteger("requestID", Integer.parseInt(getRequestID()));
            delQuery.executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
        }
        return SUCCESS;
    }

    public String execute() throws Exception {
        RequestEntity request = Utils.getRequest(Integer.parseInt(getRequestID()));
        BookinfoEntity b = Utils.getBookInfo(request.getBookId());

        try {
            session = HibernateUtils.getSession();
            transaction = session.beginTransaction();

            String user = "update UserinfoEntity set rented=:rentedBook where id=:userID";
            Query userQuery = session.createQuery(user);
            userQuery.setString("rentedBook",b.getBookName());
            userQuery.setInteger("userID", request.getUserId());
            userQuery.executeUpdate();

            String book = "update BookinfoEntity set storage=:restBooks where id=:bookID";
            Query bookQuery = session.createQuery(book);
            bookQuery.setInteger("restBooks", b.getStorage() - 1);
            bookQuery.setInteger("bookID", b.getId());
            bookQuery.executeUpdate();

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
        }
        refuse();
        return SUCCESS;
    }

}
