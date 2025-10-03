package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/sms_db";
    private static final String USER = "root";
    private static final String PASS = "";


    private DBConnection() {}


    public static Connection getConnection() {
        Connection conn = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            conn = DriverManager.getConnection(URL, USER, PASS);

        } catch (ClassNotFoundException e) {
            System.err.println(" JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println(" Database connection failed!");
            e.printStackTrace();
        }
        return conn;
    }
}

