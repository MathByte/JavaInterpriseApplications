<%--
  Created by IntelliJ IDEA.
  User: khach
  Date: 1/31/2023
  Time: 10:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>5daysworkServlet</title>
</head>
<body style="text-align: center">
    <h1>${descriptionJSP}</h1>
    <p>There are of course 7 days in the week</p>
    <p>${nameJSP}

        works on
        ${DayString}
        leaving two days to enjoy other things in life.</p>
    <p>That means ${nameJSP} is working
        ${percentJSP}% of the time
    </p>

    <p>
        ${messageJSP}
    </p>
</body>
</html>
