import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/HelloWorld"})
public class HelloWorld extends HttpServlet {
    private String message;
    
    public void init() throws ServletException {
        message = "Hello En. ";
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String nama = request.getParameter("nama");
        out.println("<h1>" + this.message + nama +"</h1>");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException
    {
        
        //response.setContentType("text/html");        
        String nama = request.getParameter("nama");
        int umur = Integer.parseInt(request.getParameter("umur"));
        PrintWriter out = response.getWriter();
        out.println("<h1>" + nama + " " + umur + "</h1>");
    }

}
