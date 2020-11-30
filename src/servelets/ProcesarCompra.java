package servelets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Producto;

/**
 * Servlet implementation class ProcesarCompra
 */
@WebServlet("/ProcesarCompra")
public class ProcesarCompra extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String carrito;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcesarCompra() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("ingreso al get");
		
		
		carrito = request.getParameter("carrito");
		
		String stringNew = carrito;
		String[] parts = stringNew.split(",");
		
		for(int i=0;i<=parts.length-1;i++) {
			System.out.println("item: " + parts[i]);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("ingreso al post");
		
	}

}
