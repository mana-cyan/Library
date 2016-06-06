package com.ccnu.library.action;

import com.ccnu.library.Book;
import com.ccnu.library.data.BookinfoEntity;
import com.ccnu.library.data.HibernateUtils;
import com.ccnu.library.data.UserinfoEntity;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.Query;
import org.hibernate.Session;
import java.util.List;

public class SearchAction extends ActionSupport {

    private String name;
    private Book book;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String execute() throws Exception {
        ActionContext ctx = ActionContext.getContext();
        HibernateUtils.createSessionFactory();
        Session session = HibernateUtils.getSession();
        String hql = "from BookinfoEntity as Book where name=:bookname ";
        Query query = session.createQuery(hql);
        query.setString("bookname",getName());
        List<BookinfoEntity> list = query.list();

        if(list.isEmpty()){
            session.close();
            return ERROR;
        }

        for(BookinfoEntity name : list) {
            String name_reg = "\\w*" + getName() + "\\w*";
            if(name.getName().matches(name_reg)){
                ctx.getSession().put("id",name.getId());
            }
        }



        return ERROR;
    }
}
