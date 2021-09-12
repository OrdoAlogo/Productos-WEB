<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
.fila{
	width:70%; display:flex; flex-direction:column; justify-content:center; align-items:center;
}
.contenedor{
	 display:flex; flex-direction:column; justify-content:center; align-items:center;
}

</style>
<body>
<header>
	<h1>EDITAR ${nombreP}</h1>
</header>
	<div class="container contenedor">
		
		<div class="row fila">
			<div class="col-6">
				     <form:form  method="POST"  modelAttribute="productoEditado" class="form-horizontal"> 
		               
		                    
		                    <div class="form-group">
		                    	
		                    		<label> Id Producto</label>                       	
		                            <form:input id="id" path="idProducto" value="${idProducto}" type="text" class="form-control"/>  
		                           
		                    </div>
		                    <div class="form-group">                                            
		                       
		                         	<label>Nombre</label>
		                            <form:input id="nombre" path="nombre" value="${nombre}" type="text" class="form-control"/> 
	
		                    </div>		
		                    <div class="form-group"> 		                       
		                        
		                         <label >Descripción</label> 
		                            <form:textarea id="descripcion" path="descripcion" value="${descripcion}" rows = "2" class="form-control"/> 
		                         
		                    </div> 
		                    <div class="form-group"> 	                        
		                       
		                        	<label>Precio Unitario</label>  
		                            <form:input id="preciUnit" path="precioUnitario" value="${precioUnitario}"   type="text" class="form-control"/> 
		                       
		                   	
		                    </div> 
		                    <div class="form-group"> 		                        
		                        
		                        	<label>Fabricante </label> 
		                            <form:input id="fabricante" path="fabricante"  value="${fabricante}" type="text" class="form-control"/> 
		                       
		                    </div>
		                    
		                    <div class="form-group"> 	                         
		                       
		                        <label>Categoría</label>
		                            <form:input id="categoria" path="categoria" value="${categoria}" type="text" class="form-control"/> 
		                       
		                    </div>
		                    <div class="form-group"> 	                        
		                       
		                        	<label>Unidades en Stock</label> 
		                            <form:input id="unidadesEnStock" path="unidadesEnStock" value="${unidadesEnStock}" type="number" class="form-control"/> 
		                       
		                    </div>
		                    <div class="form-group"> 
		                        
		                        	<label>Unidades en Pedido</label>
		                            <form:input id="unidadesEnPedido" path="unidadesEnPedido" value="${unidadesEnPedido}"  type="number" class="form-control"/> 
		                       
		                    </div>		
		                    <div class="form-group">
		                    	
		                    		<label>Disponible</label>
		                    		 <form:checkbox  id="disponible" value="${disponible}" path="disponible"/>
		                    	
		                    </div> 
							
		                    <div class="form-group"> 
		                    
		                    		<label>Estado</label>
		                    		<form:radiobutton path="condiciones" 
		                                              value="Nuevo" />Nuevo
		                            <form:radiobutton path="condiciones" 
		                                              value="Viejo" />Viejo  
		                            <form:radiobutton path="condiciones" 
		                                              value="Renovado" />Renovado 
		                    		             
		                    </div> 	
		                    <div class="form-group mt-3"> 	                         
		                        <input type="submit" id="btnCrear" class="btn btn-success" value ="GUARDAR"/> 
		                    </div> 
		               
		            </form:form>
			</div>
			
		</div>
		<spring:url value="/negocio/articulos" var="volver"></spring:url>
		<a href="${volver}" class="btn btn-secondary mb-5">Volver</a>
	</div>
</body>
</html>