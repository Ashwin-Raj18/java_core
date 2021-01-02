package com.possoul.coreJava.threads;

//this is similar to 2A way but we r using lambda class
public class Thread2B {
	public static void main(String[] args) {
		
		Runnable runnable = ()-> {
				System.out.println("this thread is from anonymous inner class Started");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("this thread is from anonymous inner class ended");
		};
		Thread thread1 = new Thread(runnable);
		thread1.start();
	}
}