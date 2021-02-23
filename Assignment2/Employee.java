package Assignment2;

/** Represents an Employee that is also a Person
 * @author Ian Chavez
 */
public class Employee extends Person{

    // Fields
    private int id;
    private String status;
    private double basePay;

    // Creates an employee with preset information
    public Employee(){
        super();
        id=0;
        status="Not Employed";
        basePay =0.0;
    }

    /** Creates an employee with specified information
     * @param i, int containing employee's ID
     * @param s, String containing employee's status
     * @param p, double containing employee's Base Pay
     */
    public Employee(Person p, int i, String s, double pay){
        super(p);
        id=i;
        status=s;
        basePay=pay;
    }

    /** Gets employee's ID
     * @return int containing employee's ID
     */
    public int getID(){
        return id;
    }

    /** Sets employee's ID
     * @param i, int containing employee's ID
     */
    public void setID(int i){
        id=i;
    }

    /** Gets employee's status
     * @return String containing employee's status
     */
    public String getStatus(){
        return status;
    }

    /** Sets employee's status
     * @param s, String containing employee's status
     */
    public void setStatus(String s){
        status=s;
    }

    /** Gets employee's base pay
     * @return double containing employee's base pay
     */
    public double getBasePay(){
        return basePay;
    }

    /** Sets employee's base pay
     * @param p, double containing employee's base pay
     */
    public void setBasePay(double p){
        basePay =p;
    }

    /** Overrides introduce() method from Person class
     * Prints this object's person fields + fields from this class
     */
    @Override
    public void introduce(){
        System.out.println(this.toString() + ", ID: "+id+", Status: "+status+", base pay: "+basePay);
    }

    /** Calculates employee's pay
     * @param unitsWorked, double containing units employee worked
     * @return double, containing employee's pay
     */
    public double calculatePay(double unitsWorked){
        if(status.equals("full time")){
            return (basePay/52)*unitsWorked;
        }
        else{
            return basePay*unitsWorked;
        }
    }

}
