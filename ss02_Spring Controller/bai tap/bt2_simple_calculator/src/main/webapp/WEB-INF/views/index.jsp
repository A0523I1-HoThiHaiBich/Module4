<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Simple Calculator</title>
</head>
<body>
<h1>Simple Calculator</h1>
<br/>
<form action="/calculate">
    <input type='number' name="firstNum" value="${firstNum}" >
    <input type="number" name="secondNum" value="${secondNum}" >
    <br>
    <input type="submit" name="function" value="add">
    <input type="submit" name="function" value="sub">
    <input type="submit" name="function" value="multi">
    <input type="submit" name="function" value="div">
</form>
<p>Result = ${result}</p>
</body>
</html>