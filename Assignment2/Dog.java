//package Assignment2;

/** Represents a Dog
 * @author Ian Chavez
 */
public class Dog extends Animal implements Domesticated{

    // Creates dog using specified information
    public Dog(String name, int age, String gender, int speed){
        super("dog", name, age, gender, "home", speed);
    }

    // Prints "walks", implemented from Domesticated
    public void walk(){
        System.out.println("walks");
    }

    // Prints "greets human", implemented from Domesticated
    public void greetHuman(){
        System.out.println("greets human");
    }

    // Prints "bark"
    public void bark(){
        System.out.println("barks");
    }
}
