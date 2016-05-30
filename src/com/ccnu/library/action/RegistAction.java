package com.ccnu.library.action;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegistAction extends ActionSupport {

    private String username = null;
    private String password = null;
    private String tips = null;

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public String execute() throws Exception {
//        ActionContext.getContext().getSession().put("user",getUsername());
//        Class.forName(DBContent.DRIVER);
//        conn = DriverManager.getConnection(DBContent.DATABASE, DBContent.USER, DBContent.PASSWORD);
//        System.out.println("连接成功!");
//        boolean reg_status = DBContent.findUser(conn, getUsername());
//        if(reg_status) {
//            return ERROR;
//        }
//        if("mana_cyan" != getUsername()) {
//            setTips("注册失败");
//        }
//        conn.close();
        return SUCCESS;
    }

}
