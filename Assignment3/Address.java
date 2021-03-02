//package Assignment3;

/** Represents an address
 * @author Ian Chavez
 */
public class Address {

    // Fields
    private int streetNum;
    private String streetName;
    private String city;
    private String zip;
    private String state;

    /** Creates an Address
     * @param num int containing address' Street Number
     * @param name string containing address' Street name
     * @param city string containing address' city
     * @param zip string containing address' zip
     * @param state string containing address' state
     */
    public Address(int num, String name, String city, String zip, String state){
        streetNum=num;
        streetName=name;
        this.city=city;
        this.zip=zip;
        this.state=state;
    }

    /** Gets street number
     * @return int containing address' street number
     */
    public int getStreetNum(){
        return streetNum;
    }

    /** Sets street number
     * @param num int containing address' street number
     */
    public void setStreetNum(int num){
        streetNum=num;
    }

    /** Gets address' street name
     * @return string containing address' street name
     */
    public String getStreetName() {
        return streetName;
    }

    /** Sets address' street name
     * @param name string containing address' street name
     */
    public void setStreetName(String name){
        streetName=name;
    }

    /** Gets address' city
     * @return string containing address' city
     */
    public String getCity(){
        return city;
    }

    /** Sets address' city
     * @param city string containing address' city
     */
    public void setCity(String city){
        this.city=city;
    }

    /** Gets address' zip
     * @return string containing address' zip
     */
    public String getZip(){
        return zip;
    }

    /** Sets address' zip
     * @param zip string containing address' zip
     */
    public void setZip(String zip){
        this.zip=zip;
    }

    /** Gets address' state
     * @return string containing address' state
     */
    public String getState(){
        return state;
    }

    /** Set address' state
     * @param state string containing address' state
     */
    public void setState(String state){
        this.state=state;
    }

    /** Overrides toString to display all fields of this class
     * @return String containing fields of this class
     */
    @Override
    public String toString(){
        return streetNum+" "+streetName+", "+city+", "+state+" "+zip;
    }
}
