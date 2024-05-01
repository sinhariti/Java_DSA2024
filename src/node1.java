//polymorphism - runtime aka method over overloading - 1. same class 2. same method name 3. different argument
// and compile time
//super - 1. variable 2. methods 3.
//abstraction - abstract class
//try catch throw throws finally
//90mins, 2.5 units
class node extends Thread{
    public void run(){
        System.out.println("Data updating...");
    }
}
class note5 implements Runnable{
    public void run(){
        System.out.println("number updated ");
    }
        }
public class node1 {
    public static void main(String[] args){
        node o1 = new node();
        o1.start();
        note5 o2 = new note5();
        o2.run();
    }
}
