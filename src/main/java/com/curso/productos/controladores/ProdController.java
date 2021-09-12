package com.curso.productos.controladores;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.curso.productos.excepciones.ProductoException;
import com.curso.productos.modelos.Producto;
import com.curso.productos.repositorio.ProdRepositorioImpl;
import com.curso.productos.services.ProdService;

@Controller
@RequestMapping("negocio")
public class ProdController {
	@Autowired
	private ProdRepositorioImpl pri;
	
	@Autowired
	private ProdService ps;
	
	//CARGA DE TODOS LOS ARTICULOS
	@RequestMapping("/articulos")
	public String articulos(Model modelo) {
		modelo.addAttribute("productos", ps.cargarProductos());
		return "productos";
	}
	
	//Para ver un producto en especial
		@RequestMapping("/articulo/{idProducto}")
		public String ver(Model modelo, @PathVariable String idProducto) {
			Producto p = pri.obtenerProductoPorId(idProducto);
			modelo.addAttribute("producto", p);
			return "producto";
		}
		
		//ELIMINAR PRODUCTO
		@RequestMapping("/eliminar/{idProducto}")
		public String eliminar(@PathVariable String idProducto) {
			
			ps.eliminarProducto(idProducto);
			return "redirect:/negocio/articulos";
		}
		
		//Para editar un producto
		@RequestMapping("/editar/{idProducto}")
		public String editar(@PathVariable String idProducto, Model modelo) {
			Producto productoEditado = new Producto();
			productoEditado = pri.obtenerProductoPorId(idProducto);
			modelo.addAttribute("productoEditado", productoEditado);
			modelo.addAttribute("nombreP", productoEditado.getNombre());
			return "edit";
		}
		
		//Para tratar los datos del producto editado
		@RequestMapping(value = "/editar/{idProducto}", method = RequestMethod.POST)
		public String editar(@ModelAttribute ("productoEditado") @Valid Producto productoEditado, BindingResult br) {
			//BindingResult es para los errores
			if(br.hasErrors()) {
				System.out.println("Error, no se ha podido Editar el producto");
				return "redirect:/negocio/articulos";
			}
			ps.editarProducto(productoEditado);
			return "redirect:/negocio/articulos";	
			
		}
		
	//PARA IR AL FORMULARIO DE INSERCION DE DATOS
	@RequestMapping(value = "/nuevo", method = RequestMethod.GET)
	public String nuevo(Model modelo) {
		Producto nuevoProducto = new Producto();
		modelo.addAttribute("nuevoProducto", nuevoProducto);
		return "create";
	}
	
	//PARA TRATAR LOS DATOS
	@RequestMapping(value = "/nuevo", method = RequestMethod.POST)
	public String procesarNuevoProducto(@ModelAttribute ("nuevoProducto") @Valid Producto nuevoProducto, BindingResult br) {
		
		//BindingResult es para los errores
		if(br.hasErrors()) {
			System.out.println("Error, no se ha podido crear el producto");
			return "redirect:/negocio/nuevo";
		}
		ps.nuevoProducto(nuevoProducto);
		return "redirect:/negocio/articulos";	
	}
	
	//PARA GESTIONAR LAS EXCEPCIONES A LA HORA DE AÑADIR UN PRODUCTO
	//@ExceptionHandler(GestionProductoException.class)
	@ExceptionHandler(ProductoException.class)
	public ModelAndView handleError(HttpServletRequest req, ProductoException exception) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("idProductoNoEncontrado", exception.getIdProducto());
		mav.addObject("claveMensaje", exception.getMessage());
		mav.setViewName("productos-exception");
		return mav;
	}
	
	
	

}
