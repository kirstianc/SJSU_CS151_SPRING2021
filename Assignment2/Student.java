//package Assignment2;

/** Represents a Student
 * @author Ian Chavez
 */
public class Student{

    // Fields
    private String Fname;
    private String Lname;
    private int age;
    private float gpa;
    private String major;
    private String department;

    // Creates a Student with preset fields
    public Student(){
        Fname="First";
        Lname="Last";
        age=0;
        gpa=0;
        major="Major";
        department="Department";
    }

    /** Creates a Student with specified information
     * @param f, String containing Student's first name
     * @param l, String containing Student's last name
     * @param a, int containing Student's age
     * @param g, float containing Student's GPA
     * @param m, String containing Student's major
     * @param d, String containing Student's department
     */
    public Student(String f, String l, int a, float g, String m, String d){
        Fname=f;
        Lname=l;
        age=a;
        gpa=g;
        major=m;
        department=d;
    }

    /** Gets Student's first name
     * @return String containing Student's first name
     */
    public String getFname(){
        return Fname;
    }

    /** Sets Student's first name
     * @param s, String containing Student's first name
     */
    public void setFname(String s){
        Fname=s;
    }

    /** Gets Student's last name
     * @return String containing Student's last name
     */
    public String getLname(){
        return Lname;
    }

    /** Sets Student's last name
     * @param s, String containing Student's last name
     */
    public void setLname(String s){
        Lname=s;
    }

    /** Gets Student's age
     * @return int containing Student's age
     */
    public int getAge(){
        return age;
    }

    /** Sets Student's age
     * @param i, int containing Student's age
     */
    public void setAge(int i){
        age=i;
    }

    /** Gets Student's GPA
     * @return float containing Student's GPA
     */
    public float getGPA(){
        return gpa;
    }

    /** Gets Student's GPA
     * @param f, float containing Student's GPA
     */
    public void setGPA(float f){
        gpa=f;
    }

    /** Gets Student's major
     * @return String containing Student's major
     */
    public String getMajor(){
        return major;
    }

    /** Sets Student's major
     * @param s, String containing Student's major
     */
    public void setMajor(String s){
        major=s;
    }

    /** Gets Student's department
     * @return String containing Student's department
     */
    public String getDepartment(){
        return department;
    }

    /** Sets Student's department
     * @param s, String containing Student's department
     */
    public void setDepartment(String s){
        department=s;
    }

    /** Contains courses for the Student
     * @author Ian Chavez
     */
    class Course{

        // Instantiates a Course
        public Course(){}

        // Prints preset schedule
        public void printSchedule(){
            System.out.println("CS146 M/W 11am-1pm");
            System.out.println("CS151 M/W 6-7pm");
            System.out.println("POLS15 T/Th 9-10am");
        }
    }
}