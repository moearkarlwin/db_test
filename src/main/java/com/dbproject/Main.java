package com.dbproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    private Connection db_connect() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
            System.out.println("Successful connected.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Connection con = m.db_connect();
    }
}