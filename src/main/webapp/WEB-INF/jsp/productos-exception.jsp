<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<title>CRUD-PRODUCTOS</title>
</head>
<body>
	<div class="container">
		<header>
			<h1 class="alert alert-danger"> 
				 ${idProductoNoEncontrado}
				 ${claveMensaje }
			</h1>
			
		</header>
		<div class="row">
			<div class="col-6">
				<spring:url value="/negocio/articulos" var="volver"></spring:url>
				<a href="${volver}" class="btn btn-secondary">Volver</a>
			</div>
		</div>
	</div>
</body>
</html>