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
import mysql.*;

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
    	
    	System.out.println("Ingresando al metodo doPost de RegistrarUsuario : Servlet");
    	
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
    		usuario.setId(0);
    		usuario.setNombres(request.getParameter("nombres"));
    		usuario.setApellidos(request.getParameter("apellido"));
    		usuario.setCedula(request.getParameter("cedula"));
    		usuario.setCorreo(request.getParameter("correo"));
    		usuario.setContrasena(request.getParameter("contrasena"));
    		usuario.setTipo_usuario("U");
    		usuario.setEmpresa(codigo_empresa);
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
		
		System.out.println("Ingresando al metodo doGet de RegistrarUsuario : Servlet");
    	
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
    		ContextJDBC conexion = new ContextJDBC();
    		conexion.connect();
    		usuario.setId(0);
    		usuario.setNombres(request.getParameter("nombres"));
    		usuario.setApellidos(request.getParameter("apellido"));
    		usuario.setCedula(request.getParameter("cedula"));
    		usuario.setCorreo(request.getParameter("correo"));
    		usuario.setContrasena(request.getParameter("contrasena"));
    		usuario.setTipo_usuario("U");
    		usuario.setEmpresa(codigo_empresa);
    		usuarioDao.create(usuario);
    		System.out.println("User registrado en la base de datos !!");
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
		
	}

}
