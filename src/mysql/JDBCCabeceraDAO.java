package mysql;

import java.sql.ResultSet;   
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dao.CabeceraDAO;
import modelo.Cabecera;

public class JDBCCabeceraDAO extends JDBCGenericDAO<Cabecera, Integer> implements CabeceraDAO {

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Cabecera cabecera) {
		
		try {
			System.out.println("Ha ingresado a JDBCUsuarioDAO");
			conexionUno.update("INSERT Usuarios VALUES (" + cabecera.getId() + ", '" 
					 + cabecera.getFecha() + "', '"
					 + cabecera.getEstado() + "')");
		} catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
