package modelo;

import java.io.Serializable;
import java.sql.Date;

public class Resultado implements Serializable{

	private static final long serialVersionUID = 1L;
	private int cabeceraID;
	private String fecha;
	private String estado;
	private String producto;
	
	
	
	
	
	public Resultado(int cabeceraID, String fecha, String estado, String producto) {
		super();
		this.cabeceraID = cabeceraID;
		this.fecha = fecha;
		this.estado = estado;
		this.producto = producto;
	}
	public int getCabeceraID() {
		return cabeceraID;
	}
	public void setCabeceraID(int cabeceraID) {
		this.cabeceraID = cabeceraID;
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
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	@Override
	public String toString() {
		return "Resultado [cabeceraID=" + cabeceraID + ", fecha=" + fecha + ", estado=" + estado + ", producto="
				+ producto + "]";
	}
	
	
	
	
	
	

}
