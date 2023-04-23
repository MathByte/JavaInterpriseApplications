package com.khachig.example2;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FormhandlerServlet", value = "/FormhandlerServlet")
public class FormhandlerServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String enteredValue;
        enteredValue = request.getParameter("enteredValue");
        response.setContentType("text/html");
        PrintWriter printWriter;

        try
        {
            printWriter = response.getWriter();
            printWriter.println("<p>");
            printWriter.print("You entered: ");
            printWriter.print(enteredValue);
            printWriter.print("</p>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
