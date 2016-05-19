<%-- 
    Document   : overviewPerson
    Created on : 25-feb-2016, 10:52:55
    Author     : Annelore pc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <jsp:include page="head.jsp"/>
    <body>
        <jsp:include page="header.jsp"/>
        <h2>Personen</h2>
        
            <table>
                <th></th>
                <th>Naam</th>
                <th>Voornaam</th>
                <th>Adres</th>
                    <c:forEach var="person" items="${persons}">
                    <tr>
                        <td>${person.rijksregistersnr}</td>
                        <td>${person.naam}</td>
                        <td>${person.voornaam}</td>
                        <td>${person.adres}<td>
                        <td><a href="<c:url value="/person/${person.rijksregistersnr}"/>"> edit</a></td>
                    </tr>
                    </c:forEach>
            </table>
        <form method ="GET" action="<c:url value="/person/new"/>">
            <input type="submit" value="New"/>
            </form>
    </body>
</html>
