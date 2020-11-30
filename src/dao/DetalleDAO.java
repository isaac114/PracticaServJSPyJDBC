package dao;

import modelo.Detalle;

public interface DetalleDAO extends GenericDAO<Detalle, Integer>{

	public abstract Detalle findUser(int id);
	
	public abstract void create(Detalle detalle);
	
}
