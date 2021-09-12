<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
<title>CRUD-PRODUCTOS</title>
</head>
<style>
th,td{
	text-align:center;
}
header{
	background:grey;
	height:8vw;
}

</style>
<body>
<header>
		<h1 style="margin:0 auto; text-align:center; width:100%; color:white;">LISTADO DE PRODUCTOS</h1>
</header>
	<div class="container">
		<div class="row mt-5" style="display:flex;flex-direction:column; justify-content:center;align-items:center;">
			<div class="col-9">
				<table class="table table-hover table-bordered">
					<thead class="thead-dark">
						<tr>
							<th scope="row">ID</th>
							<th>Nombre</th>
							<th>PvP</th>
							<th>Stock</th>
							<th>Acciones</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${productos}" var="producto">
							<tr>
								<td>${producto.idProducto}</td>
								<td>${producto.nombre}</td>
								<td>${producto.precioUnitario}</td>
								<td>${producto.unidadesEnStock}</td>
								<td>
									<spring:url value="/pedidos/${producto.idProducto}/1" var="url"></spring:url>
									<a href="${url} " class="btn btn-success"> Pedir 1Ud</a>
									
									<spring:url value="/negocio/articulo/${producto.idProducto}" var="ver"></spring:url>
									<a href="${ver} " class="btn btn-info"> Ver</a>
									
									<spring:url value="/negocio/editar/${producto.idProducto}" var="editar"></spring:url>
									<a href="${editar} " class="btn btn-secondary"> Editar</a>
									
									<spring:url value="/negocio/eliminar/${producto.idProducto}" var="eliminar"></spring:url>
									<a href="${eliminar} " class="btn btn-danger">X</a>
								</td>
							</tr>
						</c:forEach>	
					</tbody>
				</table>
				
				<a href="/" class="btn btn-warning">Salir</a>
				<spring:url value="/negocio/nuevo" var="nuevo"></spring:url>
				<a href="${nuevo}" class="btn btn-info">Nuevo Producto</a>
				
			</div>
		</div>
	</div>
</body>
</html>