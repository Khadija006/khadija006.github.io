<%-- 
    Document   : login-success
    Created on : Jan 25, 2017, 1:08:21 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> JSP Page</title>
    </head>
    <body>
       <p>You are successfully logged in!</p>  
<%  
     controller bean=(controller)request.getAttribute("bean");  
     out.print("Welcome");  
%>  
    </body>
</html>
