package com.curso.productos.modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String idProducto;
    private String nombre;
    private BigDecimal precioUnitario;
    private String descripcion;
    private String fabricante;
    private String categoria;
    private long unidadesEnStock;
    private long unidadesEnPedido;
    private boolean disponible;
    private String condiciones;
    
	public Producto(String idProducto, String nombre, BigDecimal precioUnitario, String descripcion) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.descripcion = descripcion;
		this.fabricante = fabricante;
		this.categoria = categoria;
		this.unidadesEnStock = 500;
		this.unidadesEnPedido = unidadesEnPedido;
		this.disponible = disponible;
		this.condiciones = condiciones;
	}

	public Producto() {
		
	}

	
	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public long getUnidadesEnStock() {
		return unidadesEnStock;
	}

	public void setUnidadesEnStock(long unidadesEnStock) {
		this.unidadesEnStock = unidadesEnStock;
	}

	public long getUnidadesEnPedido() {
		return unidadesEnPedido;
	}

	public void setUnidadesEnPedido(long unidadesEnPedido) {
		this.unidadesEnPedido = unidadesEnPedido;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getCondiciones() {
		return condiciones;
	}

	public void setCondiciones(String condiciones) {
		this.condiciones = condiciones;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idProducto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(idProducto, other.idProducto);
	}

	@Override
	public String toString() {
		return "Producto: " + idProducto + ", nombre: " + nombre + ", PvP: " + precioUnitario
				+ ", Stock: " + unidadesEnStock + ", condiciones: " + condiciones ;
	}
    
    

}
