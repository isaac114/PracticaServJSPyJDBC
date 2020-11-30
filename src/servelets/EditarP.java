package servelets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.coyote.RequestGroupInfo;

import dao.DAOFactory;
import dao.ProductoDAO;
import modelo.Producto;

/**
 * Servlet implementation class EditarP
 */
@WebServlet("/EditarP")
public class EditarP extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String eid;
	String nombreP;
	String descripcion;
	String precio;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarP() {
        super();
        // TODO Auto-generated constructor stub
    }

	


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}




	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		eid = request.getParameter("eid");
		nombreP = request.getParameter("nombrep");
		descripcion = request.getParameter("descripcion");
		precio =  request.getParameter("precio");
		System.out.println("llegamos"+"----?"+eid+"----"+nombreP);
		ProductoDAO pdao = DAOFactory.getDAOFactory().getProductoDAO();
		Producto p = pdao.findProducto(nombreP, Integer.parseInt(eid));
		if(p != null) {
			pdao.update(p);
			System.out.println(p.getNombre()+"--"+p.getDescripcion()+"--"+p.getPrecio());
			RequestDispatcher rd = request.getRequestDispatcher("/JPSs/VentanaAdmin.jsp?eid="+eid);
			rd.forward(request, response);
		}
	}

}
