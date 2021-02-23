package Assignment2;

/** Tests Animal and child classes for CS151 HW 2, Exercise 5
 * @author Ian Chavez
 */
public class AnimalTest {

    // Creates instances of every child class and calls each functionality
    public static void main(String[] args){

        // Tests Dog's functionality
        Dog d = new Dog("Churro", 5, "M", 5);
        System.out.println(d.toString());
        d.move();
        d.sound();
        d.eat();
        d.sleep();
        d.walk();
        d.greetHuman();
        d.bark();
        System.out.println();

        // Tests Cat's functionality
        Cat c = new Cat("Gato", 2, "F", 5);
        System.out.println(c.toString());
        c.move();
        c.sound();
        c.eat();
        c.sleep();
        c.walk();
        c.greetHuman();
        c.scratch();
        System.out.println();

        // Tests Racoon's functionality
        Racoon r = new Racoon("Basura", 3, "M", 8);
        System.out.println(r.toString());
        r.move();
        r.sound();
        r.eat();
        r.sleep();
        r.scratch();
        System.out.println();

        // Tests Whale's functionality
        Whale w = new Whale("Blue", 50, "F", 10);
        System.out.println(w.toString());
        w.move();
        w.sound();
        w.eat();
        w.sleep();
        w.swim();
        System.out.println();
    }
}
