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

<!--         <c:if test="${not empty movies}"> -->
            <c:forEach items="${strList}" var="strList">   
                ${strList}<br />
            </c:forEach> 
        <ul>
            <c:forEach var="listValue" items="${listReading}">
                  <li><c:out value="${listValue.strSchool}" /></li>
<!--                   <li>${channa}</li> -->
             </c:forEach>
        </ul>
<!--         </c:if> -->
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
