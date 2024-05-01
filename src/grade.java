import java.util.Scanner;
public class grade {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your marks out of 100 :");
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
