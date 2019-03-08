package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserModel;

@WebServlet(name = "user", urlPatterns = {"/user"})
public class user extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String name = request.getParameter("name");
        String role = request.getParameter("role");
        String pwd = request.getParameter("pwd");
        String gender = request.getParameter("gender");
        UserModel user = new UserModel();
        user.setGender(gender);
        user.setName(name);
        user.setPwd(pwd);
        user.setRole(role);
        user.insert();

    }

}
