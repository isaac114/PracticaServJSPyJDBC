package modelo;

import java.io.Serializable;

public class Detalle implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private int id_producto;
	private int id_cabecera;
	
	public Detalle() {
		//CONSTRUCTOR OBLIGATORIO;
	}
	
	public Detalle(int id, int id_producto, int id_cabecera) {
		super();
		this.id = id;
		this.id_producto = id_producto;
		this.id_cabecera = id_cabecera;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public int getId_cabecera() {
		return id_cabecera;
	}

	public void setId_cabecera(int id_cabecera) {
		this.id_cabecera = id_cabecera;
	}

	@Override
	public String toString() {
		return "Detalle [id=" + id + ", id_producto=" + id_producto + ", id_cabecera=" + id_cabecera + "]";
	}
	
}
