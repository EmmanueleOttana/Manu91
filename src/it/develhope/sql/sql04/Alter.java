package it.develhope.sql.sql04;

import java.sql.*;

public class Alter {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "developer";
        String pass = "passwordhere";

        Connection conn = DriverManager.getConnection(url,user,pass);
        Statement statement = conn.createStatement();
        //statement.execute("ALTER TABLE newdb.students ADD COLUMN country VARCHAR (30)");
        //statement.execute("UPDATE newdb.students SET country = 'Italy' WHERE last_name = 'Potter' OR last_name = 'Granger' " );
        //statement.execute("UPDATE newdb.students SET country = 'Germany' WHERE last_name = 'Weasley' OR last_name = 'Malfoy' " );
        ResultSet rs = statement.executeQuery("SELECT * FROM newdb.students");

        while (rs.next()){
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " +
                    rs.getString(3)+ " "+rs.getString("country"));
        }

        conn.close();

    }
}
