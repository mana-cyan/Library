package com.ccnu.library;

import com.ccnu.library.data.BookinfoEntity;
import com.ccnu.library.data.HibernateUtils;
import com.ccnu.library.data.RequestEntity;
import com.opensymphony.xwork2.ActionContext;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class Utils {

    private static Session session;

    public static BookinfoEntity getBookInfo() {

        BookinfoEntity book = new BookinfoEntity();

        HibernateUtils.createSessionFactory();
        session = HibernateUtils.getSession();

        ActionContext ctx = ActionContext.getContext();

        String findBook = "from BookinfoEntity where id=:bookid";
        Query findBookQuery = session.createQuery(findBook);
        findBookQuery.setString("bookid", ctx.getSession().get("id").toString());

        List<BookinfoEntity> bookList =  findBookQuery.list();
        for(BookinfoEntity b : bookList)
        {
            book.setId(book.getId());
            book.setBookName(b.getBookName());
            book.setBookAuthor(b.getBookAuthor());
            book.setStorage(b.getStorage());
            book.setBookInfo(b.getBookInfo());
            book.setBookPath(b.getBookPath());
        }
        session.close();
        return book;
    }

    public static List<RequestEntity> getRequests() {

        HibernateUtils.createSessionFactory();
        session = HibernateUtils.getSession();

        String findRequest = "from RequestEntity";
        Query requestQuey = session.createQuery(findRequest);

        List<RequestEntity> requestList = requestQuey.list();

        session.close();

        return requestList;
    }

}
