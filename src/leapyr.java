import java.util.Scanner;

public class leapyr {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Year :");
        int year = sc.nextInt();
        if (year%4==0){
            System.out.println("It is a leap year.");
        }
        else{
            System.out.println("It is not a leap year.");
        }
        sc.close();
    }
}