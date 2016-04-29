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
        
        <c:url var="url" value="/person.htm"/>
        <form:form action="${url}" method="POST" commandName="person">
            <p>
                <label><spring:message code="form.rijksregistersnr" text="Rijksregistersnr"/></label>
                <form:input path="rijksregistersnr" ></form:input>
                <form:errors path="rijksregistersnr"></form:errors>
            </p>
            
            <p>
                <label><spring:message code="form.naam" text="Naam"/></label>
                <form:input path="naam" ></form:input>
                <form:errors path="naam"></form:errors>
            </p>
            <p>
                <label><spring:message code="form.voornaam" text="Voornaam"/></label>
                <form:input path="voornaam" ></form:input>
                <form:errors path="voornaam"></form:errors>
            </p>
            <p>
                <label>Straat</label>
                <form:input path="adres.straat" ></form:input>
                
            </p>
             <p>
                <label>Huisnr</label>
                <form:input path="adres.huisnr" ></form:input>
                
            </p>
            <p>
                <label>Bus</label>
                <form:input path="adres.bus" ></form:input>
            </p>
            <p>
                <label>Postcode</label>
                <form:input path="adres.postcode" ></form:input>
                
            </p>
            <p>
                <label>Gemeente</label>
                <form:input path="adres.gemeente" ></form:input>
                
            </p>
            <p>
                <input name="save" type="submit" value="save">
            </p>
        </form:form>
    </body>
</html>
