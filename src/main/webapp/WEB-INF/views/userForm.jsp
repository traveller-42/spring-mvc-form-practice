<%--
  Created by IntelliJ IDEA.
  User: siamul
  Date: ১৪/৮/২১
  Time: ১০:৩০ AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Form For Name</title>
</head>
<body>
   <form:form action="${pageContext.request.contextPath}/users/add " modelAttribute="user">
        First Name : <form:input path="name"/>
       <br><br>
       <input type="submit" value="SUBMIT">
   </form:form>
</body>
</html>
