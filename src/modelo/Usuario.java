package modelo;

import java.io.Serializable;

public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nombres;
	private String apellidos;
	private String cedula;
	private String correo;
	private String contrasena;
	private String tipo_usuario;
	private int empresa;
	
	public Usuario() {
		//CONSTRUCTOR OBLIGATORIO. 
	}
	
	public Usuario(int id, String nombres, String apellidos, String cedula, String correo, String contrasena, String tipo_usuario, int empresa) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.correo = correo;
		this.contrasena = contrasena;
		this.tipo_usuario = tipo_usuario;
		this.empresa = empresa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public int getEmpresa() {
		return empresa;
	}

	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombres=" + nombres + ", apillidos=" + apellidos + ", cedula=" + cedula
				+ ", correo=" + correo + ", contrasena=" + contrasena + ", tipo_usuario=" + tipo_usuario + ", empresa="
				+ empresa + "]";
	}
	
}