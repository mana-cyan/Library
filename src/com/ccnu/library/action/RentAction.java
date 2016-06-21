package com.ccnu.library.action;

import com.ccnu.library.data.BookinfoEntity;
import com.ccnu.library.data.HibernateUtils;
import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class RentAction extends ActionSupport {

    String bookName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String execute() throws Exception {
        HibernateUtils.createSessionFactory();
        Session session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();
        String findBook = "from BookinfoEntity as Book where bookName=:name";
        Query findBookQuery = session.createQuery(findBook);
        findBookQuery.setString("name", getBookName());
        List<BookinfoEntity> bookList =  findBookQuery.list();

        for(BookinfoEntity book : bookList)
        {
            if(0 == book.getStorage()){
                return ERROR;
            }
        }
        return SUCCESS;

    }

}
