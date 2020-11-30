package servelets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.CabeceraDAO;
import modelo.Cabecera;
import modelo.Usuario;
import dao.DAOFactory;
import dao.UsuarioDAO;

/**
 * Servlet implementation class RealizarCompra
 */
@WebServlet("/RealizarCompra")
public class RealizarCompra extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	java.util.Date fecha;
	private CabeceraDAO cabeceraDao;
	private Cabecera cabecera;
	private Usuario usuario;
	private UsuarioDAO usuarioDao;
       
    public RealizarCompra() {
        
    	cabeceraDao = DAOFactory.getDAOFactory().getCabeceraDAO();
    	cabecera = new Cabecera();
    	fecha = new Date();
    	usuarioDao = DAOFactory.getDAOFactory().getUsuarioDAO();
    	usuario = new Usuario();
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Ingresado al metodo de doGet de Realizar Compra : Servlet");
		
		String correo = request.getParameter("correo");
		String contra = request.getParameter("contra");
		
		try {
			usuario = usuarioDao.findUser(correo, contra);
			//request.setAttribute("usuario", usuario);
			System.out.println("La empresa del usuario es: " + usuario.getEmpresa());
		}catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
