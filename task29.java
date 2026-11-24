public class task29{
    public static void main(String[] args) {
        mobile m=new mobile();
        m.displayDetail();
    }
    
}
class mobile{
    String brand;
    double price;
    mobile(){
        brand="samsung";
        price=25000;
    
    }
    void displayDetail(){
        System.out.println(brand);
        System.out.println(price);
    }
}