package multithreading;
/*
* The runnable interface has an abstract method run
* run() method HAS TO BE implemented by any class that implements the runnable interface*/
public class thread_runnable implements Runnable {
   @Override
    public void run(){
       for(int i =0;i<5;i++){
           System.out.println("Inside Runnable Thread: "+i);
       }
       System.out.println("Thread name:"+ Thread.currentThread());
   }
}
