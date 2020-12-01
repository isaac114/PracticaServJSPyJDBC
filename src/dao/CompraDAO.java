package dao;

import java.util.List;

import modelo.Compra;

public interface CompraDAO {

	public abstract Compra findUser(int id);
	
	public abstract void create(Compra compra);
	
	public abstract List<Compra> read(int id);
	
}