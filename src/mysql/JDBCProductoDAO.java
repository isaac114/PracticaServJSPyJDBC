package mysql;

import java.util.List;

import dao.ProductoDAO;
import modelo.Producto;

public class JDBCProductoDAO extends JDBCGenericDAO<Producto, Integer> implements ProductoDAO {

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Producto producto) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Producto VALUES (NULL,'"+producto.getNombre()
			+"','"+producto.getPrecio()
			+"','"+producto.getDescripcion()
			+"',"+producto.getCategoria().getId()
			+","+producto.getEmpresa().getId()
			+")";
		conexionUno.update(sql);
	}

	@Override
	public Producto read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Producto entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Producto entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Producto> find() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
