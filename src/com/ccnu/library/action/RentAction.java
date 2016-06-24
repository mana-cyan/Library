package com.ccnu.library.action;

import com.ccnu.library.Utils;
import com.ccnu.library.data.BookinfoEntity;
import com.ccnu.library.data.HibernateUtils;
import com.ccnu.library.data.RequestEntity;
import com.ccnu.library.data.UserinfoEntity;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RentAction extends ActionSupport {

    private String fromDate;
    private String toDate;

    private BookinfoEntity book;
    private UserinfoEntity user;
    private Session session;

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }



    private void sendRequest() throws Exception{

        HibernateUtils.createSessionFactory();
        session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();

        RequestEntity request = new RequestEntity();
        request.setBookId(book.getId());
        request.setUserId(user.getId());
        request.setFromDate(getFromDate());
        request.setToDate(getToDate());

        session.save(request);
        transaction.commit();

        session.close();
    }


    public String execute() throws Exception {
        book = Utils.getBookInfo();
        user = Utils.getUserinfo();
        if(book.getStorage() > 0) {
            sendRequest();
            return SUCCESS;
        }
        return ERROR;
    }

}
