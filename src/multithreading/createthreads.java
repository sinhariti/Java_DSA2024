package multithreading;
/*
Thread is represented as an object of the Thread class
Two ways of implementing the thread class
1. Implementing the java.lang.Runnable interface
2. Extending the java.lang.Thread class

**Interview Question**
There are two ways of choosing creating a thread which one should i go with ??
- Extends thread - there is no option of multiple inheritance
- Implements runnable - but we can implement multiple iterfaces in java
therefore using runnable interface is better when the class wants to implement anything moer than the runnable interface
 */
public class createthreads {
    public static void main(String args[]){
        //here two threads would be running concurrently. One is the main thread and other is the thread1
        //thread1 is the child thread of the main thread
        System.out.println("Main is starting");
        Thread thread1= new FirstThread("Thread1");
        Thread thread2= new Thread(new thread_runnable(),"RunThread");
        //start() - is an asynchronous method - it is used to call the run method
//       thread1.setDaemon(true);//by default boolean is set to false
        //daemon thread set true might end up finishing the program execution before the thread1 finishes its execution
        //using Lambda in runnable interface
        //passing the implementation of the run method as a paramter
        Thread thread3 =  new Thread(()->{
            for(int i =0;i<5;i++){
                System.out.println("Inside Parameter Thread: "+i);
            }
            System.out.println("Thread name:"+ Thread.currentThread());
        },"T3");
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("Main is executing.");
        //there is no order of the code - it depends on the JVM


    }
}
