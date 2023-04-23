<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <title>Account Service</title>
</head>
<body>
<h1><%= "Account Service" %>
</h1>
<br/>
<br/>
<form name="myForm" action="AccountServlet" method="post">
    Select your choice :
    <input type="radio" name="choice" value="Deposit" />Deposit
    <input type="radio" name="choice" value="Withdraw" />Withdraw
    <br/><br/>

    Enter Amount: <input type = "text" name = "amount" />
    <br/><br/>

    <input type="submit" value="Submit"></input> | <input type="reset" value="Reset" ></input>

    <br/><br/>

    <p>The Balance is : ${balance} </p>
</form>

</body>
</html>

