package labprac;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class datastruc {
    public static void array_list(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(20);
        arr.add(3);
        arr.add(13);
        arr.add(67);
        for(int i: arr){
            System.out.println(i);
        }
    }
    public static void stack_list(){
        Stack<Integer> st = new Stack<>();
        st.add(23);
        st.add(20);
        st.add(3);
        st.add(13);
        st.add(67);
        st.pop();
        for(int i: st){
            System.out.println(i);
        }
    }
    public static void vector_list(){
        Vector<String> vec = new Vector<>();
        vec.add("Red");
        vec.add("Blue");
        vec.add("Green");
        vec.remove("Green");
        for(String i: vec){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        array_list();
        System.out.println("");
        stack_list();
        System.out.println("");
        vector_list();

    }
}
