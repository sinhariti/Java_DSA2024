import java.util.Scanner;

public class fac {
    public static int factorial(int num){
        if (num<=1){
            return 1;
        }
        else{
            return (num*factorial(num-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y;
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        y=factorial(num);
        System.out.println("The factorial of "+num+" is "+y);
        sc.close(); // close the scanner
    }
}



