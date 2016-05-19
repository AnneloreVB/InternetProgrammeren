<%-- 
    Document   : header
    Created on : 12-apr-2016, 16:53:28
    Author     : Annelore pc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><spring:message code="index.h1" /></h1>
        <nav> 
                <ul>
                    <li>
                        <a href="<c:url value="/"/>"> Home</a> 
                        
                    </li>
                    <li>
                        <a href="<c:url value="/person"/>">Overzicht</a>  
                    </li>
                    <li>
                         <a href="<c:url value="?lang=en"/>">English</a>
                    </li>
                    <li>
                        <a href="<c:url value="?lang=nl"/>">Nederlands</a>
                    </li>
                </ul>
            </nav>
    </body>
</html>
