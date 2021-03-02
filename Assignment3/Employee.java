//package Assignment3;

/** Represents an employee
 * @author Ian Chavez
 */
public abstract class Employee extends Person{

    // Fields
    private int id;
    private String educationLevel;
    private boolean directDeposit;

    // Creates an employee with basic information
    public Employee(){
        super();
        id=0;
        educationLevel="Education Level";
        directDeposit=false;
    }

    /** Creates an employee with specified information
     * @param firstName string with employee's first name
     * @param lastName string with employee's last name
     * @param address string with employee's address
     * @param id int with employee's ID
     * @param ssn string with employee's ssn
     */
    public Employee(String firstName, String lastName, Address address, int id, String ssn){
        super(firstName, lastName, 21, address, ssn);
        this.id=id;
        educationLevel="Education Level";
        directDeposit=false;
    }

    /** Gets employee's ID
     * @return int containing employee's ID
     */
    public int getId(){
        return id;
    }

    /** Sets employee's ID
     * @param id int containing employee's ID
     */
    public void setId(int id){
        this.id=id;
    }

    /** Gets employee's education level
     * @return string containing employee's education level
     */
    public String getEducationLevel() {
        return educationLevel;
    }

    /** Sets employee's education level
     * @param educationLevel string containing employee's education level
     */
    public void setEducationLevel(String educationLevel){
        this.educationLevel=educationLevel;
    }

    /** Gets employee's Direct Deposit status
     * @return boolean containing employee's Direct Deposit status
     */
    public boolean getDirectDeposit(){
        return directDeposit;
    }

    /** Sets employee's Direct Deposit status
     * @param directDeposit boolean containing employee's Direct Deposit status
     */
    public void setDirectDeposit(boolean directDeposit){
        this.directDeposit=directDeposit;
    }

    /** Overrides toString to customize for this class' fields
     * @return string containing relevant information for this class
     */
    @Override
    public String toString(){
        return super.toString()+ ", ID: "+id+", Education Level: "+educationLevel+", Direct Deposit: "+directDeposit;
    }
}
