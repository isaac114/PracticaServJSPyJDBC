package servelets;

import java.io.IOException;  
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Ingresando al metodo doPost de RegistrarUsuario : Servlet");
    	
    	int codigo_empresa;
    	
    	String empresa = request.getParameter("empresa");
    	if(empresa.equals("Papelesa")) {
    		codigo_empresa = 1;
    	} else if(empresa.equals("Importsum")) {
    		codigo_empresa = 2;
    	} else if(empresa.equals("Monsalve")) {
    		codigo_empresa = 4;
    	} else {
    		codigo_empresa = 0;
    	}
    	
    	String url = null;
    	
    	try {
    		
    		usuario.setId(0);
    		usuario.setNombres(request.getParameter("nombre"));
    		usuario.setApellidos(request.getParameter("apellido"));
    		usuario.setCedula(request.getParameter("cedula"));
    		usuario.setCorreo(request.getParameter("correo"));
    		usuario.setContrasena(request.getParameter("contrasena"));
    		usuario.setTipo_usuario("U");
    		usuario.setEmpresa(codigo_empresa);
    		usuarioDao.create(usuario);
    		
    		System.out.println("User registrado en la base de datos !!");
    		
    		response.getWriter().print("<html><head><title>Registro Usuario</title></head>"
    								 + "<body style=\"background-color: #575757;\">"
    								 + "<h2>Bienvenid@ " + usuario.getNombres() + " " + usuario.getApellidos() + ", es un gusto contar contigo.</h2>"
    								 + "<p>En nuestro sistema podras solicitar tus compras.</p>"
    								 + "<a href=\"http://localhost:8080/PracticaServJSPyJDBC/public/login.html\">"
    								 + "Para iniciar con tus requerimientos de compras, inicia sesion aqui !!</a>"
    								 + "</body>");
    		
    	}catch(Exception e) {
    		System.out.println("Error: " + e.getMessage());
    	}
		
	}

}
