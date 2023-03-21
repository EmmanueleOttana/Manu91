package it.develhope.sql.sql2;

import java.sql.*;

public class TabellaSql {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "developer";
        String password = "passwordhere";

        Connection connect = DriverManager.getConnection(url,user,password);
        Statement statement = connect.createStatement();

        statement.execute("CREATE TABLE students (id_students INT PRIMARY KEY AUTO_INCREMENT NOT NULL, last_name VARCHAR (30) NOT NULL, first_name VARCHAR (30) NOT NULL)");

        statement.execute("INSERT INTO students (last_name, first_name) VALUES ('Potter', 'Harry')");
        statement.execute("INSERT INTO students (last_name, first_name) VALUES ('Granger', 'Hermione')");
        statement.execute("INSERT INTO students (last_name, first_name) VALUES ('Weasley', 'Ron')");
        statement.execute("INSERT INTO students (last_name, first_name) VALUES ('Malfoy', 'Draco')");

        ResultSet rs = statement.executeQuery("SELECT * FROM students");
        while (rs.next()){
            System.out.println(rs.getString(1) + " " +
                    rs.getString(2) + " " +rs.getString(3));
        }

    }
}
