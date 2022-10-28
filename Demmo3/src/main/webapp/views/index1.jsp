<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">  
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
		<h1>Home page</h1>
		<form action="upd" method="post">
			<input type="hidden" name="e_id" value="${ee.getE_id()}">
			<input type="text" name="e_name" placeholder="Enter ur name" value="${ee.getE_name()}">
			<br>
			<input type="text" name="e_add" placeholder="Enter ur address" value="${ee.getE_add()}">
			<br>
			<input type="text" name="e_salary" placeholder="Enter ur salary" value="${ee.getE_salary()}">
			<br>
			<input type="submit" value="submit">
		</form>
</body>
</html>