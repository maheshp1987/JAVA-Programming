/*<applet code=EventHand4.class width=300 height=300 />*/
package com.eventhandling;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class EventHand4 extends Applet implements ActionListener {
     List lstBranch,lstYear;
     TextArea textSyllabus;
     Button cmdShow;
     	
	public void init(){
	String[] branches= {"Computer","IT","E&TC"};
	String[] years= {"First","Second","Third","Fourth"};
	lstBranch = new List(2,false);
	int counter;
	for(counter=0;counter<branches.length;counter++){
		lstBranch.add(branches[counter]);
	}
	
	lstYear = new List(4,false);
	for(counter=0;counter<years.length;counter++){
		lstYear.add(years[counter]);
	}
	
	textSyllabus = new TextArea(10,40);
	cmdShow = new Button("Show Syllabus");
	cmdShow.addActionListener(this);
    add(lstBranch);
    add(lstYear);
    add(textSyllabus);
    add(cmdShow);
	}//init()
	
	public void actionPerformed(ActionEvent e){
		String strBranch = lstBranch.getSelectedItem();
		String strYear = lstYear.getSelectedItem();
		if(strBranch.equals("Computer")){
			if(strYear.equals("First")){
				textSyllabus.setText("");
				textSyllabus.append("Physics");
				textSyllabus.append("\n");
				textSyllabus.append("Chemistry");
				textSyllabus.append("\n");
				textSyllabus.append("Maths");
			}
			else if(strYear.equals("Second")){
				textSyllabus.setText("");
				textSyllabus.append("DS");
				textSyllabus.append("\n");
				textSyllabus.append("C++");
				textSyllabus.append("\n");
				textSyllabus.append("M-II");
			}
		}
	}//actionPerformed()
}
