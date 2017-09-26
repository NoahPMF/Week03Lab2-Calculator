<%-- 
    Document   : index
    Created on : Sep 26, 2017, 1:57:46 PM
    Author     : NoahFerrier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>calculator</title>
    </head>
    <body>
        <h1>Simple Calculator</h1>
                <form action="Index" method="post">
            First: <input type="text" name="first"><br/>
            Second: <input type="text" name="second"><br/>
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-"> 
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%">
        </form>
        <br>${message}
    </body>
</html>
