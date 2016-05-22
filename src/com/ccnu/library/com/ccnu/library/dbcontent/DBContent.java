package com.ccnu.library.com.ccnu.library.dbcontent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBContent {

    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String DATABASE = "jdbc:mysql://127.0.0.1:8080/LibraryDatabase";
    public static final String USER = "root";
    public static final String PASSWORD = "885785";

    private static final String FINDUSER = "SELECT * FROM UserInfo WHERE username = ?";

    public static boolean findUser(Connection conn, String username) throws Exception{
        PreparedStatement ps = conn.prepareStatement(FINDUSER);
        ps.setString(1, username);
        ResultSet rs = ps.executeQuery();
        if(!rs.next()) { return true; }
        return false;
    }

}
