<%-- 
    Document   : overviewPerson
    Created on : 25-feb-2016, 10:52:55
    Author     : Annelore pc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="head.jsp"/>
    <body>
        <jsp:include page="header.jsp"/>
        <h1>PersonOverview</h1>
        
            <table>
                <th>Rijksregisternr</th>
                <th>Naam</th>
                <th>Voornaam</th>
                <th>Adres</th>
                    <c:forEach var="person" items="${persons}">
                    <tr>
                        <td>${person.rijksregistersnr}</td>
                        <td>${person.naam}</td>
                        <td>${person.voornaam}</td>
                        <td>${person.adres}<td>
                        <td><a href="<c:url value="/person/${person.rijksregistersnr}.htm"/>"> edit</a></td>
                    </tr>
                    </c:forEach>
            </table>
        <form method ="GET" action="<c:url value="/person/new.htm"/>">
            <input type="submit" value="New"/>
            </form>
    </body>
</html>
