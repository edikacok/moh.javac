package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ProjectModel;

@WebServlet(name = "project", urlPatterns = {"/project"})
public class project extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null) {
            int id = Integer.parseInt(request.getParameter("id"));
            ProjectModel pro = new ProjectModel();
            if(action.equals("edit")) {
                pro = pro.getOne(id);
                request.setAttribute("project", pro);
                request.getRequestDispatcher("project/form.jsp").forward(request, response);
            }  else if(action.equals("del")) {
                        pro.delete(id);
                 }
            }                    
        
        ArrayList list = new model.ProjectModel().getAll();
        request.setAttribute("list", list);
        request.getRequestDispatcher("project/list.jsp").forward(request, response);
    }
    
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String title = request.getParameter("Title");
         String description = request.getParameter("Description");
         ProjectModel pro = new ProjectModel();
         pro.setTitle(title);
         pro.setDescription(description);
         pro.insert();
         //request.getRequestDispatcher("project/list.jsp").forward(request, response);
         response.sendRedirect("project");
     }

}
