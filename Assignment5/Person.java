//package Assignment5;

/** Represents a person.
 * @author Ian Chavez
 */
public class Person {

    // Fields
    private String Fname;
    private String Lname;
    private int age;

    // Creates a person with preset information
    public Person() {
        Fname = "First Name";
        Lname = "Last Name";
        age = 0;
    }

    /** Creates a person with same fields as person inputted
     * @param p, person to copy fields
     */
    public Person(Person p){
        Fname=p.Fname;
        Lname=p.Lname;
        age=p.age;
    }

    /** Creates a person with the specified information
     * @param f, First name
     * @param l, Last name
     * @param a, Age
     */
    public Person(String f, String l, int a) {
        Fname = f;
        Lname = l;
        age = a;
    }

    /** Gets the person's first name
     * @return String representing the first name of the person
     */
    public String getFname() {
        return Fname;
    }

    /** Sets the person's first name
     * @param f, String containing the person's first name
     */
    public void setFname(String f) {
        Fname = f;
    }

    /** Gets the person's last name
     * @return String representing the last name of the person
     */
    public String getLname() {
        return Lname;
    }

    /** Sets the person's last name
     * @param l, String containing the person's last name
     */
    public void setLname(String l) {
        Lname = l;
    }

    /** Gets the person's age
     * @return age, int containing a person's age
     */
    public int getAge(){
        return age;
    }

    /** Sets the person's age
     * @param a, int containing the person's age
     */
    public void setAge(int a) {
        age = a;
    }

    /** Overrides toString to customize for this class
     * @return String containing all fields in the class
     */
    @Override
    public String toString() {
        return Fname + " " + Lname + ", age: " + age;
    }

    // Prints out toString for this class
    public void introduce() {
        System.out.println(this.toString());
    }

}