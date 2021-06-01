<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
	<h1>Home page</h1>
	
	<p>This is my first JSP!</p>
	
	<p>
		Hello
		<% // String name = "world"; %>
		<% String name = request.getParameter("name"); %>
		<%= name %>!
		
		${ param.name }
		${ param.age }
		
		<% String age = request.getParameter("age"); %>
		<% request.setAttribute("userAge", age); %>
		<%= request.getAttribute("userAge") %>
		${ userAge * 2 }
		
		<c:out value="${userAge * 3}">No age specified</c:out>
		
		<% if (Integer.parseInt((String) request.getAttribute("userAge")) > 18) { %>
			You're old!
		<% } %>
		
		<c:if test="${userAge > 18}">You're old!</c:if>
		
		<c:choose>
			<c:when test="${userAge > 18}">Adult</c:when>
			<c:when test="${userAge < 18}">Kid</c:when>
			<c:otherwise>You can vote!</c:otherwise>
		</c:choose>
		
		<% for (
				int i = 1;
				i <= Integer.parseInt((String) request.getAttribute("userAge"));
				i++
			) { %>
			<%= i %>
		<% } %>
		
		<c:forEach var="i" begin="1" end="${userAge}">
			${i}
		</c:forEach>
	</p>
</body>
</html>
