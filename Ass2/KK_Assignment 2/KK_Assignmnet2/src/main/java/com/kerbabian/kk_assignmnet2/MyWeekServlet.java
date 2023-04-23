package com.kerbabian.kk_assignmnet2;

import JavaClass.MyWeek;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "MyWeekServlet", value = "/MyWeekServlet")
public class MyWeekServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String daysNumber = request.getParameter("daysNumber");
        String messagee = "";
        String daysString = "";




        MyWeek myweek = new MyWeek();
        myweek.setName("Khachig Kerbabian");

        myweek.setWorkingDaysByNumber(daysNumber);


        request.setAttribute("descriptionJSP", myweek.getDescription());


        for(int i = 0; i < myweek.getNumberWorkingDays(); i++)
        {
            daysString += myweek.getWorkingDays().get(i).toString() + ", ";
        }
        request.setAttribute("DayString", daysString);

        request.setAttribute("nameJSP", myweek.getName());




        request.setAttribute("percentJSP", ((double)myweek.getNumberWorkingDays()  / (double)myweek.getNumberDays()) * 100);





        if(myweek.getNumberWorkingDays() > myweek.getNumberDays() - myweek.getNumberWorkingDays())
            messagee = "Good Job!";
        else
            messagee = "This is far from ideal :(";
        request.setAttribute("messageJSP", messagee);




        request.getRequestDispatcher("daysworkServlet.jsp").forward(request, response);
    }

}
