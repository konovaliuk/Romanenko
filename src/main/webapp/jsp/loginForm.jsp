<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Victoria
  Date: 06.01.2018
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Taxi System - Login Page</title>
</head>
<body>
    <%--Login failed message ONLY if login failed--%>
    <c:if test="${!empty loginFailedMessage}">
        <h2>${loginFailedMessage}</h2>
    </c:if>

    <form action="/" method="post">
        <%--Login input field with value and predifined attribute username from command--%>
        <label for="login">Login:</label>
        <input id="login" type="text" name="login" value="${login}"/><br>

        <%--Password input field with label--%>
        <label for="password">Password:</label>
        <input id="password" type="password" name="password"/><br>

        <%--Command hidden attribute for resolving command which is invoked--%>
        <input type="hidden" name="command" value="login"/>

        <input type="submit" value="Log in"/>
    </form>
</body>
</html>
