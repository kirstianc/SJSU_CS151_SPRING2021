//package Assignment6;

/** Represents a Shape
 * @author Ian Chavez
 */
public abstract class Shape {
    // Fields
    private String color;
    private int sides;
    private int angles;
    private String type="Undefined";

    /** Standard constructor for Shape Class, instantiates all necessary fields
     * @param color String containing color of Shape
     * @param sides int containing the sides of the Shape
     * @param angles int containing the angles of the Shape
     */
    public Shape(String color, int sides, int angles){
        this.color =color;
        this.sides = sides;
        this.angles = angles;
    }

    /** Returns type of Shape
     * @return String containing type of Shape
     */
    public String getType(){
        return type;
    }

    /** Returns color of Shape
     * @return String containing color of Shape
     */
    public String getColor() {
        return color;
    }

    /** Sets color of Shape
     * @param color String containing color of Shape
     */
    public void setColor(String color) {
        this.color = color;
    }

    /** Returns sides of the Shape
     * @return int containing the sides of the Shape
     */
    public int getSides() {
        return sides;
    }

    /** Sets sides of the Shape
     * @param sides int containing the sides of the Shape
     */
    public void setSides(int sides) {
        this.sides = sides;
    }

    /** Returns angles of the Shape
     * @return int containing the angles of the Shape
     */
    public int getAngles() {
        return angles;
    }

    /** Sets angles of the Shape
     * @param angles int containing the angles of the Shape
     */
    public void setAngles(int angles) {
        this.angles = angles;
    }

    public abstract double computeArea();

    /** Overrides toString() to create a string customized for this class
     * @return String customized for this class
     */
    @Override
    public String toString() {
        return type+ " with a color of "+color+" and "+sides+" sides and "+ angles+" angles";
    }
}
