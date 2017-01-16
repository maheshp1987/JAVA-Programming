import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
 
public class ExampleCRUD_JDBCOperations {
    
    public static void main(String[] args) throws SQLException {
 
    	String url = "jdbc:mysql://localhost:3306/";
        String dbname = "java";
        String driver = "com.mysql.jdbc.Driver";
        String username = "root";
        String password = "root";

        try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Driver Registered Sucessfully");

        Connection conn = DriverManager.getConnection(url+dbname,username,password);
        
       // Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("Successfully connected");
        
        //insert employee record into database
        Statement stmt = conn.createStatement();
        int rows = stmt.executeUpdate("insert into demo1(empno,name) values(73,'James')");
        System.out.println("Rows inserted = "+ rows);
        
        //update employee record
        rows= stmt.executeUpdate("Update demo1 set name='Mahesh' where empno=2");
        System.out.println("Rows updated = "+ rows);
        
        //read employee records
        ResultSet rs = stmt.executeQuery("Select * from demo1");
        while(rs.next()){
            System.out.println("Emp Id : " + rs.getInt("empno") + ", Name : " + rs.getString("name"));
        }
        
        //delete employee record
        rows = stmt.executeUpdate("delete from demo1 where name = 'om'");
        System.out.println("Rows deleted = "+ rows);
    }
    
 
}