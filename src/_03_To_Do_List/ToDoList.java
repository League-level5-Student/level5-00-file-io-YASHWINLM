package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 * 
	 * When add task is clicked:
	 * 		ask the user for a  task and save it to an array list
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list.
	 */

public static void main(String[] args) {
	
	
	
} 

public void run() {
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	
	JButton but=new JButton();
	JButton but2=new JButton();
	JButton but3=new JButton();
	JButton but4=new JButton();
	JButton but5=new JButton();
	
	but.addActionListener(this);
	but2.addActionListener(this);
	but3.addActionListener(this);
	but4.addActionListener(this);
	but5.addActionListener(this);
	
	frame.add(panel);
	panel.add(but5);
	panel.add(but4);
	panel.add(but3);
	panel.add(but2);
	panel.add(but);
	
	
	
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

}
