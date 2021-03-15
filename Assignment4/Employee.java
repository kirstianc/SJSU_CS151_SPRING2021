//package Assignment4;

public class Employee {
    // Fields
    private String fname;
    private String lname;
    private String eid;
    private int pay;

    // Creates an employee with preset information
    public Employee(){
        fname="First";
        lname="Last";
        eid="000";
        pay=0;
    }

    /** Creates an employee with specified information
     * @param fname String containing first name
     * @param lname String containing last name
     * @param eid String containing employee id
     * @param pay
     */
    public Employee(String fname, String lname, String eid, int pay){
        this.fname=fname;
        this.lname=lname;
        this.eid=eid;
        this.pay=pay;
    }

    /** Provides first name
     * @return String containing first name
     */
    public String getFname() {
        return fname;
    }

    /** Sets first name
     * @param fname String containing first name
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /** Provides last name
     * @return String containing last name
     */
    public String getLname() {
        return lname;
    }

    /** Sets last name
     * @param lname String containing last name
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /** Provides employee id
     * @return String containing employee id
     */
    public String getEid() {
        return eid;
    }

    /** Sets employee id
     * @param eid String containing employee id
     */
    public void setEid(String eid) {
        this.eid = eid;
    }

    /** Provides employee pay
     * @return int containing employee pay
     */
    public int getPay() {
        return pay;
    }

    /** Sets employee pay
     * @param pay int containing employee pay
     */
    public void setPay(int pay) {
        this.pay = pay;
    }

    /** Computes pay owed to employee
     * @param hours int containing amount of hours employee worked
     * @return float containing amount of money due
     * @throws NumberFormatException, if hours is less than 0
     * @throws TooManyHoursWorkedException, if hours is more than 40
     */
    public float computePay(int hours){
        try {
            if (hours < 0) {
                throw new NumberFormatException();
            } else if (hours > 40) {
                throw new TooManyHoursWorkedException("Worked too many hours!");
            }

        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException occurred.");
        }
        catch(TooManyHoursWorkedException e){
            System.out.println("TooManyHoursWorkedException occurred.");

        }
        return (float)(pay*hours);
    }

    // Defines TooManyHoursWorked exception for computePay()
    public class TooManyHoursWorkedException extends Exception{
        public TooManyHoursWorkedException(String errorMessage){
            super(errorMessage);
        }
    }
}
