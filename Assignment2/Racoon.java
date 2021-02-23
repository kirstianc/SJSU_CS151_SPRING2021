package Assignment2;

/** Represents a Racoon
 * @author Ian Chavez
 */
public class Racoon extends Animal implements Scratcher{

    // Creates a racoon with specified information
    public Racoon(String name, int age, String gender, int speed){
        super("racoon", name, age, gender, "forest", speed);
    }

    // Prints "scratch", implemented from Scratcher
    public void scratch(){
        System.out.println("scratches");
    }
}
