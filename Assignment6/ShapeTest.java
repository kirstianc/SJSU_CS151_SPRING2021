//package Assignment6;

/** Tests all classes in this package
 * @author Ian Chavez
 */
public class ShapeTest {
    public static void main(String[] args) {

        // Instantiate objects
        Shapes testShapes = new Shapes();
        Triangle t1 = new Triangle("red", 2, 4);
        Triangle t2 = new Triangle("blue", 4, 5);
        Circle c1 = new Circle("green", 2);
        Circle c2 = new Circle("purple", 3);
        Rectangle r1 = new Rectangle("pink", 2, 4);
        Rectangle r2 = new Rectangle("white", 4, 5);
        Hexagon h1 = new Hexagon("black", 2);
        Hexagon h2 = new Hexagon("orange", 3);

        // Add objects to ArrayList
        testShapes.add(t1);
        testShapes.add(t2);
        testShapes.add(c1);
        testShapes.add(c2);
        testShapes.add(r1);
        testShapes.add(r2);
        testShapes.add(h1);
        testShapes.add(h2);

        testShapes.max();
        testShapes.min();
        System.out.println();

        new Thread() {
            public void run() {
                testShapes.compute();
            }
        }.start();

        new Thread() {
            public void run() {
                testShapes.compute();
            }
        }.start();

    }
}
