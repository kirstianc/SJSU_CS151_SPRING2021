package Assignment2;

/** Represents a Whale
 * @author Ian Chavez
 */
public class Whale extends Animal implements Swimmer{

    public Whale(String name, int age, String gender, int speed){
        super("whale", name, age, gender, "ocean", speed);
    }

    // Prints out "swims", implemented from Swimmer
    public void swim(){
        System.out.println("swims");
    }
}
