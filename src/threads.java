/*
Once thread is created then automatically it will go to the runnable state
runnable is the heart of the thread - where the next instructions will be taken after that it goes to the running state
Running state --> terminated (if run successfully)
important diagram in the ppt
Q- thread code, give example
blocked
waiting
timely waiting - wait for some time
* */
public class threads extends Thread{
    public static void main(String[] agrs){
        threads1 t1= new threads1();
        threads2 t2= new threads2();
        t1.start();
        t2.start();
    }
}

class threads1 extends Thread{
    public void run(){
        for(int i=1;i<5;i++) {
            if (i==2)
            {
                stop();
                System.out.println("first thread is running "+i);
                //checking the conditions, so if it is true then the number is printed
            }
        }
    }
}
class threads2 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            if (i==2)
            {

                System.out.println("second thread is running "+i);
                //checking the conditions, so if it is true then the number is printed
            }
        }
    }
}
