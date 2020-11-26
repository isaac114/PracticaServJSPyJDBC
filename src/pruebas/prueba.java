package pruebas;

import modelo.Administrador;
import mysql.ContextJDBC;
import mysql.JDBCAdministradorDAO;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Administrador admin = new Administrador(1,"Eduardo Isaac","Chavez Chamorro","isaac.chavez.114@gmail.com","nokia53100",null,"0107317083");
		JDBCAdministradorDAO j = new JDBCAdministradorDAO();
		j.create(admin);
	}

}
