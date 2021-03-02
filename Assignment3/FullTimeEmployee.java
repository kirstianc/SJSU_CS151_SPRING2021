//package Assignment3;

/** Represents a Full Time Employee
 * @author Ian Chavez
 */
public class FullTimeEmployee extends Employee{

    // Fields
    private double basePay;

    // Creates a contractor with basic information
    public FullTimeEmployee(){
        super();
        basePay=0.0;
    }

    /** Creates a Full Time Employee with specific information
     * @param firstName string containing Full Time Employee's first name
     * @param lastName string containing Full Time Employee's last name
     * @param address Address containing Full Time Employee's address
     * @param id int containing Full Time Employee's ID
     * @param basePay double containing Full Time Employee's pay
     * @param ssn string containing Full Time Employee's SSN
     */
    public FullTimeEmployee(String firstName, String lastName, Address address, int id, double basePay, String ssn){
        super(firstName, lastName, address, id, ssn);
        this.basePay=basePay;
    }

    /** Gets Full Time Employee's base pay
     * @return double containing Full Time Employee's base pay
     */
    public double getBasePay() {
        return basePay;
    }

    /** Set Full Time Employee's base pay
     * @param pay double containing Full Time Employee's base pay
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

}
