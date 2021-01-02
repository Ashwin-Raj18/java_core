package com.possoul.coreJava.threads;

//this is similar to 2nd way but we r using anonymous inner class
public class Thread2A {
	public static void main(String[] args)  {
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("this thread is from anonymous inner class");
			}
		};
		Thread thread1 = new Thread(runnable);
		thread1.start();
		
	}
}

