package dao;

import modelo.Empresa;

public interface EmpresaDAO extends GenericDAO<Empresa, Integer> {
	
	public abstract Empresa findEmpresa(String nombre);
	
	public abstract Empresa findEmpresaID(int id);

}
