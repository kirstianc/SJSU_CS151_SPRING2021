//package Assignment6;

/** Represents a Triangle
 * @author Ian Chavez
 */
public class Triangle extends Shape{
    // Fields
    private double height;
    private double base;;
    private String type="Triangle";

    /** Standard constructor for Triangle Class, instantiates all necessary fields
     * @param color  String containing color of Triangle
     * @param height double containing the height of the Triangle
     * @param base double containing the base of the Triangle
     */
    public Triangle(String color, double height, double base) {
        super(color, 3, 3);
        this.height=height;
        this.base=base;
    }

    /** Returns type of Shape
     * @return String containing type of Shape
     */
    public String getType(){
        return type;
    }

    /** Returns the height of the Triangle
     * @return double containing the height of the Triangle
     */
    public double getHeight() {
        return height;
    }

    /** Sets the height of the Triangle
     * @param height double containing the height of the Triangle
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /** Returns the base of the Triangle
     * @return double containing the base of the Triangle
     */
    public double getBase() {
        return base;
    }

    /** Sets the base of the Triangle
     * @param base double containing the base of the Triangle
     */
    public void setBase(double base) {
        this.base = base;
    }

    /** Computes the area of the Triangle
     * @return double containing the area of the Triangle
     */
    synchronized public double computeArea() {
        return (height*base)/2;
    }

    /** Overrides toString() to create a string customized for this class
     * @return String customized for this class
     */
    @Override
    public String toString() {
        return type+" with a height of "+height+" and a base of "+base;
    }
}
