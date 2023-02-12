<%-- 
    Document   : home
    Created on : Feb 11, 2023, 5:57:43 PM
    Author     : nuket
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Hello ${username.username}</h1>
        <form method="get" action="loginPage">
            <input type="submit" value="logout">
            <input type="hidden" name="action" value="reset">
        </form>
    </body>
</html>
