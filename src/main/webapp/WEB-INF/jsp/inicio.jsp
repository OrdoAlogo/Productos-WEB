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
			<h1 style="margin:0 auto; text-align:center; width:100%; margin-top:3%;">TIENDA ELECTRÓNICA BILBAO</h1>
		</header>
		<div class="row mt-5" style="display:flex;flex-direction:column; justify-content:center;align-items:center;">
			<div class="col-9">
				<spring:url value="/negocio/articulos" var="url"></spring:url>
				<a href="${url}" style="margin:0 auto; text-align:center; width:100%;"><h2>VER PRODUCTOS</h2></a>
			</div>
		</div>
	</div>
	
</body>
</html>