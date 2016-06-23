package com.ccnu.library.action;

import com.ccnu.library.Utils;
import com.ccnu.library.data.BookinfoEntity;
import com.ccnu.library.data.HibernateUtils;
import com.ccnu.library.data.RequestEntity;
import com.ccnu.library.data.UserinfoEntity;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class RentAction extends ActionSupport {

    private String fromDate;
    private String toDate;

    private BookinfoEntity book;
    private UserinfoEntity user;
    private Session session;


    public String getToDate() {
        return toDate;
    }

    public String getFromDate() {
        return fromDate;
    }

    private void getUserinfo() {
        HibernateUtils.createSessionFactory();
        session = HibernateUtils.getSession();
        ActionContext ctx = ActionContext.getContext();

        String findUser = "from UserinfoEntity where username=:name";
        Query findUserQuery = session.createQuery(findUser);
        findUserQuery.setString("name", ctx.getSession().get("user").toString());

        List<UserinfoEntity> userList =  findUserQuery.list();
        for(UserinfoEntity u : userList)
        {
            user.setId(u.getId());
            user.setUsername(u.getUsername());
        }
        session.close();
    }

    private void sendRequest() {

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
        user = new UserinfoEntity();
        book = Utils.getBookInfo();
        getUserinfo();
        return SUCCESS;
    }

}
