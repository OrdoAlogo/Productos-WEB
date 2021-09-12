package com.curso.productos.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.productos.services.PedService;

@Controller
@RequestMapping("pedidos")
public class PedController {
		@Autowired 
		private PedService pedidoServ;
		//PEDIDO DE UN ARTICULO
		@RequestMapping("/{idProducto}/{cantidad}")
		public String pedido(@PathVariable String idProducto, @PathVariable String cantidad) {
			
			int cant = Integer.parseInt(cantidad);
			pedidoServ.comprar(idProducto, cant);
			return "redirect:/negocio/articulos";
		}
}
