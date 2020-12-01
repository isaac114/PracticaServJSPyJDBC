package dao;

import java.util.List;

import modelo.Resultado;

public interface ResultadoDAO extends GenericDAO<Resultado, Integer>{
	
	public abstract List<Resultado> listarRequisitos(String empresaID);
	public abstract void editarEstado(int id, String estado);
}
