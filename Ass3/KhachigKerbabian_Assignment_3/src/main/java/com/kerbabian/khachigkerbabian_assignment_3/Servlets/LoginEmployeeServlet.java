package com.kerbabian.khachigkerbabian_assignment_3.Servlets;

import com.kerbabian.khachigkerbabian_assignment_3.DataBaseConnection.DBUtil;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "EmployeeServlet", value = "/Login")
public class LoginEmployeeServlet extends HttpServlet {


    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ///String firstname = request.getParameter("firstname");
        //String lastname = request.getParameter("lastname");
        //String username = request.getParameter("username");
        String password = request.getParameter("password");
        String username = request.getParameter("username");



        try {
            String s = DBUtil.checkEmployeeRegistration(username, password);
            if ( !s.equals("")){
                request.setAttribute("firstname", s.split(" ")[0]);
                request.setAttribute("lastname", s.split(" ")[1]);
                request.getRequestDispatcher("success.jsp").forward(request, response);
            }
            else{
                request.getRequestDispatcher("signup.jsp").forward(request, response);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        request.getRequestDispatcher("signup.jsp").forward(request, response);
    }
}
