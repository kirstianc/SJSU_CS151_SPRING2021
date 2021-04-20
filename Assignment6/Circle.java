//package Assignment6;

/** Represents a Circle
 * @author Ian Chavez
 */
public class Circle extends Shape {
    // Fields
    private double radius;
    private String type="Circle";

    /** Standard constructor for Triangle Class, instantiates all necessary fields
     * @param color  String containing color of Circle
     * @param radius double containing the radius of the Circle
     */
    public Circle(String color, double radius) {
        super(color, 1, 1);
        this.radius = radius;
    }

    /** Returns type of Shape
     * @return String containing type of Shape
     */
    public String getType(){
        return type;
    }

    /** Returns the radius of the Circle
     * @return double containing the radius of the Circle
     */
    public double getRadius() {
        return radius;
    }

    /** Sets the radius of the Circle
     * @param radius double containing the radius of the Circle
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Computes the area of the Circle
     * @return double containing the area of the Circle
     */
    synchronized public double computeArea() {
        return Math.pow((radius * Math.PI), 2);
    }

    /** Overrides toString() to create a string customized for this class
     * @return String customized for this class
     */
    @Override
    public String toString() {
        return type+" with a radius of "+radius;
    }
}
