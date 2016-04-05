<%-- 
    Document   : personForm
    Created on : 3-apr-2016, 14:20:20
    Author     : Annelore pc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>personForm</title>
    </head>
    <body>
        <h1>Voeg persoon toe</h1>
        
        <form method="POST" action="<c:url value="/person.htm"/>">
            <input name="id" type="hidden" value="${person.rijksregistersnr}"/>
            <p>
                
            </p>
        </form>
    </body>
</html>
