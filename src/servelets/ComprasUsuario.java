package servelets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.*;
import dao.*;

/**
 * Servlet implementation class ComprasUsuario
 */
@WebServlet("/ComprasUsuario")
public class ComprasUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario;
	private UsuarioDAO usuarioDao;
	private Compra compra;
	private CompraDAO compraDao;
	private List<Compra> listaCompra;
	
    public ComprasUsuario() {
        
    	usuario = new Usuario();
    	usuarioDao = DAOFactory.getDAOFactory().getUsuarioDAO();
    	compra = new Compra();
    	compraDao = DAOFactory.getDAOFactory().getCompraDAO();
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String correo = request.getParameter("correo");
		String contra = request.getParameter("contra");
		
		String url = null;
		
		try {
			
			usuario = usuarioDao.findUser(correo, contra);
			
			int codigo_usuario = usuario.getId();
			
			listaCompra = compraDao.read(codigo_usuario);
			
			request.setAttribute("compras", listaCompra);
			
			url = "/JPSs/MisCompras.jsp";
			
		}catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
