package modelo;

import java.io.Serializable;

public class Empresa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String ruc;
	private String nombre;
	private String direccion;
	
	public Empresa(int id, String ruc, String nombre, String direccion) {
		super();
		this.id = id;
		this.ruc = ruc;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", ruc=" + ruc + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	
	

}
