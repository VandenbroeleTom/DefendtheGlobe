package data.util;

import util.BreakoutException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by vande on 2/12/2017.
 */
public class MySqlConnection {

    //private static String URL = "jdbc:mysql://localhost:3306/AtariBreakout";
    private static String URL = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11210642";
    private static String UID = "sql11210642";
    private static String PWD = "fYXYkF9yaq";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private MySqlConnection() {

    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, UID, PWD);
        } catch (SQLException e) {
            throw new BreakoutException("Couldn't connect to DB", e);
        }
    }
}
