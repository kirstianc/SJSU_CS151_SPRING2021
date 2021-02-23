package Assignment2;

/** Represents a person.
 * @author Ian Chavez
 */
public class Person {

    // Fields
    private String Fname;
    private String Lname;
    private int age;
    private String SSN;
    private String address;
    private String gender;
    private double weight;

    // Creates a person with preset information
    public Person() {
        Fname = "First Name";
        Lname = "Last Name";
        age = 0;
        SSN = "Social Security Number";
        address = "Address";
        gender = "M";
        weight = 0.0;
    }

    /** Creates a person with same fields as person inputted
     * @param p, person to copy fields
     */
    public Person(Person p){
        Fname=p.Fname;
        Lname=p.Lname;
        age=p.age;
        SSN=p.SSN;
        address=p.address;
        gender=p.gender;
        weight=p.weight;
    }

    /** Creates a person with the specified information
     * @param f, First name
     * @param l, Last name
     * @param a, Age
     * @param ssn, Social Security Number
     * @param ad, Address
     * @param g, Gender
     * @param w, Weight
     */
    public Person(String f, String l, int a, String ssn, String ad, String g, double w) {
        Fname = f;
        Lname = l;
        age = a;
        SSN = ssn;
        address = ad;
        gender = g;
        weight = w;
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

    /** Gets the person's Social Security Number
     * @return SSN, String containing the person's Social Security Number
     */
    public String getSSN(){
        return SSN;
    }

    /** Sets the person's SSN
     * @param s, String containing the person's Social Security Number
     */
    public void setSSN(String s) {
        SSN = s;
    }

    /** Gets the person's address
     * @return address, String containing the person's address
     */
    public String getAddress(){
        return address;
    }

    /** Sets the person's address
     * @param a, String containing the person's address
     */
    public void setAddress(String a) {
        address = a;
    }

    /** Gets the person's gender
     * @return gender, String containing person's gender
     */
    public String getGender(){
        return gender;
    }

    /** Sets the person's gender
     * @param g, String containing person's gender
     */
    public void setGender(String g) {
        gender = g;
    }

    /** Gets the person's weight
     * @return weight, double containing person's weight
     */
    public double getWeight(){
        return weight;
    }

    /** Sets the person's weight
     * @param w, double containing person's weight
     */
    public void setWeight(double w) {
        weight = w;
    }

    /** Overrides toString to customize for this class
     * @return String containing all fields in the class
     */
    @Override
    public String toString() {
        return Fname + " " + Lname + ", age: " + age + ", SSN: " + SSN + ", Address: " + address + ", Gender: " + gender + ", Weight: " + weight;
    }

    // Prints out toString for this class
    public void introduce() {
        System.out.println(this.toString());
    }

}