package com.possoul.coreJava.threads;

public class DemonThread {
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(()->{
											while(true) {
												System.out.println("Running");
												sleep(1000);
											}
								       });
		thread.setDaemon(true);
		thread.start();
		//stop main thread after 3 sec, if no demon thread above thread wont stop
		sleep(1000);
		
		//this will again joins the thread runs infinitely // join is actually used to complete the thread before proceeding main thread
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	public static void sleep(int t) {
		 try {
	            Thread.sleep(t);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}

}
