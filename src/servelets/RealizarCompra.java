package servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RealizarCompra
 */
@WebServlet("/RealizarCompra")
public class RealizarCompra extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public RealizarCompra() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
