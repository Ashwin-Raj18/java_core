package com.possoul.coreJava.synchronization;

class Counter{
	  int count = 0;
	  
	  public synchronized void incr(){ //if we dont use synchronised result wont be 2000
			  count++;
	  }
}

public class Synch2 {
	
	  public static void main(String[] args)throws InterruptedException {

	    Counter c = new Counter();
	    
	    Thread t1 = new Thread(() -> {
	        for(int i=0; i<1000; i++)
	          c.incr();
	      });

	    Thread t2 = new Thread(() -> {
	        for(int i=0; i<1000; i++)
	          c.incr();
	      });

	    t1.start();
	    t2.start();

	   t1.join();  // main thread is waiting untill t1 completes
	   t2.join();  // main thread is waiting untill t2 completes
	   // even if u dont call join main thread will complete but sout method is called before completing main thread
	    System.out.println("Count = " + c.count);
	    System.out.println(Thread.currentThread().getName());
	  }
	}