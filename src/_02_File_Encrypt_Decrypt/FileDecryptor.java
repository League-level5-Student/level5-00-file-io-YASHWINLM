package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDecryptor {
	// Create a program that opens the file created by FileEncryptor and display
	// the decrypted message to the user in a JOptionPane.
	
	
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/_01_File_Recorder/Untitled_1.txt"));
			
			String message="";
			String line = br.readLine();
			while (line != null) {
				message+=line;
				System.out.println(line);
				line = br.readLine();
				
				
			}
			String str="";
			for (int i = message.length()-1; i >-1; i--) {
				str+=message.substring(i, i+1);
			}
			
			System.out.println(str);

			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
