package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrarUsuario
 */
@WebServlet("/RegistrarUsuario")
public class RegistrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegistrarUsuario() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre;
		String apellido;
		String cedula;
		String empresa;
		String correo;
		String contrasena;
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Registro Usuario</title></head><body>");
		nombre = request.getParameter("nombre");
		out.println("<p><strong>Nombre: </strong>"+ nombre +"</p>");
		apellido = request.getParameter("apellido");
		out.println("<p><strong>Apellido: </strong>"+ apellido +"</p>");
		cedula = request.getParameter("cedula");
		out.println("<p><strong>Cedula: </strong>"+ cedula +"</p>");
		empresa = request.getParameter("empresa");
		out.println("<p><strong>Empresa: </strong>"+ empresa +"</p>");
		correo = request.getParameter("correo");
		out.println("<p><strong>Correo Electronico: </strong>"+ correo +"</p>");
		contrasena = request.getParameter("contrasena");
		
	}

}
