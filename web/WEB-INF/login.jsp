<%-- 
    Document   : login
    Created on : Feb 11, 2023, 5:57:33 PM
    Author     : nuket
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="post" action="loginPage">
            USERNAME:<input type="text" minlength="3" maxlength="30" name="username" value="${username}">
            PASSWORD:<input type="text" minlength="3" maxlenth="30" name="password" value="${password}">
            <input type="submit" value="SUBMIT">
        </form>
            <c:if test="${notfull==true}">
                <h3>Please enter a username and password</h3>
            </c:if>
        <c:if test="${logout==true}">
            <h3>You have successfully logged out</h3>
        </c:if>
        <c:if test="${incorrect==true}">
            <h3>Entered data does not match username or password for this site</h3>
        </c:if>
    </body>
</html>
