package com.possoul.coreJava.javaIO;

import java.io.FileReader;
//Creating a text File using FileWriter 
import java.io.FileWriter; 
import java.io.IOException; 
public class Filewriter 
{ 
	public static void main(String[] args) throws IOException 
	{ 
		// Accept a string 
		String str = "File Handling in Java using "+ 
				" FileWriter and saadadada"; 

		// attach a file to FileWriter 
		FileWriter fw = new FileWriter("D:\\TUTS\\Eclipse Java Projects\\Spring projects\\JavaCore\\src\\com\\possoul\\coreJava\\javaIO\\file3.txt"); 
		// read character wise from string and write 
		// into FileWriter 
		for (int i = 0; i < str.length(); i++) 
			fw.write(str.charAt(i)); 

		System.out.println("Writing successful"); 
		//close the file 
		fw.close(); 
	} 
}
