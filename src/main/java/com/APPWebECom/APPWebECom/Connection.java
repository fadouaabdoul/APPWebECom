package com.APPWebECom.APPWebECom;

import java.sql.DriverManager;

public class Connection {

    private static Connection conn;

    public Connection() {
    }

    public static Connection getConnection() {
        return conn;
    }

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/ecom", "root", "");
        } catch (Exception var1) {
            System.out.println("Connection problem!!");
            var1.printStackTrace();
        }

    }
}
