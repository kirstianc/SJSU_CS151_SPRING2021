//package Assignment3;

/** Represents a Contractor
 * @author Ian Chavez
 */
public class Contractor extends Employee{

    // Fields
    private double basePay;

    // Creates a contractor with basic information
    public Contractor(){
        super();
        basePay=0.0;
    }

    /** Creates a contractor with specific information
     * @param firstName string containing contractor's first name
     * @param lastName string containing contractor's last name
     * @param address Address containing contractor's address
     * @param id int containing contractor's ID
     * @param pay double containing contractor's pay
     * @param ssn string containing contractor's SSN
     */
    public Contractor(String firstName, String lastName, Address address, int id, double pay, String ssn){
        super(firstName, lastName, address, id, ssn);
        basePay=pay;
    }

    /** Gets contractor's base pay
     * @return double containing contractor's base pay
     */
    public double getBasePay() {
        return basePay;
    }

    /** Set contractor's base pay
     * @param pay double containing contractor's base pay
     */
    public void setBasePay(double pay){
        basePay=pay;
    }

    /** Overrides toString to customize for this class' fields
     * @return string containing relevant information for this class
     */
    @Override
    public String toString(){
        return super.toString()+", Base Pay: "+basePay;
    }

    /** Display toString information to command line, if displaySSN is false then do not display SSN
     * @param displaySSN boolean deciding whether or not to display SSN
     */
    public void introduce(boolean displaySSN){
        if(displaySSN) {
            System.out.println(toString());
        }
        System.out.println(getFname() + " " + getLname() + ", age: " + getAge() +", Address: " + getAddress()+ ", ID: "
                +getId()+", Education Level: "+getEducationLevel()+", Direct Deposit: "+getDirectDeposit()+", Base Pay: "+basePay);
    }

    /** Calculates payment due to contractor for given amount of hours
     * @param numHrs int containing how many hours contractor will be paid for
     * @return payment due to contractor for given amount of hours
     */
    public double computePay(int numHrs){
        return basePay*numHrs;
    }

}
