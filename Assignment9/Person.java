//package Assignment9;

/** Represents a person.
 * @author Ian Chavez
 */
public class Person {

    // Fields
    private String Fname;
    private String Lname;
    private int age;
    private String SSN;
    private Address address;

    // Creates a person with preset information
    public Person() {
        Fname = "First Name";
        Lname = "Last Name";
        age = 0;
        SSN = "Social Security Number";
        address = new Address(0, "Street Name", "City", "Zip", "State");
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
    }

    /** Creates a person with the specified information
     * @param f, First name
     * @param l, Last name
     * @param a, Age
     * @param ssn, Social Security Number
     * @param ad, Address
     */
    public Person(String f, String l, int a, Address ad, String ssn) {
        Fname = f;
        Lname = l;
        age = a;
        SSN = ssn;
        address = ad;
    }

    /** Gets the person's first name
     * @return String representing the first name of the person
     */
    public String getFirstName() {
        return Fname;
    }

    /** Sets the person's first name
     * @param f, String containing the person's first name
     */
    public void setFirstName(String f) {
        Fname = f;
    }

    /** Gets the person's last name
     * @return String representing the last name of the person
     */
    public String getLastName() {
        return Lname;
    }

    /** Sets the person's last name
     * @param l, String containing the person's last name
     */
    public void setLastName(String l) {
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
    public Address getAddress(){
        return address;
    }

    /** Sets the person's address
     * @param a, String containing the person's address
     */
    public void setAddress(Address a) {
        address = a;
    }


    /** Overrides toString to customize for this class
     * @return String containing all fields in the class
     */
    @Override
    public String toString() {
        return Fname + " " + Lname + ", age: " + age + ", SSN: " + SSN + ", Address: " + address;
    }

    // Prints out toString for this class
    public void introduce() {
        System.out.println(this.toString());
    }

}