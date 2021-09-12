package com.curso.productos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.productos.modelos.Producto;
import com.curso.productos.repositorio.ProdRepositorio;

@Service
public class PedServiceImple implements PedService {

	@Autowired
	private ProdRepositorio pr;
	
	@Override
	public void comprar(String idP, int cant) {
		
		Producto producto = pr.obtenerProductoPorId(idP);
		if(producto.getUnidadesEnStock() < cant) {
			System.out.println("Producto agotado");
		}else {
			producto.setUnidadesEnStock(producto.getUnidadesEnStock() - cant);
		}

	}

}
