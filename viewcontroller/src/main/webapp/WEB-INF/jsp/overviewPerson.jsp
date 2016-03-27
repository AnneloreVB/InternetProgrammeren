<%-- 
    Document   : overviewPerson
    Created on : 25-feb-2016, 10:52:55
    Author     : Annelore pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <h1>PersonOverview</h1>
        <form method ="get" action="editPerson.htm">
            <table>
                <th>Rijksregisternr</th>
                <th>Naam</th>
                <th>Voornaam</th>
                <th>Adres</th>
                    <c:forEach var="Person" items="${Persons}">
                    <tr>
                        <td>${Person.naam}</td>
                        <td>${Person.voornaam}</td>
                        <td>${Person.adres}<td>
                        <td><a href="editPerson.do?id=${Person.rijksregistersnr}"> edit</a></td>
                    </tr>
                    </c:forEach>
            </table>
        </form>
    </body>
</html>
