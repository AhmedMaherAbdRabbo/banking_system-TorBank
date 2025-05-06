package backend.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnections {

    private static Connection mysqlCon;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/torbank_db?zeroDateTimeBehavior=CONVERT_TO_NULL",
                    "root", 
                    "mody"
            );
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Database Connection Error: " + ex.getMessage());
            return null;
        }
    }

}
