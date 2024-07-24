package java_cp;

import java.sql.SQLOutput;
import java.util.Scanner;

class Bank{
    int accno;
    String name;
    float bal;
    public Bank(int acc,String n){
        accno=acc;
        name=n;
        bal=0;
    }
    public void disAcc(){
        System.out.println("The bank details are :");
        System.out.println("Account Number: " + accno+ "\n Account Holder: " +name+ "\n Account Balance: "+ bal);
    }
    public void disB(){
        System.out.println("Current Balance :"+ bal);
    }
    public void withdraw(float x){
        if(bal>x) {
            bal -= x;
        }else{
            System.out.println("insufficent balance!");
        }
        disB();
    }
    public void desposit(float x){
        bal+=x;
        disB();
    }
}



public class bankAcc {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int exit =0;
        Bank p1= new Bank(193883,"Nitish Kumar");
        System.out.print("Enter initial Balance :");
        float amt= sc.nextInt();
        p1.desposit(amt);
        do {
            System.out.print("1. Withdraw\n2. Deposit\n3. Bank Details\n4. Exit\nSelect an option :");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Withdraw amount :");
                    amt = sc.nextFloat();
                    p1.withdraw(amt);
                    break;
                case 2:
                    System.out.print("Deposit amount :");
                    amt = sc.nextFloat();
                    p1.desposit(amt);
                    break;
                case 3:
                    p1.disAcc();
                    break;
                case 4:
                    exit=1;
                    System.out.println("Thank You");
                    break;
            }
        }while(exit ==0);
    }
}

