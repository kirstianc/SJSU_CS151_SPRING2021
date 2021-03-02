//package Assignment3;

/** Represents a Full Time Hourly Employee
 * @author Ian Chavez
 */
public class FullTimeHourly extends FullTimeEmployee{

    // Fields
    private double overtimePay;

    // Creates a contractor with basic information
    public FullTimeHourly(){
        super();
        overtimePay=0.0;
    }

    /** Creates a Part Time Employee with specific information
     * @param firstName string containing Full Time Employee's first name
     * @param lastName string containing Full Time Employee's last name
     * @param address Address containing Full Time Employee's address
     * @param id int containing Full Time Employee's ID
     * @param basePay double containing Full Time Employee's pay
     * @param ssn string containing Full Time Employee's SSN
     */
    public FullTimeHourly(String firstName, String lastName, Address address, int id, double basePay, String ssn){
        super(firstName, lastName, address, id, basePay, ssn);
        overtimePay=basePay;
    }

    /** Gets Full Time Employee's base pay
     * @return double containing Full Time Employee's base pay
     */
    public double getOvertimePay() {
        return overtimePay;
    }

    /** Set Full Time Employee's base pay
     * @param pay double containing Full Time Employee's base pay
     */
    public void setOvertime(double pay){
        overtimePay=pay;
    }

    /** Overrides toString to customize for this class' fields
     * @return string containing relevant information for this class
     */
    @Override
    public String toString(){
        return super.toString()+", Overtime Pay: "+overtimePay;
    }

    /** Display toString information to command line, if displaySSN is false then do not display SSN
     * @param displaySSN boolean deciding whether or not to display SSN
     */
    public void introduce(boolean displaySSN){
        if(displaySSN) {
            System.out.println(toString());
        }
        System.out.println(getFname() + " " + getLname() + ", age: " + getAge() +", Address: " + getAddress()+ ", ID: "
                +getId()+", Education Level: "+getEducationLevel()+", Direct Deposit: "+getDirectDeposit()+", Overtime Pay: "+overtimePay);
    }

    /** Calculates payment due to Full Time Employee's for given amount of hours
     * @param numHrs int containing how many hours Full Time Employee's will be paid for
     * @return payment due to Full Time Employee's for given amount of hours
     */
    public double computePay(int numHrs){
        if(numHrs>40){
            return (getBasePay()*40)+(overtimePay*(numHrs-40));
        }
        else{
            return getBasePay()*numHrs;
        }
    }

}
