package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
	
	public static void main(String[] args) {
		

		String s = JOptionPane.showInputDialog("Enter a message to have it saved into a file");
		{
			String str="";
			for (int i = s.length()-1; i >=0; i--) {
				str+=s.substring(i, i+1);
			}
			
			try {
				FileWriter fw = new FileWriter("src/_01_File_Recorder/Untitled_1.txt");

				/*
				 * NOTE: To append to a file that already exists, add true as a second parameter
				 * when calling the FileWriter constructor. (e.g. FileWriter fw = new
				 * FileWriter("src/_00_Intro_To_File_Input_and_Output/test2.txt", true);)
				 */

				fw.write(str);

				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		{

			

		}
	}
}
