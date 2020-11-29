package dao;

import modelo.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario, Integer>{
	
	public abstract Usuario findUser(String correo, String password);
	
	public abstract void create(Usuario usuario);
	
}