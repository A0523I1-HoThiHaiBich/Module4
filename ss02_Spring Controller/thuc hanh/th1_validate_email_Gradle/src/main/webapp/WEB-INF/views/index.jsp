<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Email Validation</h1>
<form action="validate">
    <input type="text" placeholder="Please enter the email to validate" name="email">
    <input type="submit" value=" Validate">
    <br>
    <span>${result}</span>
</form>
</body>
</html>