<%--
  Created by IntelliJ IDEA.
  User: khach
  Date: 1/31/2023
  Time: 8:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Weekly Work!</title>
</head>
<body style="text-align: center">
    <jsp:useBean id="myWeek" class="JavaClass.MyWeek"/>
    <jsp:setProperty name="myWeek" property="name" value="Khachig Kerbabian"/>
    <jsp:setProperty name="myWeek" property="workingDaysByNumber" value="5" />
    <%
        String daysString = "";
        String messag = "";
        for(int i = 0; i < myWeek.getNumberWorkingDays(); i++)
        {
            daysString += myWeek.getWorkingDays().get(i).toString() + ", ";
        }

        if(myWeek.getNumberWorkingDays() > myWeek.getNumberDays() - myWeek.getNumberWorkingDays())
            messag = "Good Job!";
        else
            messag = "This is far from ideal :(";


    %>

    <h1><jsp:getProperty name="myWeek" property="description"/></h1>
    <p>There are of course 7 days in the week</p>
    <p><jsp:getProperty name="myWeek" property="name"/>

        works on
        <%= daysString%>
        leaving two days to enjoy other things in life.</p>
    <p>That means <jsp:getProperty name="myWeek" property="name"/> is working
        <%=((double)myWeek.getNumberWorkingDays()  / (double)myWeek.getNumberDays()) * 100%>% of the time
    </p>

    <p>
        <%= messag %>
    </p>
</body>
</html>
