public class task30 {
    public static void main(String[] args) {
        Course c=new Course("Web Development", 6, 5000.0);
        c.displayCourse();
    }
}
class Course{
    String courseName;
    int duration;
    double fee;
    Course(String courseName,int duration,double fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    void displayCourse(){
        System.out.println(courseName+"\n"+duration+"\n"+fee);
    }
}