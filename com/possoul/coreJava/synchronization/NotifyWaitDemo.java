//wait(), notify() demo
package com.possoul.coreJava.synchronization;

public class NotifyWaitDemo {
	
    public static void main(String[] args){
        ThreadB b = new ThreadB();
        b.start();
 
        synchronized(b){
            try{
                System.out.println("Waiting for b to complete...");
                b.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
 
            System.out.println("Total is: " + b.total);
        }
    }
}
 
class ThreadB extends Thread{
    int total;
    @Override
    public void run(){
    	
        synchronized(this){
            for(int i=0; i<1000 ; i++){
                total += 1;
                if(total == 5) {
                	notify();                       //still the loop continues till end.
                }
            }
        }
        System.out.println("rest of the code...");
    }
}