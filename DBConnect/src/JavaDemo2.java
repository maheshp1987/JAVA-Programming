import java.sql.*;

public class JavaDemo2{
  public static void main(String[] args){
     String url = "jdbc:mysql://localhost:3306/";
     String dbname = "java";
     String driver = "com.mysql.jdbc.Driver";
     String username = "root";
     String password = "root";

     try{
     Class.forName(driver);
     System.out.println("Driver Registered Sucessfully");

     Connection conn = DriverManager.getConnection(url+dbname,username,password);
     System.out.println("Conn Open Successfully");

     String q = "Select * from demo1";
     PreparedStatement ps = conn.prepareStatement(q);

     ResultSet rs = ps.executeQuery();
     ResultSetMetaData rsmd = rs.getMetaData();
     int columnCount = rsmd.getColumnCount();
     System.out.println("Total Columns:"+columnCount);

     String colhead = "";
    //int columnCount = rsmd.getColumnCount();

     for(int i=1;i<= columnCount; i++){
      colhead = colhead+"\t"+rsmd.getColumnName(i);
     }
 
     System.out.println(colhead);

     while(rs.next()){//iterate records

	     for(int i=1; i<=columnCount; i++) {//
	
        	String str1 = rs.getString(i);
	        System.out.print("\t"+str1);

	     }
     System.out.println("");
     }
   
     conn.close();
     System.out.println("Conn Close Successfully");
     }

     catch(Exception e){
     e.printStackTrace();
     }
  }
}
