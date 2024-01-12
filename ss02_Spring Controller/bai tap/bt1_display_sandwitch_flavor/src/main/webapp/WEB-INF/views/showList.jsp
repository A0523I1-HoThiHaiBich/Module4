<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/12/2024
  Time: 8:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SandWich Flavor Display</title>
</head>
<body>
<p>Those are flavor that you selected:</p>
<c:forEach var="flavor" items="${list}">
    <c:out value="${flavor}"></c:out>
</c:forEach>
</body>
</html>
