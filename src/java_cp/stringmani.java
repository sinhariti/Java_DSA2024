package java_cp;

import java.util.Scanner;

public class stringmani {
    static String sst(String s){
        String s1="";
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==45){
                s+=s.charAt(i);
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=45){
                s+=s.charAt(i);
            }
        }
        return s1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string :");
        String s= sc.nextLine();
        String ans = sst(s);
        System.out.println(ans);

    }
}
