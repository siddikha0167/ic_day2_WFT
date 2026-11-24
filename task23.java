public class task23 {
    public static void main(String[] args) {
        upipayment up=new upipayment(20000);
        up.showAmount();
        up.processPayment();
    }
    
}
abstract class payment{
    double amount;
    payment(double amount){
        this.amount=amount;

    }
    void showAmount(){
        System.out.println("Payment Amount: ₹" + amount);
    }
    abstract void processPayment();
}
class upipayment extends payment{
    upipayment(double amount){
        super(amount);
        this.amount=amount;
    }
    @Override 
    void processPayment(){
        System.out.println( "Payment processed successfully using UPI");
    }
}