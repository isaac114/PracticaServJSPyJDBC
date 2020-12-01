package servelets;

import java.io.IOException;
import java.text.SimpleDateFormat;
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
	private Date fecha;
	private Producto producto;
	private ProductoDAO productoDao;
	private List<Producto> listaProducto;
	private Compra compra;
	private CompraDAO compraDao;
       
    public ProcesarCompra() {
        
    	fecha = new Date();
    	productoDao = DAOFactory.getDAOFactory().getProductoDAO();
    	producto = new Producto();
    	compraDao = DAOFactory.getDAOFactory().getCompraDAO();
    	compra = new Compra();
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("ingreso al get");
		
		
		carrito = request.getParameter("carrito");
		
		String stringNew = carrito;
		String[] parts = stringNew.split(",");
		
		try {
			
			for(int i=1;i<=parts.length-1;i++) {
				
				//BUSCAR ID PRODUCTO. 
				int codigo_producto_recuperado=0;
				int codigo_empresa_producto=0;
				
				producto = productoDao.buscarPorDescripcion(parts[i]);
				
				if(producto != null) {
					
					codigo_producto_recuperado = producto.getId();
					codigo_empresa_producto = producto.getEmpresa().getId();
					
					String MiFecha = new SimpleDateFormat("yyyy-MM-dd").format(fecha);
														
					//CREANDO COMPRA.
					compra.setId(0);
					compra.setFecha(MiFecha);
					compra.setEstado("E");
					compra.setEmpresa_id(codigo_empresa_producto);
					compra.setProducto_id(codigo_producto_recuperado);
					compraDao.create(compra);
					
					System.out.println("Compra registrada con existo, Servlet : ProcesarCompra.java");
					
				} else {
					
					System.out.println("Error al recuperar el producto, Servlet : ProcesarCompra.java");
					
				}
				
			}
			
		}catch(Exception e) {
			
			System.out.println("Error: " + e.getMessage());
			
		}
		
	}

}
