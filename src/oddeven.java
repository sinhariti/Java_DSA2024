import java.util.Scanner;
public class oddeven {
    public static void  main(String args[]){
        System.out.print("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("It is an even number.");
        }
        else{
            System.out.println("It is an odd number.");
        }
        sc.close();
    }
}
