package com.kerbabian.khachigkerbabian_assignment_3.DataBaseConnection;

import com.kerbabian.khachigkerbabian_assignment_3.Bean.Employee;

import java.sql.*;



public  class DBUtil {

    public  static int registerEmployee (Employee emp) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO employee" +
                "(userName, password, firstName, lastName, emailAddress, hireDate) VALUES " +
                "(?, ?, ?, ?, ?, ?);";
        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");
        // Get Connection
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrmanager", "root", "admin123");
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            //preparedStatement.setInt(1,1);
            preparedStatement.setString(1, emp.getUsername());
            preparedStatement.setString(2, emp.getPassword());
            preparedStatement.setString(3, emp.getFirstname());
            preparedStatement.setString(4, emp.getLastname());
            preparedStatement.setString(5, emp.getEmail());
            preparedStatement.setString(6, emp.getHireDate());

            result = preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return result;
    }


    public static String checkEmployeeRegistration (String username, String password) throws ClassNotFoundException {
        String CHECK_USER_SQL = "SELECT username, emailAddress, password, firstName, lastName FROM employee";
        String result = "";

        Class.forName("com.mysql.jdbc.Driver");
        // Get Connection
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrmanager", "root", "admin123");
             Statement  stmt  = connection.createStatement();) {
            ResultSet rs = stmt.executeQuery(CHECK_USER_SQL);
            while(rs.next()){

                if (rs.getString(1).equals(username) && rs.getString(3).equals(password)){
                    result = rs.getString(4) + " " + rs.getString(5);
                }
            }


        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return result;
    }

    public String getAllDatas() {
        String CHECK_USER_SQL = "SELECT * FROM employee";
        String result = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // Get Connection
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrmanager", "root", "admin123");
             Statement  stmt  = connection.createStatement();) {
            ResultSet rs = stmt.executeQuery(CHECK_USER_SQL);
            while(rs.next()){

                result += rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + "\n";

            }


        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return result;
    }
}
