package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.UserModel;

@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        response.sendRedirect("/pms/pub/login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String staffId = request.getParameter("staff_id");
        String pwd = request.getParameter("pwd");
        UserModel user = new UserModel();
        if (user.isExist(staffId, pwd)) {
            //
            HttpSession sess = request.getSession();
            sess.setAttribute("loggedin", true);
            sess.setAttribute("user", user);
            response.sendRedirect("/pms/project");
        } else {
            //
            response.sendRedirect("/pms/pub/login.jsp?no");
        }
    }

}
