package com.possoul.coreJava.threads;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("thread is running using Runnable interface");	
	}
	
	public static void main(String[] args) {
		Thread runnable = new Thread(new Thread2());
		runnable.start();
	}

}
