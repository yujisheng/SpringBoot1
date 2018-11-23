<%@ page language="java" pageEncoding="UTF-8" import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
<c:forEach items="${requestScope.users}" var="user" varStatus="sta">
    <span <c:if test="${sta.count%2==0}">style="color: red"</c:if>>${user.username}</span><br>
</c:forEach>
</body>
</html>
