package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
	JButton but = new JButton();
	JButton but2 = new JButton();
	JButton but3 = new JButton();
	JButton but4 = new JButton();
	JButton but5 = new JButton();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	ArrayList<String> tasks = new ArrayList();
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save
	 * list, and load list.
	 * 
	 * When add task is clicked: ask the user for a task and save it to an array
	 * list
	 * 
	 * When the view tasks button is clicked: show all the tasks in the list
	 * 
	 * When the remove task button is clicked: prompt the user for which task to
	 * remove and take it off of the list.
	 * 
	 * When the save list button is clicked: Save the list to a file
	 * 
	 * When the load list button is clicked: Prompt the user for the location of the
	 * file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file
	 * into the list.
	 */

	public static void main(String[] args) {

		ToDoList tdl= new ToDoList();
		tdl.run();
	}

	public void run() {

		frame.setVisible(true);
		panel.setVisible(true);

		but.setVisible(true);
		but2.setVisible(true);
		but3.setVisible(true);
		but4.setVisible(true);
		but5.setVisible(true);

		but.setText("add task");
		but2.setText("view task");
		but3.setText("remove task");
		but4.setText("save task");
		but5.setText("load task");

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
		if (e.getSource().equals(but)) {
			String input = JOptionPane.showInputDialog("Enter a task");
			tasks.add(input);

		} else if (e.getSource().equals(but2)) {
			String s = "";
			for (int i = 0; i < tasks.size(); i++) {
				s += tasks.get(i) + " ";
			}
			JOptionPane.showMessageDialog(null, s);
		} else if (e.getSource().equals(but3)) {
			String s = JOptionPane.showInputDialog("Enter a task that you want to have removed");

			for (int i = 0; i < tasks.size(); i++) {
				if (tasks.get(i).equals(s)) {
					tasks.remove(i);
				}
			}

		} else if(e.getSource().equals(but4)) {
			try {
				
				FileWriter fw= new FileWriter("src/_03_To_Do_List/Untitled_1.txt");
				
				for (int i = 0; i < tasks.size(); i++) {
					fw.write(tasks.get(i)+"\n");
				}
				fw.close();
				
			}catch(IOException f) {
				f.printStackTrace();
			}
			
		} else if(e.getSource().equals(but5)) {
			
			try {
				BufferedReader br = new BufferedReader(new FileReader("src/_03_To_Do_List/Untitled_1.txt"));
				
				tasks.clear();
				String line = br.readLine();
				while(line != null){
					System.out.println(line);
					tasks.add(line);
					line = br.readLine();
					
				}
				//tasks.add(line);
				
				br.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}

			
			JOptionPane.showMessageDialog(null, tasks);
			
			
			
		}

	}

}
