package com.possoul.coreJava.threads;

//this is similar to 3rd way but we r using lambda class
public class Thread4 {
	public static void main(String[] args) {
		
		Runnable runnable = ()-> {
				System.out.println("this thread is from anonymous inner class");
		};
		runnable.run();
	}
}