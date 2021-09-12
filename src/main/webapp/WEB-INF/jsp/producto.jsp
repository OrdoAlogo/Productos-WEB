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
<style>
header{
	background:grey;
	height:8vw;
}
h1{
 margin:0 auto; text-align:center; width:100%; color:white;
}
.producto{
	border-radius:5px; border:2px solid #2E4053; margin:0 auto; width:100%; ;
}
.prod p{
	text-align:justify;
	margin: 0 auto;
}
.fila{
	display:flex; flex-direction: row; justify-content:center; align-items:center;
}
.prod{
	width:100%;
}
</style>
<body>
<header>
	<h1>DETALLES DEL PRODUCTO</h1>
</header>
	<div class="container">
		
		<div class="row mt-5 fila">
			<div class="col-6">
				<div class="row producto">
					<div class="col-6 prod p-2">
						<h5>Producto: ${producto.idProducto}</h5>
						<h6>${producto.nombre}</h6>
						<p>${producto.descripcion}</p>
						<p class="btn btn-warning m-1">${producto.precioUnitario}</p>
						<p>Stock: ${producto.unidadesEnStock}</p>
					</div>
				</div>	
			</div>
		</div>
		<spring:url value="/negocio/articulos" var="volver"></spring:url>
			<a href="${volver}" class="btn btn-secondary m-3">Volver</a>
	</div>
</body>
</html>