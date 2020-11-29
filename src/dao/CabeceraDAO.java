package dao;

import modelo.Cabecera;

public interface CabeceraDAO {
	
	public abstract Cabecera findUser(int id);
	
	public abstract void create(Cabecera cabecera);

}
