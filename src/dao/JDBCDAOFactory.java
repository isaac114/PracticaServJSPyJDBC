package dao;

import modelo.Empresa;
import mysql.JDBCAdministradorDAO;
import mysql.JDBCCabeceraDAO;
import mysql.JDBCDetalleDAO;
import mysql.JDBCEmpresaDAO;
import mysql.JDBCProductoDAO;
import mysql.JDBCUsuarioDAO;

public  class JDBCDAOFactory extends DAOFactory {

	@Override
	public void createTables() {
		// TODO Auto-generated method stub
		this.getAdminDAO().createTable();
		
	}

	@Override
	public AdministradorDAO getAdminDAO() {
		// TODO Auto-generated method stub
		return new JDBCAdministradorDAO();
	}

	@Override
	public UsuarioDAO getUsuarioDAO() {
		/*
		 * EDITADO POR: JORGE YELA VELEZ.
		 */
		return new JDBCUsuarioDAO();
	}

	/*
	 * EDITADO POR:ISAAC CHAVEZ
	 * AGREGAR PRODUCTO()
	 */
	
	@Override
	public ProductoDAO getProductoDAO() {
		// TODO Auto-generated method stub
		return 	new JDBCProductoDAO();
	}

	@Override
	public CabeceraDAO getCabeceraDAO() {
		// TODO Auto-generated method stub
		return new JDBCCabeceraDAO();
	}

	@Override
	public EmpresaDAO getEmpresaDAO() {
		// TODO Auto-generated method stub
		return new JDBCEmpresaDAO();
	}

	@Override
	public DetalleDAO getDetalleDAO() {
		// TODO Auto-generated method stub
		return new JDBCDetalleDAO();
	}
	
	
	
	
	
	
}
