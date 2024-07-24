package java_cp.sorting;

import java.util.Scanner;

public class max2num {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 num:");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=(a>b)?a:b;
        System.out.println(c);
        System.out.println("==================");
        System.out.println("Enter 3rd num:");
        int d= sc.nextInt();
        int e= (c>d)?c:d;
        System.out.println("ans :"+e);
    }
}
//lcm of numbers
//hcf of numbers
