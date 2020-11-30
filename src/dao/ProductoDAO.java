package dao;

import java.util.List;

import modelo.Empresa;
import modelo.Producto;

public interface ProductoDAO extends GenericDAO<Producto, Integer> {

	public abstract Producto findProducto(String nombre, int id);
	public abstract List<Producto> buscarPorEmpresa(int id);

}
