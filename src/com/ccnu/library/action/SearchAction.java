package com.ccnu.library.action;

import com.ccnu.library.Book;
import com.ccnu.library.data.BookinfoEntity;
import com.ccnu.library.data.HibernateUtils;
import com.ccnu.library.data.UserinfoEntity;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class SearchAction extends ActionSupport {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute() throws Exception {

        ActionContext ctx = ActionContext.getContext();

        HibernateUtils.createSessionFactory();
        Session session = HibernateUtils.getSession();

        String hql = "from BookinfoEntity as Book where name=:bookname ";
        Query query = session.createQuery(hql);
        query.setString("bookname",getName());
        List<BookinfoEntity> list = query.list();

        List<Integer> books = new ArrayList<Integer>();
        String name_reg = "\\.*" + getName() + "\\.*";

        for(BookinfoEntity name : list) {
            if(name.getName().matches(name_reg)){
                books.add(name.getId());
            }
        }

        if(books.isEmpty()) {
            session.close();
            return ERROR;
        }

        ctx.getSession().put("id",books);

        return SUCCESS;
    }
}
