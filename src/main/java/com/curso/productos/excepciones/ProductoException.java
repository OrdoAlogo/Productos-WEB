package com.curso.productos.excepciones;

public class ProductoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 private String idProducto;
	 private String claveMensaje;

	   
	    public ProductoException(String idProducto, String claveMensaje) {
	        this.idProducto = idProducto;
	        this.claveMensaje = claveMensaje;
	    }
	    
	    public String getIdProducto() {
	        return idProducto;
	    }

	    public String getClaveMensaje() {
	        return claveMensaje;
	    }

}
