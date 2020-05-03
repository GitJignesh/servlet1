<%-- 
    Document   : Home
    Created on : Apr 1, 2020, 1:55:23 PM
    Author     : Jignesh
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>|| servlet1 ||</title>
        <script src="https://apis.google.com/js/api.js"></script>
    </head>

    <body>
        <div align="center">
            Hello From servlet1 Home Page.
        </div>


        <ul>
            <c:forEach var="listReading" items="${listReading}">
                  <li>Record Id: <c:out value="${listReading.intRecord_ID}" />&nbsp;
                      School:<c:out value="${listReading.strSchool}" />&nbsp;
                      Device:<c:out value="${listReading.intDevice}" />&nbsp;
                      DateTime:<c:out value="${listReading.strDateTime}" />&nbsp;
                      Temperature:<c:out value="${listReading.fltTemperature}" />&nbsp;
                      Humidity:<c:out value="${listReading.fltHumidity}" />&nbsp;
                      PM25:<c:out value="${listReading.intPM25}" />&nbsp;
                      PM10:<c:out value="${listReading.intPM10}" />&nbsp;
                      CO:<c:out value="${listReading.fltCO}" />&nbsp;
                  </li>
             </c:forEach>
        </ul>
        <br>
<!--         <ul>
            <c:forEach var="strList" items="${strList}">
                  <li><c:out value="${strList}" /></li>
             </c:forEach>
        </ul> -->
        
        
<!--         <br> Test Object
        <br>
        ${test}
        <br>
        -----------
        <br> -->
<!--         message
        <h1>This is sample error page : <c:out value="${message}"></c:out></h1> -->
    </body>
</html>
