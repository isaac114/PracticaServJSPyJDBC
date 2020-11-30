package modelo;

import java.io.Serializable;

public class Producto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nombre;
	private String precio;
	private String descripcion;
	private Categoria categoria;
	private Empresa empresa;
	
	/*
	 * EDITADO POR: JORGE YELA VELEZ. 
	 */
	public Producto() {
		//CONSTRUCTOR OBLIGATORIO;
	}
	
	public Producto(int id, String nombre, String precio, String descripcion, Categoria categoria, Empresa empresa) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.empresa = empresa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion
				+ ", categoria=" + categoria + ", empresa=" + empresa + "]";
	}
	
	
	
	

}
