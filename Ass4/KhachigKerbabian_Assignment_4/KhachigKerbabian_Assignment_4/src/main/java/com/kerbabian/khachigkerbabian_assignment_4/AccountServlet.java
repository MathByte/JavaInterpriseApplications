package com.kerbabian.khachigkerbabian_assignment_4;

import com.kerbabian.khachigkerbabian_assignment_4.EJB.AccountBean;
import jakarta.ejb.EJB;
import jakarta.inject.Inject;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "AccountServlet", value = "/AccountServlet")
public class AccountServlet extends HttpServlet {

    @EJB(beanName = "AccountBeanImpl")
    AccountBean _accountBean;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        double amount = 0;
        String ss = request.getParameter("amount");
        String btnRadioValue = "";
        if (ss.equals("")){
            amount = 0;
            btnRadioValue = request.getParameter("typeInteraction");
        }
        else
        {
            amount = Double.parseDouble(request.getParameter("amount"));
            btnRadioValue = request.getParameter("typeInteraction");
        }


        if(btnRadioValue.equals("Deposit")){
            _accountBean.deposit(amount);
        }
        else if(btnRadioValue.equals("Withdraw")){
            _accountBean.withdraw(amount);
        }

        request.setAttribute("bal", _accountBean.getBalance());

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");

        requestDispatcher.forward(request, response);






        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
