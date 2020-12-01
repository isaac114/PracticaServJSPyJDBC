package servelets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOFactory;
import dao.EmpresaDAO;
import dao.ProductoDAO;
import modelo.Empresa;
import modelo.Producto;

/**
 * Servlet implementation class BuscarProducto
 */
@WebServlet("/BuscarProducto")
public class BuscarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String eid = "";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/JPSs/BuscarProductoForm.jsp?eid="+eid);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nombre = request.getParameter("nombre");
		eid = request.getParameter("eid");
		System.out.println("Si pasa el parameter"+nombre+"--"+eid);
		ProductoDAO pdao = DAOFactory.getDAOFactory().getProductoDAO();
		Producto p = pdao.findProducto(nombre, Integer.parseInt(eid));
		
		if(p != null) {
			EmpresaDAO emdao = DAOFactory.getDAOFactory().getEmpresaDAO();
			Empresa em = emdao.findEmpresaID(p.getEmpresa().getId());
			request.setAttribute("empresa",em);
			request.setAttribute("producto", p);
			RequestDispatcher rd = request.getRequestDispatcher("/JPSs/MostrarProducto.jsp?eid="+eid);
			rd.forward(request, response);
			//response.sendRedirect("http://localhost:8080/PracticaServJSPyJDBC/JPSs/MostrarProducto.jsp?eid="+eid);
		}else{
			System.out.println("Sin productos");
		}
		
		//response.sendRedirect("http://localhost:8080/PracticaServJSPyJDBC/BuscarProducto?eid="+eid);
	}

}
