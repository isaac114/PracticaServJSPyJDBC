package mysql;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.ResultadoDAO;
import modelo.Resultado;

public class JDBCResultadoDAO extends JDBCGenericDAO<Resultado, Integer> implements ResultadoDAO{

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Resultado entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Resultado read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Resultado entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Resultado entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Resultado> find() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Resultado> listarRequisitos(String empresaID) {
		// TODO Auto-generated method stub
		String sql = "Select c.cc_id,c.cc_fecha,c.cc_estado,p.pro_nombre from compra c, producto p WHERE c.Empresa_em_id="
				+ empresaID+" AND p.pro_id= c.Producto_pro_id";
		ResultSet rs = conexionUno.query(sql);
		List<Resultado> resulist = new ArrayList<Resultado>();
		try {
			while(rs.next()) {
				int cabeceraID = rs.getInt("cc_id");
				String fecha = rs.getString("cc_fecha");
				String estado = rs.getString("cc_estado");
				String producto = rs.getString("pro_nombre");
				System.out.println(cabeceraID+"--"+fecha+"--"+producto);
				Resultado resultado = new Resultado(cabeceraID,fecha,estado,producto);
				//System.out.println(""+producto);
				resulist.add(resultado);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return resulist;
	}

	@Override
	public Resultado busquedaU(String correo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void editarEstado(int id, String estado) {
		String sql = "UPDATE compra SET cc_estado='"+estado+"' WHERE cc_id="+id;
		conexionUno.update(sql);
	}

}
