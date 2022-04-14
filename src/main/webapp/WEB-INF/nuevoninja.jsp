<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nuevo Ninja</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<h1>Nuevo Ninja</h1>
    
	<form:form action="/create" method="POST" modelAttribute="ninja">
		<div class="form-group">
			<form:label path="dojo">Dojo</form:label>
			<form:select path="dojo" class="form-control">
				<c:forEach var="mydojo" items="${dojo}">
					<form:option value="${mydojo.id}"> ${mydojo.name} </form:option>
				</c:forEach>
			</form:select>
		</div>
		<div class="form-group">
			<form:label path="firstName">Nombre</form:label>
			<form:input path="firstName" cssClass="form-control"/>
			<form:errors path="firstName"/>
		</div>
		<div class="form-group">
			<form:label path="lastName">Apellido</form:label>
			<form:input path="lastName" cssClass="form-control"/>
			<form:errors path="lastName"/>
		</div>
		<div class="form-group">
			<form:label path="age">Edad</form:label>
			<form:input path="age" cssClass="form-control"/>
			<form:errors path="age"/>
		</div>
		
		
		
		<input type="submit" value="Enviar" class="btn btn-success">
	</form:form>

</body>
</html>