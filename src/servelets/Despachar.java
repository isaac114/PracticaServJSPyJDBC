package servelets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import dao.DAOFactory;
import dao.ResultadoDAO;
import modelo.Resultado;

/**
 * Servlet implementation class Despachar
 */
@WebServlet("/Despachar")
public class Despachar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String eid = "";
	String cabecera = "";
	String bandera = "";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Despachar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		eid = request.getParameter("eid");
		cabecera = request.getParameter("cabecera");
		bandera = request.getParameter("bandera");
		//ArrayList<Resultado> rlist = new ArrayList<Resultado>();
		eid = request.getParameter("eid");
		System.out.println("ListarReqsGET--->"+eid+cabecera+bandera);
		ArrayList<Resultado> list = new ArrayList<Resultado>();
		ResultadoDAO rdao = DAOFactory.getDAOFactory().getResultadoDAO();
		list =(ArrayList<Resultado>)rdao.listarRequisitos(eid);
		if(list != null && bandera != null) {
			int d = Integer.parseInt(bandera);
			request.setAttribute("requisitos", list);
			if(d == 2) {
				System.out.println("aprueba Pedido --->"+cabecera);
				rdao.editarEstado(Integer.parseInt(cabecera), "A");
				
			}
			if(d == 1) {
				System.out.println("Rechaza Pedido --->"+cabecera);
				rdao.editarEstado(Integer.parseInt(cabecera), "R");
			}
		}
		getServletContext().getRequestDispatcher("/JPSs/Pedidos.jsp?eid="+eid).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("dddddddddddddd");
	}
	

}
