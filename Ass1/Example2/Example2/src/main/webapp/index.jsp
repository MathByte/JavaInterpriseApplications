<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>


<div style="align-content: center">
<form method="post" action="FormhandlerServlet">
    <table>
        <tr>
            <td>Please enter some text:</td>
            <td>
                <input type="text" name="enteredValue" id="enteredValue"/>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Submit"></td>
        </tr>
    </table>
</form>
</div>



</body>
</html>