package com.demo.controller;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.demo.model.Student;

public class StudentController {

    public static int addStudent(Student student) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/miniproject", "root", "root");

        String query = "INSERT INTO STUDENT VALUES ('" + student.getId() + "','" + student.getName() + "','" + student.getContactNo() + "','" + student.getEmail() + "','" + student.getAddress() + "')";

        Statement stm = connection.createStatement();

        int executeUpdate = stm.executeUpdate(query);

        return executeUpdate;
    }
}