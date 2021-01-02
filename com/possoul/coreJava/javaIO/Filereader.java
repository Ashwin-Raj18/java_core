package com.possoul.coreJava.javaIO;

//Reading data from a file using FileReader 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException; 
public class Filereader 
{ 
	public static void main(String[] args) throws IOException 
	{ 
		// variable declaration 
		int ch; 

		// check if File exists or not 
		FileReader fr=null; 
		try
		{ 
			fr = new FileReader("D:\\TUTS\\Eclipse Java Projects\\Spring projects\\JavaCore\\src\\com\\possoul\\coreJava\\javaIO\\file3.txt"); 
		} 
		catch (FileNotFoundException fe) 
		{ 
			System.out.println("File not found"); 
		} 

		// read from FileReader till the end of file 
		while ((ch=fr.read())!=-1) 
			System.out.print((char)ch); 

		// close the file 
		fr.close(); 
	} 
} 

