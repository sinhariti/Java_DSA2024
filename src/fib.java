import java.util.Scanner;

public class fib {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int numTerms = sc.nextInt();
        sc.close();

        int a = 0, b = 1;
        System.out.println("The Fibonacci Series is:");
        for (int i = 0; i < numTerms; i++){
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
