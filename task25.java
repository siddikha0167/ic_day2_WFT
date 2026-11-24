public class task25 {
    public static void main(String[] args) {
         PaymentGateway p1 = new Googlepay(); 
         PaymentGateway p2 = new Phonepe();
         p1.makePayment();
         p2.makePayment();
    }
}
interface PaymentGateway{
    abstract void makePayment();

}
class Googlepay implements PaymentGateway{
    public void makePayment(){
        System.out.println( "Payment completed using Google Pay");
    }
}
class Phonepe implements PaymentGateway{
    public void makePayment(){
        System.out.println("Payment completed using PhonePe");
    }
}