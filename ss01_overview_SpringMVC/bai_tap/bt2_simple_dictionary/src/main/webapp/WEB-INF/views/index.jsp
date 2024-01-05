
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<h1>Simple Dictionary</h1>
<form action="/translate">
    <table>
        <tr>
            <td><input type="radio" name="lang" value="Eng"> Eng-->VNamese</td>
            <td><input type="radio" name="lang" value="VN"> VNamese-->Eng</td>
        </tr>
        <tr>
            <td><input type="text" placeholder="enter the keyword" name="keyword" ></td>
            <td><input type="submit" value="Translate"></td>
        </tr>
    </table>
<span>${result}</span>
</form>


</body>
</html>
