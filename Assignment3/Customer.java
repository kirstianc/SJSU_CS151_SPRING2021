//package Assignment3;

/** Represents a Customer
 * @author Ian Chavez
 */
public class Customer extends Person {

    // Fields
    int customerID;
    String payPreference;

    // Creates a Customer with basic information
    public Customer(){
        super();
        customerID=0;
        payPreference="Pay Preference";
    }

    /** Creates a Customer with specified information
     * @param firstName string containing customer's first name
     * @param lastName string containing customer's last name
     * @param address Address containing customer's address
     * @param id int containing customer's Customer ID
     * @param ssn string containing customer's SSN
     */
    public Customer(String firstName, String lastName, Address address, int id, String ssn){
        super(firstName, lastName,21,  address, ssn);
        customerID=id;
        payPreference="Pay Preference";
    }

    /** Gets customer's Customer ID
     * @return int containing customer's Customer ID
     */
    public int getID(){
        return customerID;
    }

    /** Sets customer's Customer ID
     * @param id int containing customer's Customer ID
     */
    public void setID(int id){
        customerID=id;
    }

    /** Gets customer's pay preference
     * @return string containing customer's pay preference
     */
    public String getPayPreference(){
        return payPreference;
    }

    /** Sets customer's pay preference
     * @param payPreference string containing customer's pay preference
     */
    public void setPayPreference(String payPreference){
        this.payPreference=payPreference;
    }

    /** Overrides toString to customize for this class' fields
     * @return String containing relevant information for this class
     */
    @Override
    public String toString(){
        return super.toString()+", Customer ID: "+customerID+", Pay Preference: "+payPreference;
    }

    // Display toString information to command line
    public void introduce(){
        System.out.println(getFname() + " " + getLname() + ", age: " + getAge() +", Address: " + getAddress()+", Customer ID: "+customerID+", Pay Preference: "+payPreference);
    }

    // Displays preferred method of payment on command line
    public void makePayment(){
        System.out.println(payPreference);
    }
}
