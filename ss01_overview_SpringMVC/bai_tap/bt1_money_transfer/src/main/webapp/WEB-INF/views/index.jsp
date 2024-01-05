<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Transfer Money</title>
</head>
<body>
<h1>Transfer Money</h1>
<br/>
<form action="/transfer">
    <table>
        <tr>
            <td><input type="radio" name="currency" value="USD"> USD
                <input type="radio" name="currency" value="VND"> VND</td>
            <td><input type="number" name="input"></td>
        </tr>
        <tr>
            <td>Rate:</td>
            <td><input type="number" name="rate"></td>
        </tr>
        <tr>
            <input type="submit" value="transfer">
        </tr>
    </table>


</form>

</body>
</html>