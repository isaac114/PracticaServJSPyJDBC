package dao;

import mysql.JDBCAdministradorDAO;

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
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	 * EDITADO POR:ISAAC CHAVEZ
	 * AGREGAR PRODUCTO()
	 */
	
	
}
