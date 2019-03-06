package chep22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Film {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    protected void list() {
        // list all film title and descr
        // try..catch = exception/ errhandling
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/sakila?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            stmt = con.createStatement();
            String sql = "SELECT * FROM film";
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                System.out.print(rs.getInt("film_id") + "\t");
                System.out.print(rs.getString("title") + "\t");
                System.out.println(rs.getString("description"));
            }
        } catch (Exception e) {
            System.out.println("Berlaku Error");
            System.out.println(e.getMessage());
            
            
        }
    }
    
    public static void main(String[] args) {
        Film f = new Film();
        f.list();
    }

    private static class resultSet {

        public resultSet() {
        }
    }
}
