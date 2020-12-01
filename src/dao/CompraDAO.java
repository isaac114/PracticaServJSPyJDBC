package dao;

import modelo.Compra;

public interface CompraDAO {

	public abstract Compra findUser(int id);
	
	public abstract void create(Compra compra);
	
}