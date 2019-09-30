package _01_File_Recorder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
public static void main(String[] args) {
	

	String s = JOptionPane.showInputDialog("Enter a message to have it saved into a file");
	{

		try {
			FileWriter fw = new FileWriter("src/_01_File_Recorder/Untitled_1.txt");

			/*
			 * NOTE: To append to a file that already exists, add true as a second parameter
			 * when calling the FileWriter constructor. (e.g. FileWriter fw = new
			 * FileWriter("src/_00_Intro_To_File_Input_and_Output/test2.txt", true);)
			 */

			fw.write(s);

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	{

		try {
			BufferedReader br = new BufferedReader(new FileReader("src/_01_File_Recorder/Untitled_1.txt"));

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}}
