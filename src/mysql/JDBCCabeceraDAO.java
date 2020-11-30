package mysql;

import java.sql.ResultSet;   
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import dao.CabeceraDAO;
import modelo.Cabecera;

public class JDBCCabeceraDAO extends JDBCGenericDAO<Cabecera, Integer> implements CabeceraDAO {

	@Override
	public void createTable() {
		conexionUno.update("DROP TABLE IF EXISTS Compra_Cabecera");
		conexionUno.update("CREATE TABLE Compra_Cabecera (" + "cc_id INT(4) NOT NULL AUTO_INCREMENT, "
															+ "cc_fecha DATE NOT NULL, "
															+ "cc_estado CHAR(1) NOT NULL, "
															+ "cc_empresa_id VARCHAR(3) NOT NULL,"
															+ "PRIMARY KEY (cc_id)"
															+ ")");
		
	}

	@Override
	public Cabecera read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Cabecera entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Cabecera entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cabecera> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cabecera findUser(int id) {
		Cabecera cbr = null;
		ResultSet rs = conexionUno.query("SELECT * FROM Compra_Cabecera WHERE cc_id LIKE "+"'"+id+"'");
		try {
			if(rs != null && rs.next()) {
				int idN = rs.getInt("cc_id");
				Date fecha = rs.getDate("cc_fecha");
				String estado = rs.getString("cc_estado");
				int id_empresa_N = rs.getInt("cc_empresa_id");
				
				cbr = new Cabecera(id,fecha,estado,id_empresa_N);
			}
		} catch(SQLException e) {
			System.out.println(">>>WARNING (JDBCCabeceraDAO-->): " + e.getMessage());
		}
		return cbr;
	}

	@Override
	public void create(Cabecera cabecera) {
		
		try {
			System.out.println("Ha ingresado a JDBCUsuarioDAO");
			conexionUno.update("INSERT Usuarios VALUES (" + cabecera.getId() + ", '" 
					 									  + cabecera.getFecha() + "', '"
					 									  + cabecera.getEstado() + "', "
					 									  + cabecera.getEmpresa_id() + ")");
		} catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
