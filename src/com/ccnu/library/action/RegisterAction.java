package com.ccnu.library.action;

import com.ccnu.library.data.HibernateUtils;
import com.ccnu.library.data.UserinfoEntity;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.*;
import sun.misc.BASE64Encoder;

import java.util.List;

public class RegisterAction extends ActionSupport {

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
        Session session = null;
        Transaction transaction = null;

        HibernateUtils.createSessionFactory();

        try {
            session = HibernateUtils.getSession();
            transaction = session.beginTransaction();

            String hql = "from UserinfoEntity as User where username=:name";
            Query query = session.createQuery(hql);
            query.setString("name",getUsername());
            List<UserinfoEntity> list = query.list();
            if(!list.isEmpty()){
                return ERROR;
            }

            UserinfoEntity user = new UserinfoEntity();
            user.setUsername(getUsername());
            byte[] passwd = getPassword().getBytes("utf-8");
            String password = new BASE64Encoder().encode(passwd);
            user.setPassword(password);

            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        ctx.getSession().put("user",getUsername());
        return SUCCESS;
    }
}