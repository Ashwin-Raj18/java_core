package com.possoul.coreJava.synchronization;

class Sender {
	public void send(String msg) throws InterruptedException 
    { 
        System.out.println("Sending\t"  + msg ); 
        System.out.println("Sending\t"  + msg );
        Thread.sleep(500);
        System.out.println("Sending\t"  + msg ); 
        System.out.println("Sending\t"  + msg ); 
     
    } 
}
class ThreadedSend implements Runnable 
{ 
    private String msg; 
    Sender  Sender; 
  
    ThreadedSend(String m,  Sender obj){ 
        msg = m; 
        Sender = obj; 
    }
    
    public void run(){                       
        synchronized(Sender) 
        { 
            try {
				Sender.send(msg);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
        } 
    } 
}
//Driver class 
public class SynchBlock { 
	
 public static void main(String args[]){ 
     Sender snd = new Sender(); 
     Thread t1 = new Thread(new ThreadedSend( " Hi " , snd )); 
     Thread t2 = new Thread ( new ThreadedSend( " Bye " , snd ));
  
     t1.start(); 
     t2.start();  
 } 
} 
