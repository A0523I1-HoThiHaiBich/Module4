<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1>Show time of City</h1>
<br/>
<span>Current time in ${city}: <strong>${date}</strong></span>
<form action="showTime">
  <select name="city" onchange="document.getElementById('locale').submit()">
    <option value="Asia/Ho_Chi_Minh" selected>Select a city</option>
    <option value="Asia/Ho_Chi_Minh">Ho Chi Minh</option>
    <option value="Singapore">Singapore</option>
    <option value="Asia/Hong_Kong">Hong Kong</option>
    <option value="Asia/Tokyo">Tokyo</option>
    <option value="Asia/Seoul">Seoul</option>
    <option value="Europe/London">London</option>
    <option value="Europe/Madrid">Madrid</option>
    <option value="America/New_York">New York</option>
    <option value="Australia/Sydney">Sydney</option>
    <option value="Argentina/Buenos_Aires">Buenos Aires</option>
  </select>
</form>
</body>
</html>