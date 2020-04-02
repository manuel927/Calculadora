<%-- 
    Document   : calcjsp
    Created on : 17/03/2020, 11:45:39 AM
    Author     : manuel martinez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="calcservlet" method="POST">
            <input type="text" name="t1">
            <br>
            <br>
            <input type="text" name="t2">
            <br>
            <br>
             <input name="calcular" type="submit" value="ADD">
            <input name="calcular" type="submit" value="SUB">
            <input name="calcular" type="submit" value="MUL">
            <input name="calcular" type="submit" value="DIV">
        </form>
    </body>
</html>
