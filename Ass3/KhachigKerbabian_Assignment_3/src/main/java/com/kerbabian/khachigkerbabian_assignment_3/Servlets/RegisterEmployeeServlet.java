package com.kerbabian.khachigkerbabian_assignment_3.Servlets;

import com.kerbabian.khachigkerbabian_assignment_3.Bean.Employee;
import com.kerbabian.khachigkerbabian_assignment_3.DataBaseConnection.DBUtil;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "RegisterEmployeeServlet", value = "/Register")
public class RegisterEmployeeServlet extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String date = String.valueOf(request.getParameter("hiredate"));


        Employee employee = new Employee();

        employee.setUsername(username);
        employee.setFirstname(firstname);
        employee.setLastname(lastname);
        employee.setPassword(password);
        employee.setEmail(email);
        employee.setHireDate(date);

        try {
            if(DBUtil.checkEmployeeRegistration(username, password).equals("")){
                DBUtil.registerEmployee(employee);
            }else {
                request.setAttribute("tag1", "Already Registered, Please Sign in!");
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        request.setAttribute("tag1", "Registered, Please Sign in!");
        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }
}
