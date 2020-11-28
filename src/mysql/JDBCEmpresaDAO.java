package mysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dao.EmpresaDAO;
import dao.GenericDAO;
import modelo.Administrador;
import modelo.Empresa;


public class JDBCEmpresaDAO extends JDBCGenericDAO<Empresa, Integer> implements EmpresaDAO{

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Empresa entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Empresa read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Empresa entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Empresa entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Empresa> find() {
		// TODO Auto-generated method stub
		return null;
	}

	public Empresa findEmpresa(String nombre) {
		Empresa emp = null;
		ResultSet rs = conexionUno.query("SELECT * FROM Empresa WHERE em_nombre LIKE "+nombre);
		try {
            if (rs != null && rs.next()) {
                int id = rs.getInt("em_id");
                String ruc =  rs.getString("em_ruc");
                String name = rs.getString("em_nombre");
                String direccion = rs.getString("em_direccion");
                emp = new Empresa(id, ruc, name, direccion);
                
            }
        } catch (SQLException e) {
            System.out.println(">>>WARNING (JDBCEmpresaDAO-->): " + e.getMessage());
        }
		
		return emp;
		
	}




}