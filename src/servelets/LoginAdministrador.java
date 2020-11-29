package servelets;

import java.io.IOException; 

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdministradorDAO;
import dao.DAOFactory;
import modelo.Administrador;


@WebServlet("/LoginAdministrador")
public class LoginAdministrador extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public LoginAdministrador() {
        // TODO Auto-generated constructor stub
    }

	
	public void init() throws ServletException {
		System.out.println("El Servlet Login A comenzado");
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/public/login.html");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("correo");
		String contrasena = request.getParameter("contrasena");
		System.out.println("DATOS---->"+email+"---"+contrasena);
		
		AdministradorDAO adminDAO = DAOFactory.getDAOFactory().getAdminDAO();
		Administrador admin = adminDAO.findAdmin(email, contrasena);
		if(admin != null) {
			System.out.println("Inicio secion Administrador:"+admin.getNombre());
			RequestDispatcher rd;
			rd = request.getRequestDispatcher("/JPSs/VentanaAdmin.jsp");
			rd.forward(request, response);
			System.out.println("si pasa");
		}else {
			System.out.println("no entra");
		}
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

