package com.curso.productos.repositorio;

import java.util.List;

import com.curso.productos.modelos.Producto;

public interface ProdRepositorio {
	List<Producto> cargarProductos();
	Producto obtenerProductoPorId(String idProducto);
	Producto nuevoProducto(Producto nuevoProducto);
	public void editarProducto(Producto productoEditado);
	
}
