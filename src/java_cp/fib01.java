package java_cp;

import java.util.Scanner;

public class fib01 {
    static int fibo(int n){
        if(n==0){
            
            return 0;
        }
        return n-fibo(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int numTerms = sc.nextInt();
        sc.close();

    }
}
