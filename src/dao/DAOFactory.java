
package dao;



public abstract class DAOFactory {
	
	protected static DAOFactory factory = new JDBCDAOFactory();
    
    public static DAOFactory getDAOFactory(){return factory;}
    
    public abstract void createTables();
    
    public abstract AdministradorDAO getAdminDAO();
    
    //EDITADO POR: JORGE YELA VELEZ.
    public abstract UsuarioDAO getUsuarioDAO();
    
    //EDITADO POR: JORGE YELA VELEZ.
    public abstract CabeceraDAO getCabeceraDAO();
    
    //EDITADO POR: JORGE YELA VELEZ. 
    public abstract DetalleDAO getDetalleDAO();
    
    /*
     *EDITADO POR: ISAAC CHAVEZ
     *METODO ABSTRACTO getProductoDAO() 
     */
    public abstract ProductoDAO getProductoDAO();
    
}
