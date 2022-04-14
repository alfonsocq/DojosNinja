<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1><c:out value="${dojo.name}" /></h1>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Edad</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="masta" items="${dojo.ninjas}">
					<tr>
						<td><c:out value="${masta.getFirstName()}" /></td>
						<td><c:out value="${masta.getLastName() }" /></td>
						<td><c:out value="${masta.getAge() }" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>		
	</div>
</body>
</html>