/**
 * 
 */
package modelo;

import java.io.Serializable;

/**
 * @author Isaac Chavez
 *
 */
public class Administrador implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nombre;
	private String apellidos;
	private String correo;
	private String contrasena;
	private Empresa empresa;
	private String cedula;
	
	public Administrador(int id, String nombre, String apellidos, String correo, String contrasena, Empresa empresa,
			String cedula) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.contrasena = contrasena;
		this.empresa = empresa;
		this.cedula = cedula;
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
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	

	@Override
	public String toString() {
		return "Administrador [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo
				+ ", contrasena=" + contrasena + ", empresa=" + empresa + ", cedula=" + cedula + "]";
	}
	
	
	
	
	
	
	
	

}
