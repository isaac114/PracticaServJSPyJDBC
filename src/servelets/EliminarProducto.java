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
import modelo.Producto;

/**
 * Servlet implementation class EliminarProducto
 */
@WebServlet("/EliminarProducto")
public class EliminarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String eid = "";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		eid = request.getParameter("eid");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/JPSs/EliminarProducto.jsp?eid="+eid);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre");
		ProductoDAO pdao = DAOFactory.getDAOFactory().getProductoDAO();
		Producto p = new Producto(0,nombre,"","",null,null);
		p = pdao.findProducto(nombre, Integer.parseInt(eid));
		if(p != null) {
			pdao.delete(p);
			response.sendRedirect("http://localhost:8080/PracticaServJSPyJDBC/EliminarProducto?eid="+eid);
		}
	}

}
