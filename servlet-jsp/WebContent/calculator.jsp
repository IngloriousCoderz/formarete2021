<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
</head>
<body>
	<h1>Calculator</h1>

	<form action="calculate" method="POST">
		<input type="number" name="num1" value="${param.num1 != null ? param.num1 : 0}" /><br/>
		<input type="number" name="num2" value="${param.num2 != null ? param.num2 : 0}" /><br/>
		<button type="submit">Sum</button>
	</form>

	<c:if test="${result != null}">
		<p>The sum of ${param.num1} and ${param.num2} is <strong>${result}</strong>.</p>
	</c:if>

	<c:if test="${error != null}">
		<p style="color:red;">${error}</p>
	</c:if>
</body>
</html>
