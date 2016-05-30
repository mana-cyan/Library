package com.ccnu.library.action;

import com.ccnu.library.Book;
import com.ccnu.library.databasecontent.DBContent;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.Connection;
import java.sql.DriverManager;

public class SearchAction extends ActionSupport {

    private String name;
    private Book book;
    private Connection conn;

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
        Class.forName(DBContent.DRIVER);
        conn = DriverManager.getConnection(DBContent.DATABASE,DBContent.USER,DBContent.PASSWORD);
        System.out.println("连接成功!");
        book = DBContent.findBook(conn,getName());
        conn.close();
        if(null != book) return SUCCESS;
        return ERROR;
    }
}
