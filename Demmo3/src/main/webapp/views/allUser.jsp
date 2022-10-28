<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>
	<table class="table">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>address</th>
			<th>salary</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="j" items="${user}" >
		 <tr>
			<td><c:out value="${j.e_id}" /></td>
			<td><c:out value="${j.e_name}" /></td>
			<td><c:out value="${j.e_add}" /></th>
			<td><c:out value="${j.e_salary}" /></th>
			<td><a class="btn btn-primary" href="Edit/${j.e_id}">Edit</a></td>
			<td><a class="btn btn-danger" href="Delete/${j.e_id}">Delete</a></td>
		</tr> 
		</c:forEach>
	</table>	
</body>
</html>