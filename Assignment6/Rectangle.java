//package Assignment6;

/** Represents a Rectangle
 * @author Ian Chavez
 */
public class Rectangle extends Shape {
    // Fields
    private double length;
    private double width;
    private String type="Rectangle";

    /** Standard constructor for Rectangle Class, instantiates all necessary fields
     * @param color  String containing color of Rectangle
     * @param length double containing the length of the Rectangle
     * @param width double containing the width of the Rectangle
     */
    public Rectangle(String color, double length, double width) {
        super(color, 4, 4);
        this.length =length;
        this.width =width;
    }

    /** Returns type of Shape
     * @return String containing type of Shape
     */
    public String getType(){
        return type;
    }

    /** Returns the length of the Rectangle
     * @return double containing the length of the Rectangle
     */
    public double getLength() {
        return length;
    }

    /** Sets the length of the Rectangle
     * @param length double containing the length of the Rectangle
     */
    public void setLength(double length) {
        this.length = length;
    }

    /** Returns the width of the Rectangle
     * @return double containing the width of the Rectangle
     */
    public double getWidth() {
        return width;
    }

    /** Sets the width of the Rectangle
     * @param width double containing the width of the Rectangle
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Computes the area of the Rectangle
     * @return double containing the area of the Rectangle
     */
    synchronized public double computeArea() {
        return length * width;
    }

    /** Overrides toString() to create a string customized for this class
     * @return String customized for this class
     */
    @Override
    public String toString() {
        return type+" with a length of "+ length +" and a width of "+ width;
    }
}
