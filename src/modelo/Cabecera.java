package modelo;

import java.io.Serializable;
//import java.sql.Date;
import java.util.Date;

public class Cabecera implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private Date fecha;
	private String estado;
	private int empresa_id;
	
	public Cabecera() {
		//CONSTRUCTOR OBLIGATORIO. 
	}
	
	public Cabecera(int id, Date fache, String estado, int empresa_id) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.estado = estado;
		this.empresa_id = empresa_id;
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

	public int getEmpresa_id() {
		return empresa_id;
	}

	public void setEmpresa_id(int empresa_id) {
		this.empresa_id = empresa_id;
	}

	@Override
	public String toString() {
		return "Cabecera [id=" + id + ", fecha=" + fecha + ", estado=" + estado + ", empresa_id=" + empresa_id + "]";
	}

}
