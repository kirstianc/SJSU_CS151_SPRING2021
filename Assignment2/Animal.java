//package Assignment2;

/** Represents an Animal
 * @author Ian Chavez
 */
public class Animal {

    // Fields
    private String type;
    private String name;
    private int age;
    private String gender;
    private String environment;
    private int speed;

    /** Creates an Animal with specified information
     * @param type, String containing the type of animal
     * @param name, String containing the animal's name
     * @param age, int containing the animal's age
     * @param gender, String containing the gender of the animal
     * @param environment, String containing where the animal lives
     * @param speed, int containing how fast the animal is (miles/hr)
     */
    public Animal(String type, String name, int age, String gender, String environment, int speed){
        this.type=type;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.environment=environment;
        this.speed=speed;
    }

    /** Gets type of animal
     * @return String containing the type of animal
     */
    public String getType(){
        return type;
    }

    /** Sets type of animal
     * @param type, String containing the type of animal
     */
    public void setType(String type){
        this.type=type;
    }

    /** Gets name of animal
     * @return String containing the name of the animal
     */
    public String getName(){
        return name;
    }

    /** Sets name of the animal
     * @param name, String containing the name of the animal
     */
    public void setName(String name){
        this.name=name;
    }

    /** Gets age of the animal
     * @return int containing the age of the animal
     */
    public int getAge(){
        return age;
    }

    /** Sets age of the animal
     * @param age, int containing age of the animal
     */
    public void setAge(int age){
        this.age=age;
    }

    /** Gets the gender of the animal
     * @return String containing the gender of the animal
     */
    public String getGender(){
        return gender;
    }

    /** Sets the gender of the animal
     * @param gender, String containing the gender of the animal
     */
    public void setGender(String gender){
        this.gender=gender;
    }

    /** Gets the environment the animal lives in
     * @return String containing environment the animal lives in
     */
    public String getEnvironment(){
        return environment;
    }

    /** Sets the environment the animal lives in
     * @param environment, String containing environment the animal lives in
     */
    public void setEnvironment(String environment){
        this.environment=environment;
    }

    /** Gets the speed of the animal
     * @return int containing the speed of the animal
     */
    public int getSpeed(){
        return speed;
    }

    /** Sets the speed of the animal
     * @param speed, int containing the speed of the animal
     */
    public void setSpeed(int speed){
        this.speed=speed;
    }

    // Prints out "moves" when called
    public void move(){
        System.out.println("moves");
    }

    // Prints out "makes noise"
    public void sound(){
        System.out.println("makes noise");
    }

    // Prints out "eats"
    public void eat(){
        System.out.println("eats");
    }

    // Prints out "sleeps"
    public void sleep(){
        System.out.println("sleeps");
    }

    // Overrides toString() and includes fields of this class
    @Override
    public String toString(){
        return "type: "+type+", name: "+name+", age: "+age+", gender: "+gender+", environment: "+environment+", speed: "+speed+" miles/hr";
    }

}
