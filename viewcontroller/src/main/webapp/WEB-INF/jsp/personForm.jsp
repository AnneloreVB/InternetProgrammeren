<%-- 
    Document   : personForm
    Created on : 3-apr-2016, 14:20:20
    Author     : Annelore pc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="head.jsp"/>
    <body>
        <h1>Voeg persoon toe</h1>
        
        <form method="POST" action="<c:url value="/person.htm"/>">
            <p>
                <label>Rijksregistersnr</label>
                <input name="rijksregistersnr"  value="${person.rijksregistersnr}"/>
            </p>
            
            <p>
                <label>Naam</label>
                <input name="naam" value="${person.naam}">
            </p>
            <p>
                <label>Voornaam</label>
                <input name="voornaam" value="${person.voornaam}">
            </p>
            <p>
                <label>Straat</label>
                <input name="straat" value="${person.adres.straat}">
            </p>
             <p>
                <label>Huisnr</label>
                <input name="huisnr" value="${person.adres.huisnr}">
            </p>
            <p>
                <label>Bus</label>
                <input name="bus" value="${person.adres.bus}">
            </p>
            <p>
                <label>Postcode</label>
                <input name="postcode" value="${person.adres.postcode}">
            </p>
            <p>
                <label>Gemeente</label>
                <input name="gemeente" value="${person.adres.gemeente}">
            </p>
            <p>
                <input name="save" type="submit" value="save">
            </p>
        </form>
    </body>
</html>
