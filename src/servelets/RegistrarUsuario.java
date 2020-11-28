package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.DAOFactory;
import dao.UsuarioDAO;
import modelo.Usuario;

/**
 * Servlet implementation class RegistrarUsuario
 */
@WebServlet("/RegistrarUsuario")
public class RegistrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioDAO usuarioDao;
	private Usuario usuario;
	
    /**
     * Default constructor. 
     */
    public RegistrarUsuario() {
        
    	usuarioDao = DAOFactory.getDAOFactory().getUsuarioDAO();
    	usuario = new Usuario();
    	
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    	
    	int codigo_empresa;
    	
    	String empresa = request.getParameter("empresa");
    	if(empresa == "Papelesa") {
    		codigo_empresa = 1;
    	} else if(empresa == "Importsum") {
    		codigo_empresa = 2;
    	} else if(empresa == "Monsalve") {
    		codigo_empresa = 4;
    	} else {
    		codigo_empresa = 0;
    	}
    	
    	String url = null;
    	
    	try {
    		usuario.setNombres(request.getParameter("nombres"));
    		usuario.setApellidos(request.getParameter("apellido"));
    		usuario.setCedula(request.getParameter("cedula"));
    		usuario.setEmpresa(codigo_empresa);
    		usuario.setCorreo(request.getParameter("correo"));
    		usuario.setContrasena(request.getParameter("contrasena"));
    		usuario.setTipo_usuario("U");
    		usuarioDao.create(usuario);
    		System.out.println("User registrado en la base de datos !!");
    	}catch(Exception e) {
    		System.out.println("Error: " + e.getMessage());
    	}
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*String nombre;
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
		contrasena = request.getParameter("contrasena");*/
		
		int codigo_empresa;
    	
    	String empresa = request.getParameter("empresa");
    	if(empresa == "Papelesa") {
    		codigo_empresa = 1;
    	} else if(empresa == "Importsum") {
    		codigo_empresa = 2;
    	} else if(empresa == "Monsalve") {
    		codigo_empresa = 4;
    	} else {
    		codigo_empresa = 0;
    	}
    	
    	String url = null;
    	
    	try {
    		usuario.setNombres(request.getParameter("nombres"));
    		usuario.setApellidos(request.getParameter("apellido"));
    		usuario.setCedula(request.getParameter("cedula"));
    		usuario.setEmpresa(codigo_empresa);
    		usuario.setCorreo(request.getParameter("correo"));
    		usuario.setContrasena(request.getParameter("contrasena"));
    		usuario.setTipo_usuario("U");
    		usuarioDao.create(usuario);
    		System.out.println("User registrado en la base de datos !!");
    	}catch(Exception e) {
    		System.out.println("Error: " + e.getMessage());
    	}
		
	}

}
