
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <link rel="stylesheet" type="text/css" href="css/stylesheet1.css">
        
    </head>
    <body>
       <header>
        
            <nav>
                
                <ul>
                    <li>
                        <a href="<c:url value="/index.htm"/>" >Home</a> 
                    </li>
                    <li>
                        <a href="<c:url value="/overviewPerson.htm"/>">overview</a>  
                    </li>
                </ul>
            </nav>
        </header> 
    </body>
</html>
