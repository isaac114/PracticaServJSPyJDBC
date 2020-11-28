package dao;


import modelo.Administrador;

public interface AdministradorDAO extends GenericDAO<Administrador, Integer> {

	public abstract Administrador findAdmin(String correo, String pass);
	
}
