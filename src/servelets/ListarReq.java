package servelets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOFactory;
import dao.ResultadoDAO;
import modelo.Resultado;

/**
 * Servlet implementation class ListarReq
 */
@WebServlet("/ListarReq")
public class ListarReq extends HttpServlet {
	private static final long serialVersionUID = 1L;
    String eid = "";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarReq() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		eid = request.getParameter("eid");
		System.out.println("ListarReqsGET--->"+eid);
		List<Resultado> list = new ArrayList<Resultado>();
		ResultadoDAO rdao = DAOFactory.getDAOFactory().getResultadoDAO();
		list =rdao.listarRequisitos(eid);
		if(list != null) {
			request.setAttribute("requisitos", list);
			getServletContext().getRequestDispatcher("/JPSs/ListarRequisitos.jsp?eid="+eid).forward(request, response);
		}
 	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
