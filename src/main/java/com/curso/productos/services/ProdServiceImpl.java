package com.curso.productos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.productos.excepciones.ProductoException;
import com.curso.productos.modelos.Producto;
import com.curso.productos.repositorio.ProdRepositorio;

@Service
public class ProdServiceImpl implements ProdService {

	@Autowired
	private ProdRepositorio pr;
	
	@Override
	public List<Producto> cargarProductos() {
		
		return pr.cargarProductos();
	}

	@Override
	public void nuevoProducto(Producto nuevoProducto) {
		
		try {
			
			Producto p = pr.obtenerProductoPorId(nuevoProducto.getIdProducto());
			throw new ProductoException(nuevoProducto.getIdProducto(), " ERROR. ya existe");
		}
		catch(IllegalArgumentException e) {
			pr.nuevoProducto(nuevoProducto);
		}
			
	}

	@Override
	public void eliminarProducto(String idProducto) {
		
		Producto p = pr.obtenerProductoPorId(idProducto);
		List<Producto> productos = pr.cargarProductos();
		
		if(p != null) {
			
			productos.remove(p);
		}
		else {
			System.out.println("No se ha podido eliminar el Producto");
		}
		
	}

	@Override
	public void editarProducto(Producto productoEditado) {
		
		
		
	}

	

}
