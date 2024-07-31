package java_cp;

import java.util.Scanner;

public class joesphus {
    static int jp(int n,int k){
        if(n==1)
            return 1;
        else
            return(jp(n-1,k)+k-1)%n+1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n= sc.nextInt();
        System.out.print("Enter k:");
        int k=sc.nextInt();
        System.out.println(jp(n,k));
    }
}
