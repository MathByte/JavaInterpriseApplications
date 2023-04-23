<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body style="text-align: center">
<h1><%= "Display Weekly Work!" %>
</h1>
<br/>
<a href="5dayswork.jsp">5 days of Work in a week!</a>
<br/><br/>
<a href="3dayswork.jsp">3 days of Work in a week!</a>
<br/>
<br/>
<form action="MyWeekServlet" method="get" >
    <input type="hidden" name="daysNumber" size="40" value="5">
    &nbsp;
    <input  type="submit" value="5 days of Work in a week! Servlet"/>
</form>

<br/>
<form action="MyWeekServlet" method="get">
    <input type="hidden" name="daysNumber" size="40" value="3">

    <input  type="submit" value="3 days of Work in a week! Servlet"/>
</form>


</body>
</html>