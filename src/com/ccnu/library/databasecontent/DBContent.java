package com.ccnu.library.databasecontent;

import com.ccnu.library.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBContent {

    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String DATABASE = "jdbc:mysql://127.0.0.1:8080/LibraryDatabase";
    public static final String USER = "root";
    public static final String PASSWORD = "885785";

    private static final String FINDUSER = "SELECT * FROM UserInfo WHERE username = ?";
    private static final String FINDBOOK = "SELECT * FROM BookInfo WHERE Name = ?";

    public static boolean findUser(Connection conn, String username) throws Exception {
        PreparedStatement ps = conn.prepareStatement(FINDUSER);
        ps.setString(1, username);
        ResultSet rs = ps.executeQuery();
        if(!rs.next()) { return true; }
        return false;
    }

    public static Book findBook(Connection conn, String bookName) throws Exception {
        Book book = new Book();
        PreparedStatement ps = conn.prepareStatement(FINDBOOK);
        ps.setString(1,bookName);
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            book.setID(rs.getInt("ID"));
            book.setName(rs.getString("Name"));
            book.setAuthor(rs.getString("Author"));
            book.setPath(rs.getString("Path"));
            return book;
        }
        return null;
    }

}
