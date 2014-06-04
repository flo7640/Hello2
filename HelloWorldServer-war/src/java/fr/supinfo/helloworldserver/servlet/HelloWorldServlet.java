
package fr.supinfo.helloworldserver.servlet;

import fr.supinfo.helloworldserver.service.HelloServiceInterface;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gbalas
 */

@WebServlet(urlPatterns = "/")
public class HelloWorldServlet extends HttpServlet {

    @EJB
    HelloServiceInterface helloServiceInterface;
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<body>");
        
        out.println("<p> Message from EJB : " + helloServiceInterface.getHelloMessage());
        
        out.println("</body>");
        out.println("</html>");
    
    }

    
    
}
