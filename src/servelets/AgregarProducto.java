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
 * Servlet implementation class AgregarProducto
 */
@WebServlet(name = "AgregarProducto")
public class AgregarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarProducto() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    




	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("http://localhost:8080/PracticaServJSPyJDBC/JPSs/AgregarProducto.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre");
		String descripcion = request.getParameter("descripcion");
		String categoria = request.getParameter("cate");
		String empresa =  request.getParameter("empresa");
		String precio = request.getParameter("precio");
		ProductoDAO productoDAO = DAOFactory.getDAOFactory().getProductoDAO();
		Categoria cate = new Categoria(1,categoria);
		Empresa emp = new Empresa(1,"",empresa,null);
		Producto p = new Producto(0, nombre, precio, descripcion, cate, emp);
		System.out.println("Datos Producto:-->"+nombre+"-"+descripcion+"-"+categoria+"-"+precio);
		try {
			//productoDAO.create(p);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("AgregarProductoDAO--->"+e.getMessage());
		}
		
	}

}