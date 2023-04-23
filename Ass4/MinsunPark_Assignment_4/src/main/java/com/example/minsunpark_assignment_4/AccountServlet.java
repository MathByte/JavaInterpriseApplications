package com.example.minsunpark_assignment_4;

import com.example.minsunpark_assignment_4.EJB.AccountBean;
import jakarta.ejb.EJB;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AccountServlet", value = "/AccountServlet")
public class AccountServlet extends HttpServlet {
    @EJB(beanName = "AccountBeanImpl")
    AccountBean accountBean;
    private double balance;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double amount = Double.parseDouble(request.getParameter("amount"));
        String btnRadioValue = request.getParameter("choice");

        if(btnRadioValue.equals("Deposit")){
            accountBean.deposit(amount);
            balance = accountBean.getBalance();
        }
        else if(btnRadioValue.equals("Withdraw")){
            accountBean.withdraw(amount);
            balance = accountBean.getBalance();
        }

        request.setAttribute("balance", balance);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");

        requestDispatcher.forward(request, response);
    }
}
