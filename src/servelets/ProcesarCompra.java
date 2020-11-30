package servelets;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.*;
import modelo.*;

/**
 * Servlet implementation class ProcesarCompra
 */
@WebServlet("/ProcesarCompra")
public class ProcesarCompra extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String carrito;
	private Detalle detalle;
	private DetalleDAO detalleDao;
	private Cabecera cabecera;
	private CabeceraDAO cabeceraDao;
	private Date fecha;
	private Producto producto;
	private ProductoDAO productoDao;
	private List<Producto> listaProducto;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcesarCompra() {
        
    	cabeceraDao = DAOFactory.getDAOFactory().getCabeceraDAO();
    	cabecera = new Cabecera();
    	fecha = new Date();
    	detalleDao = DAOFactory.getDAOFactory().getDetalleDAO();
    	detalle = new Detalle();
    	productoDao = DAOFactory.getDAOFactory().getProductoDAO();
    	producto = new Producto();
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("ingreso al get");
		
		
		carrito = request.getParameter("carrito");
		
		String stringNew = carrito;
		String[] parts = stringNew.split(",");
		
		for(int i=1;i<=parts.length-1;i++) {
			System.out.println("item: " + parts[i]);
		}
		
		try {
			
			int codigoDual = 0;
			
			
			
			
			
			for(int i=1;i<=parts.length-1;i++) {
				cabecera.setId(codigoDual);
				cabecera.setFecha(fecha);
				cabecera.setEstado("E");
				cabeceraDao.create(cabecera);
				
				detalle.setId(0);
				detalle.setId_cabecera(codigoDual);
				//detalle.setId_producto(id_producto);
			}
			
			System.out.println("Compra cabecera registrada con exito !!");
			
		}catch(Exception e) {
			
			System.out.println("Error: " + e.getMessage());
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("ingreso al post");
		
	}

}
