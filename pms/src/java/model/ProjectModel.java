package model;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ProjectModel extends Model {
    private int id;
    private String title;
    private String description;
    
    
    public ProjectModel getOne(int id) {
        //ArrayList arr = new ArrayList();
        String sql = "SELECT * FROM project WHERE id = " + id;
        ProjectModel pro = new ProjectModel();
        try {
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            //while (rs.next()) {
            if(rs.next()) { 
                pro.id = rs.getInt("id");
                pro.title = rs.getString("title");
                pro.description = rs.getString("description");
                //arr.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pro;
    }
    
    public boolean insert() {
        String sql = "INSERT INTO project(title, description)" +
                "VALUE ('" + this.title +"', '" + this.description +"')";
        try {
            Statement stmt = this.getStmt();
            stmt.execute(sql);
        } catch (Exception e) {
        e.printStackTrace();
        return false;
        }
        return true;
    }
    
    
    public boolean delete(int id) {
        String sql = "DELETE FROM project WHERE id = " + id;
        try {
            Statement stmt = this.getStmt();
            stmt.execute(sql);
        } catch (Exception e) {
        e.printStackTrace();
        return false;
        }
        return true;
    }
    
    public ArrayList getAll() {
        ArrayList arr = new ArrayList();
        String sql = "SELECT * FROM project";
        try {
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ProjectModel pro = new ProjectModel();
                pro.id = rs.getInt("id");
                pro.title = rs.getString("title");
                pro.description = rs.getString("description");
                arr.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public static void main(String[] args) {
        ProjectModel p = new ProjectModel();
        p.setTitle("test");
        p.setDescription("bla bla la");
        p.insert();
        ArrayList list = p.getAll();
        for(int i=0; i<list.size(); i++) {
            ProjectModel pro = (ProjectModel) list.get(i);
            System.out.println(pro.title);
        }
    }
}
