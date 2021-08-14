<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Hello world</title>
</head>
<body>
<%--<h1>Hello ${name}</h1>--%>
 <c:forEach items="${names}" var="name">
     <c:if test="${name=='SIAM'}">
         <h1>${name}</h1>
     </c:if>
     <c:choose>
         <c:when test="${name=='SIAM'}">
             <p>I am SIAM</p>
         </c:when>
         <c:otherwise>
             <p>This is not my name</p>
         </c:otherwise>
     </c:choose>
 </c:forEach>
</body>
</html>