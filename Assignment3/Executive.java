//package Assignment3;

/** Represents an Executive
 * @author Ian Chavez
 */
public class Executive extends Employee {

    // Fields
    private double yearlyBonus;
    private double yearlyCompensation;

    // Creates an Executive with basic information
    public Executive(){
        super();
        yearlyBonus=0.0;
        yearlyCompensation=0.0;
    }

    /** Creates an Executive with specified information
     * @param firstName string containing executive's first name
     * @param lastName string containing executive's last name
     * @param address Address containing executive's address
     * @param id int containing executive's ID
     * @param pay double containing executive's yearly compensation
     * @param bonus double containing executive's yearly bonus
     * @param ssn string containing executive's SSN
     */
    public Executive(String firstName, String lastName, Address address, int id, double pay, double bonus, String ssn){
        super(firstName, lastName, address, id, ssn);
        yearlyCompensation=pay;
        yearlyBonus=bonus;
    }

    /** Get executive's yearly bonus
     * @return double containing executive's yearly bonus
     */
    public double getYearlyBonus(){
        return yearlyBonus;
    }

    /** Set executive's yearly bonus
     * @param bonus double containing executive's yearly bonus
     */
    public void setYearlyBonus(double bonus){
        yearlyBonus=bonus;
    }

    /** Get executive's yearly compensation
     * @return double containing executive's yearly compensation
     */
    public double getYearlyCompensation(){
        return yearlyCompensation;
    }

    /** Set executive's yearly compensation
     * @param compensation double containing executive's yearly compensation
     */
    public void setYearlyCompensation(double compensation){
        yearlyCompensation=compensation;
    }

    /** Overrides toString to customize for this class' fields
     * @return string containing relevant information for this class
     */
    @Override
    public String toString(){
        return super.toString()+", Yearly bonus: "+yearlyBonus+", Yearly compensation: "+yearlyCompensation;
    }

    /** Display toString information to command line, if displaySSN is false then do not display SSN
     * @param displaySSN boolean deciding whether or not to display SSN
     */
    public void introduce(boolean displaySSN){
        if(displaySSN) {
            System.out.println(toString());
        }
        System.out.println(getFname() + " " + getLname() + ", age: " + getAge() +", Address: " + getAddress()+ ", ID: "
                +getId()+", Education Level: "+getEducationLevel()+", Yearly bonus: "+yearlyBonus+", Yearly compensation: "+yearlyCompensation);
    }

    // Calculates pay of the executive (compensation + bonus)
    public double computePay(){
        return yearlyCompensation+yearlyBonus;
    }
}
