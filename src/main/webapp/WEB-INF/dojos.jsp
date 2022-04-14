<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crea un dojo</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h1>Nuevo Dojo</h1>
	<form:form action="/crear" method="POST" modelAttribute="dojo">
		<div class="form-group">
			<form:label path="name">Nombre del Dojo</form:label>
			<form:input path="name" cssClass="form-control"/>
			<form:errors path="name"/>
		</div>	
		<input type="submit" value="Enviar" class="btn btn-success">
	</form:form>
</body>
</html>