//package Assignment6;

/** Represents a Hexagon
 * @author Ian Chavez
 */
public class Hexagon extends Shape {
    // Fields
    private double sideLength;
    private String type="Hexagon";

    /** Standard constructor for Hexagon Class, instantiates all necessary fields
     * @param color  String containing color of Hexagon
     * @param sideLength double containing the length of the Hexagon
     */
    public Hexagon(String color, double sideLength) {
        super(color, 6, 6);
        this.sideLength = sideLength;
    }

    /** Returns type of Shape
     * @return String containing type of Shape
     */
    public String getType(){
        return type;
    }

    /** Returns the length of the Hexagon
     * @return double containing the length of the Hexagon
     */
    public double getSideLength() {
        return sideLength;
    }

    /** Sets the length of the Hexagon
     * @param sideLength double containing the length of the Hexagon
     */
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    /** Computes the area of the Hexagon
     * @return double containing the area of the Hexagon
     */
    synchronized public double computeArea() {
        return ((3 * Math.sqrt(3))/2)* Math.pow(sideLength, 2);
    }

    /** Overrides toString() to create a string customized for this class
     * @return String customized for this class
     */
    @Override
    public String toString() {
        return type+" with a length of " + sideLength;
    }
}
