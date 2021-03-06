
package dao;



public abstract class DAOFactory {
	
	protected static DAOFactory factory = new JDBCDAOFactory();
    
    public static DAOFactory getDAOFactory(){return factory;}
    
    public abstract void createTables();
    
    public abstract AdministradorDAO getAdminDAO();
    
    //EDITADO POR: JORGE YELA VELEZ. 
    public abstract CompraDAO getCompraDAO();
    
    //EDITADO POR: JORGE YELA VELEZ.
    public abstract UsuarioDAO getUsuarioDAO();
    
    /*
     *EDITADO POR: ISAAC CHAVEZ
     *METODO ABSTRACTO getProductoDAO() 
     */
    public abstract ProductoDAO getProductoDAO();
    
    public abstract EmpresaDAO getEmpresaDAO();
    
    public abstract ResultadoDAO getResultadoDAO();
    
}
