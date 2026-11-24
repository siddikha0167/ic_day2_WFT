public class task26 {
    public static void main(String[] args) {
        Alert a=new EmailAlert();
        Alert a1=new MobileAlert();
        a.sendAlert("send");
        a1.sendAlert("send");
    }
}
interface Alert{
    void sendAlert(String message);
}
class EmailAlert implements Alert{
    public void sendAlert(String message){
        System.out.println("Email Alert "+message);
    }
}
class MobileAlert implements Alert{
    public void sendAlert(String message){
        System.out.println("Mobile Alert "+message);
    }
}