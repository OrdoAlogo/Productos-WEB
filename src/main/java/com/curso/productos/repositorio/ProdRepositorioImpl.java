package com.curso.productos.repositorio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.curso.productos.modelos.Producto;
@Repository
public class ProdRepositorioImpl implements ProdRepositorio {

	private List<Producto> productos = new ArrayList<Producto>();
	
	public ProdRepositorioImpl() {
		productos.add(new Producto("P1234","iPhone 5s", new BigDecimal(500),"Apple iPhone 5s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera"));
		productos.add(new Producto("P1235","Dell Inspiron", new BigDecimal(700),"Dell Inspiron 14-inch Laptop (Black) with 3rd Generation Intel Core processors"));
		productos.add(new Producto("P1236","Nexus 7", new BigDecimal(300),"Google Nexus 7 is the lightest 7 inch tablet With a quad-core Qualcomm Snapdragon™ S4 Pro processor"));
	}
	@Override
	public List<Producto> cargarProductos() {
		
		return productos;
	}
	
	@Override
	public Producto obtenerProductoPorId(String idProducto) {
		Producto producto = null;
		for(Producto p:productos) {
			if(p != null && p.getIdProducto() != null && p.getIdProducto().equals(idProducto)) {
				producto = p;
				break;
			}
		}
		if(producto == null) {
			System.out.println("No se ha encontrado el producto: "+idProducto);
		}
		return producto;
	}
	
	@Override
	public Producto nuevoProducto(Producto nuevoProducto) {
		
		productos.add(nuevoProducto);
		
		return null;
	}
	@Override
	public void editarProducto(Producto productoEditado) {
		
		//int indice = productos.indexOf(productoEditado);
		
		productos.set(0, productoEditado);
		
	}
	

}
