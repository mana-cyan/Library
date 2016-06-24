package com.ccnu.library.action;

import com.ccnu.library.data.BookinfoEntity;
import com.ccnu.library.data.HibernateUtils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.Query;
import org.hibernate.Session;
import java.util.ArrayList;
import java.util.List;

public class SearchAction extends ActionSupport {

    private String search;

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String execute() throws Exception {

        ActionContext ctx = ActionContext.getContext();

        HibernateUtils.createSessionFactory();
        Session session = HibernateUtils.getSession();

        String hql = "from BookinfoEntity";
        Query query = session.createQuery(hql);
        List<BookinfoEntity> list = query.list();

        List<String> books = new ArrayList<String>();
        int id = 0;
        String name_reg = "\\.*" + getSearch() + "\\.*";

        for(BookinfoEntity book : list) {
            if(book.getBookName().matches(name_reg)){
                id = book.getId();
                books.add(book.getBookName());
            }
        }

        if(books.isEmpty()) {
            session.close();
            return ERROR;
        }

        ctx.getSession().put("bookID", id);

        return SUCCESS;
    }
}
