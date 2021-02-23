//package Assignment2;

/** Represents a Cat
 * @author Ian Chavez
 */
public class Cat extends Animal implements Domesticated, Scratcher{

    // Creates cat with specified information
    public Cat(String name, int age, String gender, int speed){
        super("cat", name, age, gender, "home", speed);
    }

    // Prints "walks", implemented from Domesticated
    public void walk(){
        System.out.println("walks");
    }

    // Prints "greets human", implemented from Domesticated
    public void greetHuman(){
        System.out.println("greets human");
    }

    // Prints "scratch", implemented from Scratcher
    public void scratch(){
        System.out.println("scratches");
    }
}
