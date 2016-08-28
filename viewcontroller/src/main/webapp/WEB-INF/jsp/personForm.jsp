<%-- 
    Document   : personForm
    Created on : 3-apr-2016, 14:20:20
    Author     : Annelore pc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <jsp:include page="head.jsp"/>
    <body>
        <h2>Voeg persoon toe</h2>
        
        <form:form class="formulier" method="POST" action="new.htm" commandName="person">
            <p>
                <label for="rijksregistersnr"><spring:message code="form.rijksregistersnr" text="Rijksregistersnr"/></label>
                <form:input id="rijksregistersnr" path="rijksregistersnr" ></form:input>
                <form:errors class="error" path="rijksregistersnr"></form:errors>
            </p>
            
            <p>
                <label for="naam"><spring:message code="form.naam" text="Naam"/></label>
                <form:input id="naam" path="naam" ></form:input>
                <form:errors class="error" path="naam"></form:errors>
            </p>
            <p>
                <label for="voornaam"><spring:message code="form.voornaam" text="Voornaam"/></label>
                <form:input id="voornaam" path="voornaam" ></form:input>
                <form:errors class="error" path="voornaam"></form:errors>
            </p>
            <p>
                <label for="straat">Straat</label><!--TODO errors toevoegen-->
                <form:input id="straat" path="adres.straat" ></form:input>
                
            </p>
             <p>
                <label for="huisnr">Huisnr</label>
                <form:input id="huisnr" path="adres.huisnr" type="number"></form:input>
                
            </p>
            <p>
                <label for="bus">Bus</label>
                <form:input id="bus" path="adres.bus" ></form:input>
            </p>
            <p>
                <label for="postcode">Postcode</label>
                <form:input id="postcode" path="adres.postcode" type="number"></form:input>
                
            </p>
            <p>
                <label for="gemeente">Gemeente</label>
                <form:input id="gemeente" path="adres.gemeente" ></form:input>
                
            </p>
            <p>
                <input name="save" type="submit" value="save">
            </p>
        </form:form>
    </body>
</html>
