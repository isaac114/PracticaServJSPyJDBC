package servelets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDAO;
import dao.DAOFactory;
import modelo.Usuario;

/**
 * Servlet implementation class ComprobarUsuario
 */
@WebServlet("/ComprobarUsuario")
public class ComprobarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ComprobarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("correo");
		String contrasena = request.getParameter("contrasena");
		System.out.println("DATOS USUARIO LOGIN---->"+email+"---"+contrasena);
				
		UsuarioDAO userDAO = DAOFactory.getDAOFactory().getUsuarioDAO();
		Usuario user = userDAO.findUser(email, contrasena);
		
		if(user != null) {
			System.out.println("Inicio secion Usuario:"+user.getNombres());
						
			String tipo_user = user.getTipo_usuario();
			
			if(tipo_user.equals("U")) {
				
				System.out.println("El usuario " + user.getNombres() + " " + user.getApellidos() + ", es un usuario normal !!");
				response.sendRedirect("http://localhost:8080/PracticaServJSPyJDBC/JPSs/VentanaUsuario.jsp");
				
			} else if(tipo_user.equals("A")) {
				
				System.out.println("El usuario " + user.getNombres() + " " + user.getApellidos() + ", es administrador !!");
				response.sendRedirect("http://localhost:8080/PracticaServJSPyJDBC/JPSs/VentanaAdmin.jsp?eid="+user.getEmpresa());
				
			} else {
				
				System.out.println("Usuario no encontrado");
				response.sendRedirect("http://localhost:8080/PracticaServJSPyJDBC/public/login.html");
				
			}
			
		}else {
			
			System.out.println("no entra");
			
		}
		
	}

}
