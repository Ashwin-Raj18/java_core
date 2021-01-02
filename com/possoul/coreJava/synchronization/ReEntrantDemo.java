package com.possoul.coreJava.synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SenderRE {
	 Lock reLock = new ReentrantLock();
     
	public  void send(String msg) throws InterruptedException { 
			reLock.lock();											//lock start
		 	System.out.println("Sending\t"  + msg ); 
	        System.out.println("Sending\t"  + msg );
	        Thread.sleep(500);
	        System.out.println("Sending\t"  + msg ); 
	        reLock.unlock(); 									    //lock end
	        System.out.println("Sending\t"  + "any message" );    
    } 
}
class ThreadedSendRE extends Thread 
{ 
    private String msg; 
    SenderRE  senderRE; 
  
    ThreadedSendRE(String m,  SenderRE obj) 
    { 
        msg = m; 
        senderRE = obj; 
    } 
    
    public void run() 
    { 
                                 
        { 
            try {
				senderRE.send(msg);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
        } 
       
    } 
}
//Driver class 
public class ReEntrantDemo 
{ 
 public static void main(String args[]) 
 { 
     SenderRE snd = new SenderRE(); 
     ThreadedSendRE t1 = new ThreadedSendRE( " Hi " , snd ); 
     ThreadedSendRE t2 = new ThreadedSendRE( " Bye " , snd );
  
     t1.start(); 
     t2.start();  
 } 
} 

