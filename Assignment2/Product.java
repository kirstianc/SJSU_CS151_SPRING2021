//package Assignment2;

/** Immutable class which creates a Product
 * @author Ian Chavez
 */
public final class Product {

    // Fields
    private final String name;
    private final String description;
    private final double price;
    private final int max;

    /** Creates a Product with specified information
     * @param name, String containing name of the product
     * @param description, String containing a description of the product
     * @param price, double containing price of the product
     * @param max, int containing max quantity allowed to be ordered of the product
     */
    public Product(String name, String description, double price, int max){
        this.name=name;
        this.description=description;
        this.price=price;
        this.max=max;
    }

    /** Gets name of product
     * @return String containing name of product
     */
    public String getName(){
        return name;
    }

    /** Gets description of product
     * @return String containing description of product
     */
    public String getDescription(){
        return description;
    }

    /** Gets price of product
     * @return double containing price of product
     */
    public double getPrice(){
        return price;
    }

    /** Gets max amount of product allowed to be ordered
     * @return int containing max amount of product allowed to be ordered
     */
    public int getMax(){
        return max;
    }

    /** Overrides toString to customize for this class
     * @return String containing all fields in the class
     */
    @Override
    public String toString(){
        return name+": "+description+", price: "+price+", max amount: "+max;
    }

}
