import java.util.ArrayList;
interface Account{
    void deposit(double amt);
    void withdraw(double amt);
    double calcInterest();
    double balance();
}
class BankAccount implements Account{
    private double bal;
    public BankAccount(double b){
        this.bal=b;
    }
    //getter
    public double getbal(){
        return bal;
    }
    public void deposit(double amt){
        bal+= amt;
        System.out.println("Deposited: Rs "+amt);
    }
    @Override
    public void withdraw(double amt){
        bal-=amt;
        System.out.println("Withdrawn: Rs "+amt);
    }
    @Override
    public double balance(){
        System.out.println("The current balance is :"+bal);
        return 0;
    }

    @Override
    public double calcInterest() {
        int r=3;
        double interest = (bal*r)/100;
        System.out.println("The interest is : Rs "+interest);
        return 0;
    }
}
class SavingsAccount extends BankAccount{
    public SavingsAccount(double bal){
        super(bal);
    }
    //unique method
    public void savinterest(){
        int r=5;
        double interest = (this.getbal()*r)/100;
        System.out.println("The interest of Saving account is : Rs "+interest);
    }
    public void withdraw(double amt){
        double diff = this.getbal()-amt;
        if (diff<500){
            System.out.println("Cannot withdraw money");
        }
        else{
            super.withdraw(amt);
        }
    }

}
class CurrentAccount extends BankAccount{
    public CurrentAccount(double bal){
        super(bal);
    }
    public void currinterest(){
        int r=4;
        double interest = (this.getbal()*r)/100;
        System.out.println("The interest of Current account is : Rs "+interest);
    }

}
class Bank{
    private ArrayList<Account> accounts;
    public Bank() {
        accounts = new ArrayList<>();
    }
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added!");
    }
        public void accountslist(){
        System.out.println(this.accounts);
    }
}
public class Accounting {
    public static void main(String[] args){
        Bank HDFC = new Bank();
        SavingsAccount UserSav= new SavingsAccount(600);
        HDFC.addAccount(UserSav);
        CurrentAccount UserCur = new CurrentAccount(4000);
        HDFC.addAccount(UserCur);
        UserSav.withdraw(500);
        UserSav.balance();
        UserSav.deposit(400);
        UserSav.withdraw(300);
        UserSav.balance();
        UserSav.savinterest();
        System.out.println("=================");
        UserCur.deposit(600);
        UserCur.balance();
        UserCur.currinterest();


    }

}