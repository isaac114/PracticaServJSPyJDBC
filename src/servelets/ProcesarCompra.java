package servelets;

import java.io.IOException;
import java.io.PrintWriter;
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
	private Usuario user;
	private UsuarioDAO userDao;
       
    public ProcesarCompra() {
        
    	fecha = new Date();
    	productoDao = DAOFactory.getDAOFactory().getProductoDAO();
    	producto = new Producto();
    	compraDao = DAOFactory.getDAOFactory().getCompraDAO();
    	compra = new Compra();
    	userDao = DAOFactory.getDAOFactory().getUsuarioDAO();
    	user = new Usuario();
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("ingreso al get");
		
		
		carrito = request.getParameter("carrito");
		
		String stringNew = carrito;
		String[] parts = stringNew.split(",");
		
		String correo = null;
		correo = request.getParameter("correo");
		
		try {
			
			user = userDao.busquedaU(correo);
			System.out.println("Usuario recuperado: " + user.getNombres() + " " + user.getApellidos());
			
			
			for(int i=0;i<=parts.length-1;i++) {
				
				//BUSCAR ID PRODUCTO. 
				int codigo_producto_recuperado=0;
				int codigo_empresa_producto=0;
				int codigo_usuario_recuperado=0;
				
				producto = productoDao.buscarPorDescripcion(parts[i]);
				
				if(producto != null) {
					
					codigo_producto_recuperado = producto.getId();
					codigo_empresa_producto = producto.getEmpresa().getId();
					codigo_usuario_recuperado = user.getId();
					
					String MiFecha = new SimpleDateFormat("yyyy-MM-dd").format(fecha);
														
					//CREANDO COMPRA.
					compra.setId(0);
					compra.setFecha(MiFecha);
					compra.setEstado("E");
					compra.setEmpresa_id(codigo_empresa_producto);
					compra.setProducto_id(codigo_producto_recuperado);
					compra.setUsuario_id(codigo_usuario_recuperado);
					compraDao.create(compra);
					
					System.out.println("Compra registrada con existo, Servlet : ProcesarCompra.java");
					
				} else {
					
					System.out.println("Error al recuperar el producto, Servlet : ProcesarCompra.java");
					
				}
				
			}
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html><head><title>Confirmacion de Compra</title></head><body>"
					  + "<h2>Gracias, su solicitud de compra se a procesado con exito</h2>"
					  + "</body></html>");
			
		}catch(Exception e) {
			
			System.out.println("Error: " + e.getMessage());
			
		}
		
	}

}
