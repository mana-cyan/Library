package com.ccnu.library;

import com.ccnu.library.data.BookinfoEntity;
import com.ccnu.library.data.HibernateUtils;
import com.ccnu.library.data.RequestEntity;
import com.ccnu.library.data.UserinfoEntity;
import com.opensymphony.xwork2.ActionContext;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class Utils {

    private static Session session;
    private final static ActionContext ctx = ActionContext.getContext();

    public static BookinfoEntity getBookInfo(){

        BookinfoEntity book = new BookinfoEntity();

        try {
            HibernateUtils.createSessionFactory();
            session = HibernateUtils.getSession();

            String findBook = "from BookinfoEntity where id=:bookid";
            Query findBookQuery = session.createQuery(findBook);
            Integer id = (Integer) ctx.getSession().get("bookID");
            findBookQuery.setInteger("bookid", id);

            List<BookinfoEntity> bookList =  findBookQuery.list();
            for(BookinfoEntity b : bookList)
            {
                book.setId(b.getId());
                book.setBookName(b.getBookName());
                book.setBookAuthor(b.getBookAuthor());
                book.setStorage(b.getStorage());
                book.setBookInfo(b.getBookInfo());
                book.setBookPath(b.getBookPath());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(session.isOpen())
                session.close();
        }

        ctx.put("book",book);

        return book;
    }

    public static UserinfoEntity getUserinfo() {

        UserinfoEntity user = new UserinfoEntity();

        try{
            HibernateUtils.createSessionFactory();
            session = HibernateUtils.getSession();

            String findUser = "from UserinfoEntity where username=:name";
            Query findUserQuery = session.createQuery(findUser);
            findUserQuery.setString("name", ctx.getSession().get("username").toString());

            List<UserinfoEntity> userList =  findUserQuery.list();
            for(UserinfoEntity u : userList)
            {
                user.setId(u.getId());
                user.setUsername(u.getUsername());
                user.setRented(u.getRented());
                user.setAdmin(u.getAdmin());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(session.isOpen())
                session.close();
        }
        ctx.put("user", user);
        return user;
    }

    public static BookinfoEntity getBookInfo(int bookID){

        BookinfoEntity book = new BookinfoEntity();

        try {
            HibernateUtils.createSessionFactory();
            session = HibernateUtils.getSession();

            String findBook = "from BookinfoEntity where id=:bookid";
            Query findBookQuery = session.createQuery(findBook);
            findBookQuery.setInteger("bookid", bookID);

            List<BookinfoEntity> bookList =  findBookQuery.list();
            for(BookinfoEntity b : bookList)
            {
                book.setId(b.getId());
                book.setBookName(b.getBookName());
                book.setBookAuthor(b.getBookAuthor());
                book.setStorage(b.getStorage());
                book.setBookInfo(b.getBookInfo());
                book.setBookPath(b.getBookPath());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(session.isOpen())
                session.close();
        }
        return book;
    }

    public static UserinfoEntity getUserinfo(int userID) {

        UserinfoEntity user = new UserinfoEntity();

        try{
            HibernateUtils.createSessionFactory();
            session = HibernateUtils.getSession();

            String findUser = "from UserinfoEntity where id=:userID";
            Query findUserQuery = session.createQuery(findUser);
            findUserQuery.setInteger("userID", userID);

            List<UserinfoEntity> userList =  findUserQuery.list();
            for(UserinfoEntity u : userList)
            {
                user.setId(u.getId());
                user.setUsername(u.getUsername());
                user.setRented(u.getRented());
                user.setAdmin(u.getAdmin());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(session.isOpen())
                session.close();
        }
        return user;
    }

    public static List<RequestEntity> getRequests() {

        HibernateUtils.createSessionFactory();
        session = HibernateUtils.getSession();

        String getRequest = "from RequestEntity";
        Query requestQuey = session.createQuery(getRequest);

        List<RequestEntity> requestList = requestQuey.list();

        session.close();
        return requestList;
    }

    public static RequestEntity getRequest(int requestID) {

        RequestEntity request = new RequestEntity();
        HibernateUtils.createSessionFactory();
        session = HibernateUtils.getSession();

        String findRequest = "from RequestEntity where id=:requestID";
        Query requestQuey = session.createQuery(findRequest);
        requestQuey.setInteger("requestID", requestID);

        List<RequestEntity> requestList = requestQuey.list();
        for(RequestEntity r : requestList) {
            request.setBookId(r.getBookId());
            request.setUserId(r.getUserId());
            request.setFromDate(r.getFromDate());
            request.setToDate(r.getToDate());
        }
        if(session.isOpen())
            session.close();
        return request;
    }

}
