package com.khachig.example3;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "multiplevaluefieldhandlerservlet",
        value = "/multiplevaluefieldhandlerservlet")
public class multiplevaluefieldhandlerservlet extends
        HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException,
            IOException {
        String[] selectedOptions =
                request.getParameterValues("options");
        response.setContentType("text/html");
        try {
            PrintWriter printWriter =
                    response.getWriter();
            printWriter.println("<p>");
            printWriter.print("The following options were selected:");
            printWriter.println("<br/>");
            if(selectedOptions != null) {
                for (String option : selectedOptions)
                { printWriter.print(option);
                    printWriter.println("<br/>");
                }
            } else {
                printWriter.println("None");
            }
            printWriter.println("</p>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}