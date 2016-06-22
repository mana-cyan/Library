package com.ccnu.library.action;

import com.ccnu.library.data.BookinfoEntity;
import com.ccnu.library.data.HibernateUtils;
import com.ccnu.library.data.UserinfoEntity;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class RentAction extends ActionSupport {

    private String bookName;
    private Session session;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    private boolean checkBookStorage() {

        boolean status = true;

        String findBook = "from BookinfoEntity where bookName=:name";
        Query findBookQuery = session.createQuery(findBook);
        findBookQuery.setString("name", getBookName());

        List<BookinfoEntity> bookList =  findBookQuery.list();
        for(BookinfoEntity book : bookList)
        {
            if(0 == book.getStorage()){
                status = false;
            }
        }
        return status;
    }

    private void sendRequest() {
        String request = "from RequestEntity";
    }

    public String execute() throws Exception {
        HibernateUtils.createSessionFactory();
        session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();

        return SUCCESS;

    }

}
