package multithreading;

public class FirstThread extends Thread{
    //constructor overloading to name the thread
    public FirstThread(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i =0;i<5;i++){
            System.out.println("Inside Thread 1: "+i);
            //printing the name of the thread

        }
        System.out.println("Name :"+Thread.currentThread());
    }
}
