package mysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dao.ProductoDAO;
import modelo.Administrador;
import modelo.Categoria;
import modelo.Empresa;
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
	
	public Producto findProducto(String nombre, int id) {
		Producto p = null;
		Empresa emp = new Empresa(0,"","","");
		Categoria cate = new Categoria(0,"");
		String sql = "SELECT * FROM producto WHERE pro_nombre LIKE '"+nombre+"' AND Empresa_em_id = "+id;
		ResultSet rs = conexionUno.query(sql);
		try {
			if (rs != null && rs.next()) {
                int idp = rs.getInt("pro_id");
                String nombrep = rs.getString("pro_nombre");
                String precio  =  rs.getString("pro_precio");
                String descripcion = rs.getString("pro_descripcion");
                int empresaid = rs.getInt("Empresa_em_id");
                int cateid = rs.getInt("Categoria_cat_id");
                emp.setId(empresaid);
                cate.setId(cateid);
                p = new Producto(idp, nombrep, precio, descripcion, cate, emp);
                
            }
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(">>>WARNING (JDBCPoducto:findProducto()): " + e.getMessage());
		}
		return p;
	}

	

}
