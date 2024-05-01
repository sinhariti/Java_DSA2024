import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
//check whether it is leapyr or not

public class operations {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int option;
        do {
            System.out.print("Operations :\n" +
                    "1. Check Leap Year\n" +
                    "2. Check Odd or Even\n" +
                    "3. Biggest of N number\n" +
                    "4. Factorial of a given number\n" +
                    "5. Fibonacci series of a given count\n" +
                    "6. Find the student grade calculation with Grade A, B, C and Fail\n" +
                    "7. Exit\n" +
                    "Select an option :");
            option = sc.nextInt();
            switch(option){
                case 1:
                    leapyear(sc);
                    break;
                case 2:
                    oddeven(sc);
                    break;
                case 3:
                    biggestnum(sc);
                    break;
                case 4:
                    factorial(sc);
                    break;
                case 5:
                    fibonacci(sc);
                    break;
                case 6:
                    gradechecker(sc);
                    break;
                case 7:
                    System.out.println("Exiting... Thank you");
                    break;
            }
            System.out.println("===================================");
        }while(option !=7);
        sc.close();
    }
    //leap year function
    private static void leapyear(Scanner sc){
        System.out.print("Enter a Year :");
        int year = sc.nextInt();
        if (year%4==0){
            System.out.println("It is a leap year.");
        }
        else{
            System.out.println("It is not a leap year.");
        }
    }
    //odd even checker
    private static void oddeven(Scanner sc){
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        if (num > -1) {
            if (num%2==0){
                System.out.println("It is an even number.");
            }
            else{
                System.out.println("It is an odd number.");
            }
        }
        else{
            System.out.println("Please Enter a valid number.");
        }
    }

    //biggest of N numbers
    private static void biggestnum(Scanner sc){
        int num,max;
        System.out.print("Enter a number of elements in the array :");
        num = sc.nextInt();
        int a[] = new int[num];
        for (int i =0;i<num;i++){
            System.out.print("Enter a number :");
            a[i]=sc.nextInt();
        }
        max=a[0];
        for (int i =0;i<num;i++){
            if (max<a[i]){
                max=a[i];
            }
        }
        System.out.println("The maximum number is : "+max);
    }
    //Factorial of a given number
    private static int fac(int num){
        if (num<=1){
            return 1;
        }
        else{
            return (num*fac(num-1));
        }
    }
    private static void factorial(Scanner sc){
        int y;
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        y=fac(num);
        System.out.println("The factorial of "+num+" is "+y);
    }
    //Fibonacci series
    private static void fibonacci(Scanner sc){
        System.out.print("Enter the number of terms: ");
        int numTerms = sc.nextInt();

        int a = 0, b = 1;
        System.out.println("The Fibonacci Series is:");
        for (int i = 0; i < numTerms; i++){
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
    //grades
    private static void gradechecker(Scanner sc){
        System.out.print("Enter your marks out of 100 :");
        int marks = sc.nextInt();
        System.out.print("Your grade is :");
        if (marks>=90){
            System.out.println("A");
        } else if (marks>80 && marks<90) {
            System.out.println("B");
        }
        else if (marks>70 && marks<80){
            System.out.println("C");
        }
        else{
            System.out.println("Fail");
        }
    }
}
