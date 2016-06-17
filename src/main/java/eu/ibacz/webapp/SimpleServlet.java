package eu.ibacz.webapp;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;

public class SimpleServlet extends HttpServlet {
 
    final private String INDEX_PATH = "/index.jsp";
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException {

            request.getRequestDispatcher(INDEX_PATH).forward(request, response);

    }

}
