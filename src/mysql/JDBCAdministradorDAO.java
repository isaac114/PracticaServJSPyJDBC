package mysql;
import java.sql.ResultSet;
import java.sql.SQLException;
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

	public Administrador findAdmin(String correo, String contrasena) {
		Administrador admin = null;
		ResultSet rs = conexionUno.query("SELECT * FROM USUARIOS WHERE us_correo LIKE '"+correo+"' AND us_contrasena LIKE '"+contrasena+"'");
        try {
            if (rs != null && rs.next()) {
                int id = rs.getInt("us_id");
                String nombre = rs.getString("us_nombre");
                String apellido = rs.getString("us_apellidos");
                String cedula = rs.getString("us_cedula");
                String email = rs.getString("us_correo");
                String psw = rs.getString("us_contrasena");
                Administrador aux = new Administrador(id, nombre, apellido, email, psw, null, cedula);
                admin = aux;
                
            }
        } catch (SQLException e) {
            System.out.println(">>>WARNING (JDBCUserDAO:findAdministrador): " + e.getMessage());
        }
		return admin;
	}

}
