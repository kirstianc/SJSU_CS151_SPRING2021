//package Assignment3;

/** Represents a Part Time Employee
 * @author Ian Chavez
 */
public class PartTimeHourly extends Employee{

    // Fields
    private double baseHourlyPay;

    // Creates a contractor with basic information
    public PartTimeHourly(){
        super();
        baseHourlyPay=0.0;
    }

    /** Creates a Part Time Employee with specific information
     * @param firstName string containing Part Time Employee's first name
     * @param lastName string containing Part Time Employee's last name
     * @param address Address containing Part Time Employee's address
     * @param id int containing Part Time Employee's ID
     * @param pay double containing Part Time Employee's pay
     * @param ssn string containing Part Time Employee's SSN
     */
    public PartTimeHourly(String firstName, String lastName, Address address, int id, double pay, String ssn){
        super(firstName, lastName, address, id, ssn);
        baseHourlyPay=pay;
    }

    /** Gets Part Time Employee's base pay
     * @return double containing Part Time Employee's base pay
     */
    public double getBaseHourlyPay() {
        return baseHourlyPay;
    }

    /** Set Part Time Employee's base pay
     * @param pay double containing Part Time Employee's base pay
     */
    public void setBaseHourlyPay(double pay){
        baseHourlyPay=pay;
    }

    /** Overrides toString to customize for this class' fields
     * @return string containing relevant information for this class
     */
    @Override
    public String toString(){
        return super.toString()+", Base Hourly Pay: "+baseHourlyPay;
    }

    /** Display toString information to command line, if displaySSN is false then do not display SSN
     * @param displaySSN boolean deciding whether or not to display SSN
     */
    public void introduce(boolean displaySSN){
        if(displaySSN) {
            System.out.println(toString());
        }
        System.out.println(getFname() + " " + getLname() + ", age: " + getAge() +", Address: " + getAddress()+ ", ID: "
                +getId()+", Education Level: "+getEducationLevel()+", Direct Deposit: "+getDirectDeposit()+", Salary: "+getBaseHourlyPay());
    }

    /** Calculates payment due to Part Time Employee's for given amount of hours
     * @param numHrs int containing how many hours Part Time Employee's will be paid for
     * @return payment due to Part Time Employee's for given amount of hours
     */
    public double computePay(int numHrs){
        if(numHrs>40){
            return -1;
        }
        else{
            return baseHourlyPay*numHrs;
        }
    }

}
