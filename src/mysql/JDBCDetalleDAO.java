package mysql;

import java.sql.ResultSet;    
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dao.DetalleDAO;
import modelo.Detalle;
import modelo.Usuario;

public class JDBCDetalleDAO extends JDBCGenericDAO<Detalle, Integer> implements DetalleDAO{

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Detalle read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Detalle entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Detalle entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Detalle> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Detalle findUser(int id) {
		Detalle detalle = null;
		ResultSet rs = conexionUno.query("SELECT * FROM Compra_Detalle WHERE cd_id LIKE "+"'"+id+"'");
		try {
			if (rs != null && rs.next()) {
                int idN = rs.getInt("cd_id");
                int id_producto = rs.getInt("Producto_pro_id");
                int id_cabecera = rs.getInt("Compra_Cabecera_cc_id");
                
                detalle = new Detalle(idN, id_producto, id_cabecera);
                
            }
		} catch(SQLException e) {
			System.out.println(">>>WARNING (JDBCDetalleDAO-->): " + e.getMessage());
		}
		return detalle;
	}

	@Override
	public void create(Detalle detalle) {
		
		try {
			System.out.println("Ha ingresado a JDBCDetalleDAO");
			conexionUno.update("INSERT Compra_Detalle VALUES(" + detalle.getId() + ", '"
															   + detalle.getId_producto() + "', '"
															   + detalle.getId_cabecera() + "')");
		}catch(Exception e) {
			System.out.println("Ha ocurrido una excepcion en JDBCDetalleDAO: " + e.getMessage());
		}
		
	}

}
