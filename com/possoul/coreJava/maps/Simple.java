package com.possoul.coreJava.maps;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Simple{
	
		
		
  
		   public static void main(String args[]) throws FileNotFoundException, IOException{
			   myException s = new myException("abc");
			   myException b = s;
			   s.setMsg("def");
			
			System.out.println(b.getMessage());
			
			try(FileReader fr = new FileReader("hhhh")) {
				
			}  
			
			   int n = 33;
			   if(n < 10) {
				   throw new myException("not valid my exception");
			   }else {
				   System.out.println("no exception");
			   }
		       
		      System.out.println("rest of the code...");  
		  } 
		
	
}

class myException extends RuntimeException{
    private String message;
	public myException(String message) {
		super(message);
		this.message = message;
	}
	public void setMsg(String msg) {
		 this.message= msg;
	}
	public String getMsg() {
		return this.message;
	}
	
}
