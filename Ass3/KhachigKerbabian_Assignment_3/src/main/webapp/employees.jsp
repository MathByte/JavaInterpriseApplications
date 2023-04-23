<%--
  Created by IntelliJ IDEA.
  User: khach
  Date: 2/8/2023
  Time: 11:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="myBean" class="com.kerbabian.khachigkerbabian_assignment_3.DataBaseConnection.DBUtil" />

    <%String [] rows = myBean.getAllDatas().split("\n");%>
    <%for(int i = 0; i < rows.length; i++){%>
    <h2><%= rows[i] %></h2>
    <%}%>


</body>
</html>
