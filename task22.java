public class task22 {
    public static void main(String[] args) {
        SavingnsAccount s=new SavingnsAccount();
        s.balance=50000.0;
        s.displayAccountType();
        System.out.println(s.calculateInterest());
    }
}
abstract class BankAccount{
    abstract double calculateInterest();
    void displayAccountType(){
        System.out.println("Bank Account Deatails");
    }
}
class SavingnsAccount extends BankAccount{
    double balance;
    @Override 
    double calculateInterest(){
        return balance*0.05;
    }
}