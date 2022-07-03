<%-- 
    Document   : about
    Created on : Jun 29, 2022, 5:00:40 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page='views/layouts/head.jsp'>
            <jsp:param name="title" value="About Page" />
        </jsp:include>
    </head>
    <body>
        <jsp:include page='views/layouts/navbar.jsp'></jsp:include>
        <h1>About Page!</h1>
        <jsp:include page='views/layouts/footer.jsp'></jsp:include>
        <jsp:include page='views/layouts/scripts.jsp'></jsp:include>
    </body>
