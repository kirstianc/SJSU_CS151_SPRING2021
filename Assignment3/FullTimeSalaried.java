//package Assignment3;

public class FullTimeSalaried extends FullTimeEmployee{

    // Creates a Salaried Full Time employee with basic information
    public FullTimeSalaried(){
        super();
    }

    /** Creates a Salaried Full Time employee with basic information
     * @param firstName string containing Salaried Full Time Employee's first name
     * @param lastName string containing Salaried Full Time Employee's last name
     * @param address Address containing Salaried Full Time Employee's address
     * @param id int containing Salaried Full Time Employee's ID
     * @param salary double containing Salaried Full Time Employee's salary
     * @param ssn string containing Salaried Full Time Employee's SSN
     */
    public FullTimeSalaried(String firstName, String lastName, Address address, int id, double salary, String ssn){
        super(firstName, lastName, address, id, salary, ssn);
    }

    /** Overrides toString to customize for this class' fields
     * @return string containing relevant information for this class
     */
    @Override
    public String toString(){
        return super.toString();
    }

    /** Display toString information to command line, if displaySSN is false then do not display SSN
     * @param displaySSN boolean deciding whether or not to display SSN
     */
    public void introduce(boolean displaySSN){
        if(displaySSN) {
            System.out.println(toString());
        }
        System.out.println(getFname() + " " + getLname() + ", age: " + getAge() +", Address: " + getAddress()+ ", ID: "
                +getId()+", Education Level: "+getEducationLevel()+", Direct Deposit: "+getDirectDeposit()+", Salary: "+getBasePay());
    }

    /** Calculates payment due to Salaried Full Time Employee's for given amount of weeks
     * @param numWeeks int containing how many weeks Salaried Full Time Employee's will be paid for
     * @return payment due to Salaried Full Time Employee's for given amount of weeks
     */
    public double computePay(int numWeeks){
        return getBasePay()*(numWeeks/52);
    }

}
