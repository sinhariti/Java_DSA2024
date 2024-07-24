package java_cp;

import java.util.Scanner;

public class hcf {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int hcf =1;
        System.out.println("Enter 2 num to find HCF :");
        int a= sc.nextInt();
        int b= sc.nextInt();
        for(int i =1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        System.out.println("HCF :" +hcf);

    }

}
