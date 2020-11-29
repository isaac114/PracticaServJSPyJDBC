package mysql;

import java.sql.ResultSet; 
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dao.UsuarioDAO;
import modelo.Empresa;
import modelo.Usuario;

public class JDBCUsuarioDAO extends JDBCGenericDAO<Usuario, Integer> implements UsuarioDAO{

	@Override
	public void createTable() {
		conexionUno.update("DROP TABLE IF EXISTS Usuarios");
		conexionUno.update("CREATE TABLE Usuarios (" + "us_id INT(4) NOT NULL AUTO_INCREMENT, " 
													 + "us_nombre VARCHAR(100) NOT NULL, "
													 + "us_apellido VARCHAR(100) NOT NULL, "
													 + "us_cedula VARCHAR(10) NOT NULL, "
													 + "us_correo VARCHAR(100) NOT NULL, "
													 + "us_contrasena VARCHAR(45) NOT NULL, "
													 + "us_tipo_usuario CHAR(1) NOT NULL COMMENT 'A para AMIN y U para USUARIO'"
													 + "Empresa_em_id INT(4) NOT NULL, "
													 + "PRIMARY KEY (us_id), "
													 + "INDEX fk_Usuarios_Empresa1_idx (Empresa_em_id ASC) VISIBLE, "
													 + "CONSTRAINT fk_Usuarios_Empresa1"
													 + "FOREIGN KEY (Empresa_em_id)"
													 + "REFERENCES mydb.Empresa (em_id)" 
													 + ")");
		
	}

	@Override
	public void create(Usuario usuario) {
		
		try {
			System.out.println("Ha ingresado a JDBCUsuarioDAO");
			conexionUno.update("INSERT Usuarios VALUES (" + usuario.getId() + ", '" 
					 + usuario.getNombres() + "', '"
					 + usuario.getApellidos() + "', '" 
					 + usuario.getCedula() + "', '"
					 + usuario.getCorreo() + "', '"
					 + usuario.getContrasena() + "', '"
					 + usuario.getTipo_usuario() + "', '"
					 + usuario.getEmpresa() + "')");
		}catch(Exception e) {
			System.out.println("Ha ocurrido una excepcion en JDBCUsuarioDAO: " + e.getMessage());
		}
		
	}

	@Override
	public Usuario read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Usuario entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Usuario entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findUser(String correo, String password) {
		Usuario user = null;
		ResultSet rs = conexionUno.query("SELECT * FROM Usuarios WHERE us_correo LIKE "+"'"+correo+"'");
		try {
            if (rs != null && rs.next()) {
                int id = rs.getInt("us_id");
                String nombres =  rs.getString("us_nombre");
                String apellidos = rs.getString("us_apellidos");
                String cedula = rs.getString("us_cedula");
                String correoN = rs.getString("us_correo");
                String contrasena = rs.getString("us_contrasena");
                String tipo_usuario = rs.getString("us_tipo_usuario");
                int id_empresa = rs.getInt("Empresa_em_id");
                
                user = new Usuario(id, nombres, apellidos, cedula, correoN, contrasena, tipo_usuario, id_empresa);
                
            }
        } catch (SQLException e) {
            System.out.println(">>>WARNING (JDBCEmpresaDAO-->): " + e.getMessage());
        }
		
		return user;
	}

}
