//package Assignment2;

/** Used to test Student class
 * @author Ian Chavez
 */
public class StudentTest{

	// Creates a Student: John Smith, age 20, gpa 3.6, Major Computer Science, Department School of Computer Science
	public static void main(String[] args){
		Student j = new Student("John", "Smith", 20, 3.6f, "Computer Science", "School of Computer Science");
		j.new Course().printSchedule();
	}

}