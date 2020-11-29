package modelo;

import java.io.Serializable;
//import java.sql.Date;
import java.util.Date;

public class Cabecera implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private Date fecha;
	private String estado;
	
	public Cabecera() {
		//CONSTRUCTOR OBLIGATORIO. 
	}
	
	public Cabecera(int id, Date fache, String estado) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cabecera [id=" + id + ", fecha=" + fecha + ", estado=" + estado + "]";
	}
	
}
