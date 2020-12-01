package mysql;

import java.sql.ResultSet;     
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import dao.CompraDAO;
import modelo.Compra;

public class JDBCCompraDAO extends JDBCGenericDAO<Compra, Integer> implements CompraDAO {

	@Override
	public void createTable() {
		conexionUno.update("DROP TABLE IF EXISTS Compra");
		conexionUno.update("CREATE TABLE Compra (" + "cc_id INT(4) NOT NULL AUTO_INCREMENT, "
												   + "cc_fecha VARCHAR(20) NOT NULL, "
												   + "cc_estado CHAR(1) NOT NULL, "
												   + "Empresa_em_id INT(4) NOT NULL,"
												   + "Producto_pro_id INT(4) NOT NULL,"
												   + "PRIMARY KEY (cc_id),"
												   + "INDEX `fk_Compra_Detalle_Producto1_idx` (`Producto_pro_id` ASC) VISIBLE,"
												   + "CONSTRAINT `fk_Compra_Detalle_Producto1`"
												   + "FOREIGN KEY (`Producto_pro_id`)"
												   + "REFERENCES `mydb`.`Producto` (`pro_id`)"
												   + ")");
		
	}

	@Override
	public Compra findUser(int id) {
		Compra cbr = null;
		ResultSet rs = conexionUno.query("SELECT * FROM Compra WHERE cc_id LIKE "+"'"+id+"'");
		try {
			if(rs != null && rs.next()) {
				int idN = rs.getInt("cc_id");
				String fecha = rs.getString("cc_fecha");
				String estado = rs.getString("cc_estado");
				int id_empresa_N = rs.getInt("Empresa_em_id");
				int id_producto = rs.getInt("Producto_pro_id");
				int id_usuario = rs.getInt("Usuario_us_id");
				
				cbr = new Compra(id,fecha,estado,id_empresa_N,id_producto,id_usuario);
			}
		} catch(SQLException e) {
			System.out.println(">>>WARNING (JDBCCabeceraDAO-->): " + e.getMessage());
		}
		return cbr;
	}

	@Override
	public void update(Compra entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Compra entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Compra compra) {
		
		try {
			System.out.println("Ha ingresado a JDBCUsuarioDAO");
			conexionUno.update("INSERT Compra VALUES (" + compra.getId() + ", '" 
					 									+ compra.getFecha() + "', '"
					 									+ compra.getEstado() + "', "
					 									+ compra.getEmpresa_id() + ", "
					 									+ compra.getProducto_id() + ", "
					 									+ compra.getUsuario_id() + ")");
		} catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

	@Override
	public Compra read(Integer id) {
		return null;
	}

	@Override
	public List<Compra> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compra busquedaU(String correo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compra> read(int id) {
		List<Compra> lista = new ArrayList<Compra>();
		ResultSet rs = conexionUno.query("SELECT * FROM Compra WHERE Usuario_us_id LIKE "+"'"+id+"'");
		try {
			while(rs.next()) {
				int idN = rs.getInt("cc_id");
				String fecha = rs.getString("cc_fecha");
				String estado = rs.getString("cc_estado");
				int id_empresa_N = rs.getInt("Empresa_em_id");
				int id_producto = rs.getInt("Producto_pro_id");
				int id_usuario = rs.getInt("Usuario_us_id");
				Compra miCompra = new Compra(idN,fecha,estado,id_empresa_N,id_producto,id_usuario);
				if(miCompra != null) {
					lista.add(miCompra);
				}
			}
		} catch(SQLException e) {
			System.out.println(">>>WARNING (JDBCCabeceraDAO-->): " + e.getMessage());
		}
		return lista;
	}

}
