<%-- 
    Document   : greeting
    Created on : Sep 2, 2014, 10:42:40 AM
    Author     : Ronnie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
        <p>
        <%
            
        Object obj = request.getAttribute("greeting");
        String string = null;

        if(obj == null) {
           string = "No name found.";
        } else {
            string = (String)obj;
        }
        
        out.print(request.getAttribute("greeting"));
        
            
            
            %>
    </body>
</html>
