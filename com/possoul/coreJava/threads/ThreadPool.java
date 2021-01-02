package com.possoul.coreJava.threads;


import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock; 

 
class Task implements Runnable { 
	private String name; 
	Lock l1  = new ReentrantLock();
	
	public Task(String s){ 
		name = s; 
	} 
	
	
	public void run() { 
		try{ 
			Date d = new Date(); 
			SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss"); 
					for (int i = 0; i<=5; i++) { 
						System.out.println("Executing Time for task name - "+ 
								name +" = " +ft.format(d)); 
						Thread.sleep(300); 
				} 
				System.out.println(name+" complete"); 
		} catch(InterruptedException e) { 
			e.printStackTrace(); 
		} 
	} 
} 
public class ThreadPool 
{ 
	// Maximum number of threads in thread pool 
	static final int MAX_T = 3;			 

	public static void main(String[] args) 
	{ 
		// creates five tasks 
		Runnable r1 = new Task("task 1"); 
		Runnable r2 = new Task("task 2"); 
		Runnable r3 = new Task("task 3"); 
		Runnable r4 = new Task("task 4"); 
		Runnable r5 = new Task("task 5");	 
		
		// creates a thread pool with MAX_T no. of 
		// threads as the fixed pool size(Step 2) 
		ExecutorService pool = Executors.newFixedThreadPool(MAX_T); // no need to create Thread object
		
		// passes the Task objects to the pool to execute (Step 3) 
		pool.execute(r1); 
		pool.execute(r2); 
		pool.execute(r3); 
		pool.execute(r4); 
		pool.execute(r5); 
		
		// pool shutdown ( Step 4) 
		pool.shutdown();	 
	} 
} 

