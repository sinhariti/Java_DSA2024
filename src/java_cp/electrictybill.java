package java_cp;


import java.util.Scanner;

public class electrictybill {
    public static double billcalc(int units){
        double bill = 0;
        if(units <= 100){
            bill= units *1.20;
        }else if(units<=300){
            bill= 100*1.20 + (units-100)*2.00;
        }else{
            bill = 100*1.20 +200*2.00+ (units-300)*3.00;
        }
        return bill;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of units for calculating electricity bill:");
        int x= sc.nextInt();
        double amt =billcalc(x);
        System.out.println("The electricity bill for 150 units is: $" + amt);
    }
}
