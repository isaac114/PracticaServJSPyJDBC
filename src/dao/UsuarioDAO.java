package dao;

import modelo.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario, Integer>{
	
	public abstract Usuario findUser(int id, String nombres, String apellidos, String cedula, String correo, String contrasena, String tipo_usuario, int empresa);
	
	public abstract void create(Usuario usuario);
	
}