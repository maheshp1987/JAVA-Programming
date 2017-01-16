

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class GUIApp extends Frame implements ActionListener {
	String url = "jdbc:mysql://localhost:3306/";
    String dbname = "java";
    String driver = "com.mysql.jdbc.Driver";
    String username = "root";
    String password = "root";
	String mempno,mname;
	TextField txtno,txtname;
	Label empno,empname;
	Button cmdFirst,cmdPre,cmdnext,cmdlast;
	ResultSet rs;
	public GUIApp(){
		super("EMP info");
		setSize(400,400);
		GridLayout x=new GridLayout(4,2);
		setLayout(x);
		
		empno=new Label("Emp No");
		add(empno);
		txtno=new TextField(15);
		add(txtno);
		
		empname=new Label("Emp Name");
		add(empname);
		txtname=new TextField(15);
		add(txtname);
		
		cmdFirst=new Button("First");
		add(cmdFirst);
		cmdFirst.addActionListener(this);
		
		cmdPre=new Button("Previous");
		add(cmdPre);
		cmdPre.addActionListener(this);
		
		cmdnext=new Button("Next");
		add(cmdnext);
		cmdnext.addActionListener(this);
		
		cmdlast=new Button("Last");
		add(cmdlast);
		cmdlast.addActionListener(this);
		
		try{
			 Class.forName(driver);
		     System.out.println("Driver Registered Sucessfully");

		     Connection conn = DriverManager.getConnection(url+dbname,username,password);
		     System.out.println("Conn Open Successfully");

		     String q = "Select * from demo1";
		     Statement s = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);

		     rs = s.executeQuery(q);
		    
		     rs.first();
		     
		     mempno=rs.getString("empno");//
		     mname=rs.getString("name");
		     
		     txtno.setText(mempno);
		     txtname.setText(mname);
		     
		    setVisible(true);
		     
		}
		catch(Exception e){
			e.printStackTrace();
		}
		 
		
	}//end Constructor
	
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==cmdFirst) {
			try {
				rs.first();
				readField();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}//if
		
		else if (e.getSource()==cmdPre) {
			try {
				rs.previous();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				if (rs.isBeforeFirst()) {
					rs.first();}
					readField();
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}//if
		
		else if (e.getSource()==cmdnext) {
			try {
				rs.next();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				if (rs.isAfterLast()) {
					rs.last();
				}
				readField();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}//if
		
		else if (e.getSource()==cmdlast) {
			try {
				rs.last();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			readField();
		}//if
		
		
		
	}//action Performed end
	
	public void readField(){
		
		try{
			  mempno=rs.getString("empno");
			     mname=rs.getString("name");
			     
			     txtno.setText(mempno);
			     txtname.setText(mname);
		}
		catch(Exception e5){
			e5.printStackTrace();
		}
	}//end read Filed
public static void main(String a[]){
	 GUIApp y=new GUIApp();
}//main
}

