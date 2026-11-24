public class task31 {
    public static void main(String[] args) {
        Product p1=new Product();
        Product p2=new Product("canon");
        Product p3=new Product("cona", 100, 200);
        p1.calculateTotal();
        p2.calculateTotal();
        p3.calculateTotal();
    }
    
}
class Product{
    String productName;
    int quantity;
    double price;
    Product(){
       productName = "Unknown";
       quantity = 1;
        price = 100;
    }
    Product(String productName){
        productName="canon";
        this.quantity=quantity;
        this.price=price;

    }
    Product(String productName, int quantity, double price){
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
    }
    void calculateTotal(){
        System.out.println(productName);
        System.err.println(quantity);
        System.out.println(price);
        System.out.println("Total Price: ₹" + (quantity * price));
    }

}