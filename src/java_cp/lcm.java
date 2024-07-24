package java_cp;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int gcd =1;
        System.out.println("Enter 2 num to find LCM :");
        int a= sc.nextInt();
        int b= sc.nextInt();
        for(int i =1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        int lcm =(a*b)/gcd;
        System.out.println("LCM :" + lcm);
    }
}
