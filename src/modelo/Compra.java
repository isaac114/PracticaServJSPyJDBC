package modelo;

import java.io.Serializable;

public class Compra implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String fecha;
	private String estado;
	private int empresa_id;
	private int producto_id;
	
	public Compra() {
		//CONSTRUCTOR OBLIGATORIO. 
	}
	
	public Compra(int id, String fecha, String estado, int empresa_id, int producto_id) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.estado = estado;
		this.empresa_id = empresa_id;
		this.producto_id = producto_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getEmpresa_id() {
		return empresa_id;
	}

	public void setEmpresa_id(int empresa_id) {
		this.empresa_id = empresa_id;
	}

	public int getProducto_id() {
		return producto_id;
	}

	public void setProducto_id(int producto_id) {
		this.producto_id = producto_id;
	}

	@Override
	public String toString() {
		return "Compra [id=" + id + ", fecha=" + fecha + ", estado=" + estado + ", empresa_id=" + empresa_id
				+ ", producto_id=" + producto_id + "]";
	}
	
}