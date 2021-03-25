//package Assignment5;
//import java.util.*;

/** Represents a Student
 * @author Ian Chavez
 */
public class Student {
    // Fields
    private String fname;
    private String lname;
    private int age;
    private float gpa;
    private String major;
    private String department;
    private LinkedList<Course> courses;

    /** Creates a Student with preset information
     */
    public Student(){
        fname="First Name";
        lname="Last Name";
        age=0;
        gpa=0.0f;
        major="Major";
        department="Department";
        courses=new LinkedList<Course>();
    }

    /** Creates a Student with specified parameters
     * @param fname String containing first name of Student
     * @param lname String containing last name of Student
     * @param age int containing age of Student
     * @param gpa float containing gpa of Student
     * @param major String containing major of Student
     * @param department String containing department of Student
     * @param courses Course of the Student
     */
    public Student(String fname, String lname, int age, float gpa, String major, String department, LinkedList<Course> courses){
        this.fname=fname;
        this.lname=lname;
        this.age=age;
        this.gpa=gpa;
        this.major=major;
        this.department=department;
        this.courses=courses;
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

    /** Provides Courses of Student
     * @return Courses of Student
     */
    public LinkedList<Course> getCourse() {
        return courses;
    }

    /** Adds the specified course from the Course list
     * @param course specified course
     */
    public void addCourse(Course course) {
        courses.add(course);
    }

    /** Removes the specified course from the Course list
     * @param course specified course
     */
    public void removeCourse(Course course) {
        courses.remove(course);
    }

    /** Sorts courses based on specific attribute,
     * @param ascending Boolean deciding whether the sort will be ascending or descending, true being ascending and false being descending
     * @param attribute String containing specific attribute that will be used to sort
     */
    public void sortCourses(Boolean ascending, String attribute) {
        if(attribute.equals("name")){
            Collections.sort(courses, new CourseNameComparator());
        }
        if(attribute.equals("description")){
            Collections.sort(courses, new CourseDescriptionComparator());
        }
        if(attribute.equals("department")){
            Collections.sort(courses, new CourseDepartmentComparator());
        }
        if(attribute.equals("time")){
            Collections.sort(courses, new CourseTimeComparator());
        }
        if(attribute.equals("weekday")){
            Collections.sort(courses, new CourseWeekdayComparator());
        }
        if(!ascending){
            Collections.reverse(courses);
        }
        System.out.println(courses);
    }

    // Custom Comparator for Name
    public class CourseNameComparator implements Comparator<Course> {
        @Override
        public int compare(Course c1, Course c2) {
            return Integer.compare(c1.getName().charAt(0), c2.getName().charAt(0));
        }

    }

    // Custom Comparator for Description
    public class CourseDescriptionComparator implements Comparator<Course> {
        @Override
        public int compare(Course c1, Course c2) {
            return Integer.compare(c1.getDescription().charAt(0), c2.getDescription().charAt(0));
        }

    }

    // Custom Comparator for Department
    public class CourseDepartmentComparator implements Comparator<Course> {
        @Override
        public int compare(Course c1, Course c2) {
            return Integer.compare(c1.getDepartment().charAt(0), c2.getDepartment().charAt(0));
        }

    }

    // Custom Comparator for Time
    public class CourseTimeComparator implements Comparator<Course> {
        @Override
        public int compare(Course c1, Course c2) {
            return Integer.compare(c1.getTime().charAt(0), c2.getTime().charAt(0));
        }

    }

    // Custom Comparator for Weekday
    public class CourseWeekdayComparator implements Comparator<Course> {
        @Override
        public int compare(Course c1, Course c2) {
            return Integer.compare(c1.getWeekday().charAt(0), c2.getWeekday().charAt(0));
        }

    }

    /** Overrides toString() to be customized for this class
     * @return String containing parameters for this class
     */
    @Override
    public String toString(){
        return fname+" "+lname+", "+age+" year old, "+gpa+" gpa, "+major+" major, "+department+
                " department. This student will be taking a single course with the following details: "+courses.toString();
    }
}
