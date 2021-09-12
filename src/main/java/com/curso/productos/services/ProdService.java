package com.curso.productos.services;

import java.util.List;

import com.curso.productos.modelos.Producto;

public interface ProdService {
	
	List<Producto> cargarProductos();
	public void nuevoProducto(Producto nuevoProducto);
	public void eliminarProducto(String idProducto);
	public void editarProducto(Producto productoEditado);

}
