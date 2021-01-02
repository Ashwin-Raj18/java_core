package com.possoul.coreJava.threads;

//this class is evolution from A,B
public class Thread2C {
	public static void main(String[] args) {
		
		 int n = 8; // Number of threads 
	        for (int i=0; i<n; i++) 
	        { 
	        	Thread thread1 = new Thread(()->
	        									System.out.println(Thread.currentThread().getName()+" of id : "
	        																					 +Thread.currentThread().getId()
	        																					 +" from runnable anonymous impl")
	        														,"thread"+i);
	        																							
	        	thread1.start();
	        } 
		
	}
}
