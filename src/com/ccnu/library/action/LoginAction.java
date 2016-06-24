package com.ccnu.library.action;

import com.ccnu.library.data.HibernateUtils;
import com.ccnu.library.data.UserinfoEntity;
import com.opensymphony.xwork2.*;
import org.apache.struts2.*;
import org.hibernate.Query;
import org.hibernate.Session;
import sun.misc.BASE64Encoder;

import javax.servlet.http.*;
import java.util.List;

public class  LoginAction implements Action
{
    private String username;
    private String password;

    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getUsername()
    {
        return this.username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getPassword()
    {
        return this.password;
    }

    public String execute() throws Exception
    {
        ActionContext ctx = ActionContext.getContext();
        HibernateUtils.createSessionFactory();
        Session session = HibernateUtils.getSession();

        String hql = "from UserinfoEntity as User where username=:name";
        Query query = session.createQuery(hql);
        query.setString("name",getUsername());

        List<UserinfoEntity> list = query.list();

        if(list.isEmpty()){
            session.close();
            return ERROR;
        }

        byte[] passwd = getPassword().getBytes("utf-8");
        String password = new BASE64Encoder().encode(passwd);

        for(UserinfoEntity user : list) {
            if(user.getPassword().equals(password)){
                ctx.getSession().put("username" , getUsername());
                Cookie c = new Cookie("username" , getUsername());
                c.setMaxAge(60 * 60);
                ServletActionContext.getResponse().addCookie(c);
                session.close();
                return SUCCESS;
            }
        }
        return ERROR;
    }
}