//package Assignment6;
import java.util.ArrayList;

/** Represents ArrayList containing Shapes
 * @author Ian Chavez
 */
public class Shapes {
    // Fields
    private ArrayList<Shape> shapeList = new ArrayList<Shape>();

    // Default Constructor for Shapes
    public Shapes(){}

    /** Returns the shapeList
     * @return the shapeList
     */
    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

    /** Sets the shapeList
     * @param shapeList the shapeList
     */
    public void setShapeList(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    /** Adds a shape to the end of shapeList
     * @param shape shape to add to the shapeList
     */
    public void add(Shape shape) {
        shapeList.add(shape);
    }

    /** Removes a shape from the shapeList
     * @param index index of shape to remove to the shapeList
     */
    public void remove(int index) {
        shapeList.remove(index);
    }

    // Calculates areas of all shapes in shapeList
    synchronized public void compute() {
        for (Shape s : shapeList) {
            System.out.print(s.getType()+", Area: ");
            System.out.println(s.computeArea());
        }
        System.out.println();
    }

    // Calculates shape with maximum area
    public void max(){
        double max=shapeList.get(0).computeArea();
        Shape maxShape=shapeList.get(0);
        for(Shape s : shapeList){
            if(max<s.computeArea()){
                max=s.computeArea();
                maxShape=s;
            }
        }
        System.out.println("Maximum area: "+max+", Shape is a "+maxShape.toString());
    }

    // Calculates shape with minimum area
    public void min(){
        double min=shapeList.get(0).computeArea();
        Shape minShape=shapeList.get(0);
        for(Shape s : shapeList){
            if(min>s.computeArea()){
                min=s.computeArea();
                minShape=s;
            }
        }
        System.out.println("Minimum area: "+min+", Shape is a "+minShape.toString());
    }
}
