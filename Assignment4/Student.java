//package Assignment4;

/** Represents a Student
 * @author Ian Chavez
 */
public class Student implements Cloneable{
    // Fields
    private String fname;
    private String lname;
    private int age;
    private float gpa;
    private String major;
    private String department;
    private Course course;

    /** Creates a Student with preset information
     */
    public Student(){
        fname="First Name";
        lname="Last Name";
        age=0;
        gpa=0.0f;
        major="Major";
        department="Department";
        course=new Course();
    }

    /** Creates a Student with specified parameters
     * @param fname String containing first name of Student
     * @param lname String containing last name of Student
     * @param age int containing age of Student
     * @param gpa float containing gpa of Student
     * @param major String containing major of Student
     * @param department String containing department of Student
     * @param course Course of the Student
     */
    public Student(String fname, String lname, int age, float gpa, String major, String department, Course course){
        this.fname=fname;
        this.lname=lname;
        this.age=age;
        this.gpa=gpa;
        this.major=major;
        this.department=department;
        this.course=course;
    }

    /** Provides first name of Student
     * @return String containing first name of Student
     */
    public String getFname() {
        return fname;
    }

    /** Sets first name of Student
     * @param fname String containing first name of Student
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /** Provides last name of Student
      * @return String containing last name of Student
     */
    public String getLname() {
        return lname;
    }

    /** Sets last name of Student
     * @param lname String containing last name of Student
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /** Provides age of Student
     * @return int containing age of Student
     */
    public int getAge() {
        return age;
    }

    /** Sets age of Student
     * @param age int containing age of Student
     */
    public void setAge(int age) {
        this.age = age;
    }

    /** Provides GPA of Student
     * @return float containing gpa of Student
     */
    public float getGpa() {
        return gpa;
    }

    /** Sets GPA of Student
     * @param gpa float containing gpa of Student
     */
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    /** Provides major of Student
     * @return String containing major of Student
     */
    public String getMajor() {
        return major;
    }

    /** Sets major of Student
     * @param major String containing major of Student
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /** Provides department of Student
     * @return String containing department of Student
     */
    public String getDepartment() {
        return department;
    }

    /** Sets department of Student
     * @param department String containing department of Student
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /** Provides Course of Student
     * @return Course of Student
     */
    public Course getCourse() {
        return course;
    }

    /** Sets Course of Student
     * @param course Course of Student
     */
    public void setCourse(Course course) {
        this.course = course;
    }

    // Prints values of Student instance to command line
    public void printInfo(){
        System.out.println(toString());
    }

    /** Overrides clone() from interface Cloneable
     * @return deep clone of current Student object
     */
    @Override
    public Student clone(){
        Course clonedCourse = course.clone();
        return new Student(fname, lname, age, gpa, major, department, clonedCourse);
    }

    /** Overrides toString() to be customized for this class
     * @return String containing parameters for this class
     */
    @Override
    public String toString(){
        return fname+" "+lname+", "+age+" year old, "+gpa+" gpa, "+major+" major, "+department+
                " department. This student will be taking a single course with the following details: "+course.toString();
    }
}
