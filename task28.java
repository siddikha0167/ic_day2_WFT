public class task28 {
    public static void main(String[] args) {
        SmartDevice s=new SmartTV();
        SmartDevice s1=new SmartWatch();
        s.connectWifi();
        s.deviceStatus();
        s1.connectWifi();
        s1.deviceStatus();
    }
}
interface SmartDevice{
    abstract void connectWifi();
    default void deviceStatus(){
        System.out.println("Smart device is ready");
    }
}
class SmartTV implements SmartDevice{
    public void connectWifi(){
        System.out.println("Smart TV connected to WIFI");
    }
}
class SmartWatch implements SmartDevice{
    public void connectWifi(){
        System.out.println("Smart Watch connected to WiFi");
    }
}