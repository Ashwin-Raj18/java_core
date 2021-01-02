package com.possoul.coreJava.threads;

public class Thread1 extends Thread {

    public void run(){
    	Thread.currentThread().setPriority(3);
       System.out.println("Thread running with extended from Thread");
    }

    public static void main(String[] args) {
    	Thread1 thread1 = new Thread1();
    	thread1.start();
    	Thread.currentThread().setPriority(7);
    	System.out.println(thread1.getPriority());
    	System.out.println(Thread.currentThread().getPriority());
    }
  }
