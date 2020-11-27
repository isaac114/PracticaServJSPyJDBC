package pruebas;

import dao.AdministradorDAO;
import dao.DAOFactory;
import modelo.Administrador;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Administrador admin = new Administrador(1,"Eduardo Isaac","Chavez Chamorro","isaac.chavez.114@gmail.com","nokia53100",null,"0107317083");
		AdministradorDAO ad = DAOFactory.getDAOFactory().getAdminDAO();
		ad.createTable();
		ad.create(admin);
	}

}
