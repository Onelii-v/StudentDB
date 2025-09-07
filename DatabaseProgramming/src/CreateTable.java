import java.sql.*;

public class CreateTable {
   public static void main(String[] args) {
       try (Connection con = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/studentdb", "root", "root");
       Statement stmt = con.createStatement()) {

           String dropSql = "DROP TABLE IF EXISTS students";
           stmt.executeUpdate(dropSql);

           String sql ="CREATE TABLE students ("
                   + "ID INT PRIMARY KEY AUTO_INCREMENT, "
                   + "name VARCHAR(50), "
                   + "age INT, "
                   + "course VARCHAR(50))";
           stmt.executeUpdate(sql);

           System.out.println("Table created successfully!");

       }  catch(SQLException e) {
           e.printStackTrace();

       }

   }
}
