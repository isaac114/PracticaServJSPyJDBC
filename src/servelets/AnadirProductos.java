package servelets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOFactory;
import dao.ProductoDAO;
import modelo.Categoria;
import modelo.Empresa;
import modelo.Producto;

/**
 * Servlet implementation class AnadirProductos
 */
@WebServlet("/AnadirProductos")
public class AnadirProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String eid = "";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnadirProductos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		eid = request.getParameter("eid");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/JPSs/agregarProducto.jsp?eid="+eid);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre");
		String precio  = request.getParameter("precio");
		String descripcion = request.getParameter("descripcion");
		String categoria = request.getParameter("cate");
		String empresa = request.getParameter("empresa");
		System.out.println("Datos dEL producto = "+nombre+"-"+precio+"-"+descripcion+"-"+categoria+"-"+empresa);
		Categoria cat = new Categoria(1,"");
		Empresa em = new Empresa(Integer.parseInt(eid), "", "", "");
		Producto pro = new Producto(0, nombre, precio, descripcion, cat, em);
		ProductoDAO productoDao = DAOFactory.getDAOFactory().getProductoDAO();
		productoDao.create(pro);
		response.sendRedirect("http://localhost:8080/PracticaServJSPyJDBC/AnadirProductos?eid="+eid);
		System.out.println("Se creo el Producto-->"+pro.getNombre());
	}

}
