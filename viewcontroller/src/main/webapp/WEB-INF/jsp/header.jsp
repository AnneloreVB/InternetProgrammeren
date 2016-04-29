<%-- 
    Document   : header
    Created on : 12-apr-2016, 16:53:28
    Author     : Annelore pc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><spring:message code="index.h1" text="Grijze gids"/></h1>
        <nav> 
                <ul>
                    <li>
                        <a href="<c:url value="/index.htm"/>"> Home</a> 
                        
                    </li>
                    <li>
                        <a href="<c:url value="/person.htm"/>">Overzicht</a>  
                    </li>
                </ul>
            </nav>
    </body>
</html>
