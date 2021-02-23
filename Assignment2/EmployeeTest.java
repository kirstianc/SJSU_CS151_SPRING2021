//package Assignment2;

/** Used to test Employee class
 * @author Ian Chavez
 */
public class EmployeeTest {

    // Create Employee instances provided in CS151 HW2 document, exercise 3
    public static void main(String[] args){

        // Joe Smith, age 30, SSN 1, address Apartment1, gender M, weight 100.0, ID 1, contractor, pay 60/hr, worked 30 hr
        Person jp = new Person("Joe", "Smith", 30, "1", "Apartment1", "M", 100.0);
        Employee je = new Employee(jp, 1, "contractor", 60);
        je.introduce();
        System.out.println("Paid: "+je.calculatePay(30)+"\n");

        // Lisa Gray, age 31, SSN 2, address Apartment2, gender F, weight 100.0, ID 2, full time, pay 110000/yr, worked 2 weeks
        Person lp = new Person("Lisa", "Gray", 31, "2", "Apartment2", "F", 100.0);
        Employee le = new Employee(lp, 2, "full time", 110000);
        le.introduce();
        System.out.println("Paid: "+le.calculatePay(2)+"\n");

        // Timothy Briggs, age 32, SSN 3, address Apartment3, gender M, weight 100.0, ID 3, full time, pay 80000/hr, worked 4 weeks
        Person tp = new Person("Timothy", "Briggs", 32, "3", "Apartment3", "M", 100.0);
        Employee te = new Employee(tp, 3, "full time", 80000);
        te.introduce();
        System.out.println("Paid: "+te.calculatePay(4)+"\n");

        // George Wallace, age 33, SSN 4, address Apartment4, gender M, weight 100.0, ID 4, part time, pay 20/hr, worked 25 hr
        Person gp = new Person("George", "Wallace", 33, "4", "Apartment4", "M", 100.0);
        Employee ge = new Employee(gp, 4, "part time", 20);
        ge.introduce();
        System.out.println("Paid: "+ge.calculatePay(25)+"\n");

        // Amy Student, age 34, SSN 5, address Apartment5, gender F, weight 100.0, ID 5, contractor, pay 45/hr, worked 45 hr
        Person ap = new Person("Amy", "Student", 34, "5", "Apartment5", "F", 100.0);
        Employee ae = new Employee(ap, 5, "contractor", 45);
        ae.introduce();
        System.out.println("Paid: "+ae.calculatePay(45)+"\n");

    }
}
