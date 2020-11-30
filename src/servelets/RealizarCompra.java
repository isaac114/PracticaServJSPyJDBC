package servelets;

import java.io.IOException; 
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.CabeceraDAO;
import modelo.Cabecera;
import modelo.Producto;
import modelo.Usuario;
import dao.DAOFactory;
import dao.ProductoDAO;
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
	private Producto producto;
	private ProductoDAO productoDao;
	private List<Producto> listaProducto;
       
    public RealizarCompra() {
        
    	cabeceraDao = DAOFactory.getDAOFactory().getCabeceraDAO();
    	cabecera = new Cabecera();
    	fecha = new Date();
    	usuarioDao = DAOFactory.getDAOFactory().getUsuarioDAO();
    	usuario = new Usuario();
    	productoDao = DAOFactory.getDAOFactory().getProductoDAO();
    	producto = new Producto();
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Ingresado al metodo de doGet de Realizar Compra : Servlet");
		
		String correo = request.getParameter("correo");
		String contra = request.getParameter("contra");
		
		String url = null;
		
		try {
			
			usuario = usuarioDao.findUser(correo, contra);
			//request.setAttribute("usuario", usuario);
			int codigo_empresa = usuario.getEmpresa();
			
			listaProducto = productoDao.buscarPorEmpresa(codigo_empresa);
			
			System.out.println("Tamaño de la lista: " + listaProducto.size());
			request.setAttribute("productos", listaProducto);
			
			//url = \"http://localhost:8080/PracticaServJSPyJDBC/JPSs/CompraProductos.jsp\;
			response.sendRedirect("http://localhost:8080/PracticaServJSPyJDBC/JPSs/CompraProductos.jsp");

			
		}catch(Exception e) {
			//url = "http://localhost:8080/PracticaServJSPyJDBC/JPSs/VentanaUsuario.jsp";
			System.out.println("Error: " + e.getMessage());
		}
		//getServletContext().getRequestDispatcher(url).forward(request, response);
		
	}

}
