package eu.ibacz.webapp;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;

public class SimpleServlet extends HttpServlet {

    final private String HElLO_PATH = "/WEB-INF/hello.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        try {
            String s = request.getParameter("x");
            request.setAttribute("x", s);
            request.getRequestDispatcher(HElLO_PATH).forward(request, response);

        } catch (ServletException e) {
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.getMessage());
        }

    }

}
