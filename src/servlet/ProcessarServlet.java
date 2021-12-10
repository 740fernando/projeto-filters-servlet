package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessarServlet
 */
@WebServlet("/ProcessarServlet")
public class ProcessarServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = null;
		
		try {
			out= response.getWriter();
			try{
				Thread.sleep(200);
			}catch (InterruptedException e) {
			}
				
			out.print("Processamento realizado!");	
		}finally {
			if(out !=null) {
				out.close();
			}
		}
	}		
}

