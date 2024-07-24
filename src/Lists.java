import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class Lists {
    public static void ArrayList(){
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(2);
        a1.add(4);
        a1.add(6);
        a1.add(8);
        a1.add(10);
        System.out.println("\nArray List :");
        for(int multiple:a1){
            System.out.println(multiple);
        }
    }
    public static void Vectors(){
        Vector<String> v1= new Vector<>();
        v1.add("Red");
        v1.add("Green");
        v1.add("Blue");
        System.out.println("\nVector:");
        for (String color : v1) {
            System.out.println(color);
        }
    }
    public static void Stacks(){
        Stack<Integer> s1 = new Stack<>();
        s1.add(4);
        s1.add(3);
        s1.add(5);
        s1.add(9);
        s1.pop();
        s1.add(7);
        System.out.println("\nStack:");
        for (int num : s1) {
            System.out.println(num);
        }
    }
    public static void main(String[] args){
        ArrayList();
        Vectors();
        Stacks();
    }
}
