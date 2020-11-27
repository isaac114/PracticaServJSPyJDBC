package mysql;
import java.util.List;

import dao.AdministradorDAO;
import modelo.Administrador;

public class JDBCAdministradorDAO extends JDBCGenericDAO<Administrador, Integer> implements AdministradorDAO{

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Administrador admin) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Usuarios VALUES(NULL,'"+admin.getNombre()+"','"+admin.getApellidos()+"','"+admin.getCedula()+"','"
				+admin.getCorreo()+"','"+admin.getContrasena()+"','"+"A',"+1
				+ ")";
		conexionUno.update(sql);
		
	}

	@Override
	public Administrador read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Administrador entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Administrador entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Administrador> find() {
		// TODO Auto-generated method stub
		return null;
	}

}
