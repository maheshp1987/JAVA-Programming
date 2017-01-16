import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class MultiLayout extends Applet{

	Label lblRollno,lblname;
	TextField txtrollno,txtname;
	Button cmdfirst,cmdprevious,cmdlast,cmdnext;
	Panel panel1, panel2;
	
	public void init(){
		//create panel1
		panel1=new Panel();
		
		//set layout to panel
		FlowLayout x=new FlowLayout();
		panel1.setLayout(x);
		
		//add component into panel 1
		lblname = new Label("Enter Name");
		panel1.add(lblname);
		
		txtname = new TextField(20);
		panel1.add(txtname);
		
		lblRollno = new Label("Enter Rollno");
		panel1.add(lblRollno);
		
		txtrollno = new TextField(20);
		panel1.add(txtrollno);
		//create panel 2
		panel2 = new Panel();
		
		//panel 2 set gridLayout (2 * 2)
		GridLayout y=new GridLayout(2,2,5,5);
		panel2.setLayout(y);
		
		//add components to panel 2
		cmdfirst=new Button("First");
		cmdprevious=new Button("Previous");
		cmdnext=new Button("Next");
		cmdlast=new Button("Last");
		panel2.add(cmdfirst);
		panel2.add(cmdprevious);
		panel2.add(cmdnext);
		panel2.add(cmdlast);
		
		//set Border Layout for Applet
		
		BorderLayout z=new BorderLayout(5,5);
		this.setLayout(z);
		
		//add pannel to the Applet
		add(panel1,BorderLayout.CENTER);
		add(panel2,BorderLayout.SOUTH);
	} // init()
}//classs MultiLayout
