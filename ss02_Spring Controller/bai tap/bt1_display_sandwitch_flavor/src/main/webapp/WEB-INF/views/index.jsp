<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sandwich Flavor display</title>
</head>
<body>
<h1>Sandwich Condiments
</h1>
<form action="/display">
    <input type="checkbox" name="flavor" value="Lettuce">Lettuce
    <input type="checkbox" name="flavor" value="Tomato">Tomato
    <input type="checkbox" name="flavor" value="Mustard">Mustard
    <input type="checkbox" name="flavor" value="Sprouts">Sprouts
    <hr>
    <input type="submit" name="save">
</form>
</body>
</html>