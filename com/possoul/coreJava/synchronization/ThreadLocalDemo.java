package com.possoul.coreJava.synchronization;

class MyThread implements Runnable{ 
	static int id=0;
	
     ThreadLocal tl = new ThreadLocal()
	{
    	 @Override
        protected synchronized Object initialValue(){ // method is called by parent class in get method
    		 try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            return id++; 
        } 
	}; 
	
  
	MyThread(String name) { 
		Thread.currentThread().setName(name);  
	} 
  
	public void run(){ 
    for (int i = 0; i < 2; i++) 
        System.out.println( Thread.currentThread().getName() + " " + tl.get()); 
	} 
}


public class ThreadLocalDemo { 
	  
public static void main(String[] args) 
    { 
  
        Thread t1 = new Thread(new MyThread("quiz1")); 
        Thread t2 = new Thread(new MyThread("quiz2"));
        t1.start();
        t2.start();
    } 
} 