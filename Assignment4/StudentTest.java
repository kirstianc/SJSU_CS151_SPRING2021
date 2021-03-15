//package Assignment4;

public class StudentTest {
    public static void main(String[] args) {
        Course c1 = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00pm", "Tue");
        Student s1 = new Student("John", "Smith", 20, 3.6f, "Computer Science", "School of Computer Science", c1);
        Student s2 = s1.clone();
        s1.printInfo();
        s2.printInfo();
    }
}
