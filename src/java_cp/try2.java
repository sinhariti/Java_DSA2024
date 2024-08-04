package java_cp;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

//given an array nums, return true if any value appears at least twice in the array, and return false if every element
//is distinct


public class try2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of elements :");
        int m;
        m=sc.nextInt();
        int[] arr=new int[m];
        createarr(arr);
        System.out.println(duplicheck(arr));

    }
    // man lives on a tenth floor of the building everyday he goes to the ground floor for shopping or work he takes elevator to the
    //returns he takes to elevator to the 7th floor and then walks 3 floor , he hates walking, then why
    static void createarr(int[] arr){
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter element for ["+i+"]:");
            arr[i]= sc.nextInt();
        }
    }
    static boolean duplicheck(int[] arr){
        Map<Integer,Integer> count= new HashMap<>();
        for(int s:arr){
            if(count.containsKey(s)){
                count.put(s,count.get(s)+1);
                return true;
            }else{
                count.put(s,1);
            }
        }
        return false;
    }

}
