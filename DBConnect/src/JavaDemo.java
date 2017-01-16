import java.sql.Connection;
import java.sql.DriverManager;

public class JavaDemo
{
  public static void main(String[] args){
     String url = "jdbc:mysql://127.0.0.1:3306/";
     String dbname = "java";
     String driver = "com.mysql.jdbc.Driver";
     String username = "root";
     String password = "root";

     try{
     Class.forName(driver);
     System.out.println("Driver Registered Sucessfully");

Connection conn = DriverManager.getConnection(url+dbname,username,password);
     System.out.println("Conn Open Successfully");

     conn.close();
     System.out.println("Conn Close Successfully");
     }

     catch(Exception e){
     e.printStackTrace();
     }

  }

}
