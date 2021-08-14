<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Hello world</title>
</head>
<body>
<%--<h1>Hello ${name}</h1>--%>
 <c:forEach items="${users}" var="user">
     <h1>${user.name}</h1>
 </c:forEach>
</body>
</html>