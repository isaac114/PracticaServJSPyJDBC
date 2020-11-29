package servelets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.CabeceraDAO;
import modelo.Cabecera;
import dao.DAOFactory;

/**
 * Servlet implementation class RealizarCompra
 */
@WebServlet("/RealizarCompra")
public class RealizarCompra extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	java.util.Date fecha;
	private CabeceraDAO cabeceraDao;
	private Cabecera cabecera;
       
    public RealizarCompra() {
        
    	cabeceraDao = DAOFactory.getDAOFactory().getCabeceraDAO();
    	cabecera = new Cabecera();
    	fecha = new Date();
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Ingresado al metodo de doGet de Realizar Compra : Servlet");
		
		try {
			
			cabecera.setId(0);
			cabecera.setFecha(fecha);
			cabecera.setEstado("E");
			
			
		} catch(Exception e) {
			
			System.out.println("Error: " + e.getMessage());
			
		}
		
	}

}
