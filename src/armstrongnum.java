import java.lang.Math;
import java.util.Scanner;
public class armstrongnum {
    public static void armstrongcheck(int num){
        int original= num;
        int sum=0;
        while(num!=0){
            int remainder = num%10;
            sum +=  (Math.pow(remainder, 3));
            num/=10;

        }
        if(sum==original){
            System.out.println("It is a armstrong number.");
        }
        else{
            System.out.println("It is not an armstrong number.");
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number :");
        int number = sc.nextInt();
        armstrongcheck(number);
    }
}
