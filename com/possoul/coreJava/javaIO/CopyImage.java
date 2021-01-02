package com.possoul.coreJava.javaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream("D:\\TUTS\\Eclipse Java Projects\\Spring projects\\JavaCore\\src\\com\\possoul\\coreJava\\javaIO\\image1.jpg");
		
		FileOutputStream fout=new FileOutputStream("D:\\TUTS\\Eclipse Java Projects\\Spring projects\\JavaCore\\src\\com\\possoul\\coreJava\\javaIO\\imageWrite1.jpg"); 

		byte[] buffer = new byte[1024];
		int length;
		while((length = fin.read(buffer)) > 0) 
		{ 
			fout.write(buffer,0,length); 
		} 
		
		fin.close();
		fout.close();
	}

}
