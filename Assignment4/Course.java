//package Assignment4;

/** Represents a Course
 * @author Ian Chavez
 */
public class Course implements Cloneable{
    // Fields
    private String name;
    private String description;
    private String department;
    private String time;
    private String weekday;

    /** Creates a Course object with preset fields
     */
    public Course(){
        name="Course";
        description="Course Description";
        department="Course Department";
        time="00:00";
        weekday="Weekday";
    }

    /** Creates a Course object with information from parameters
     * @param name String containing name of Course
     * @param description String containing description of Course
     * @param department String containing department of Course
     * @param time String containing time of Course
     * @param weekday String containing weekday of Course
     */
    public Course(String name, String description, String department, String time, String weekday){
        this.name=name;
        this.description=description;
        this.department=department;
        this.time=time;
        this.weekday=weekday;
    }

    /** Provides name of Course
     * @return String containing name of Course
     */
    public String getName() {
        return name;
    }

    /** Sets name of Course
     * @param name String containing name of Course
     */
    public void setName(String name) {
        this.name = name;
    }

    /** Provides description of Course
     * @return String containing description of Course
     */
    public String getDescription() {
        return description;
    }

    /** Sets description of Course
     * @param description String containing description of Course
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** Provides department of Course
     * @return String containing department of Course
     */
    public String getDepartment() {
        return department;
    }

    /** Sets department of Course
     * @param department String containing department of Course
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /** Provides time of Course
     * @return String containing time of Course
     */
    public String getTime() {
        return time;
    }

    /** Sets time of Course
     * @param time String containing time of Course
     */
    public void setTime(String time) {
        this.time = time;
    }

    /** Provides weekday of Course
     * @return String containing weekday of Course
     */
    public String getWeekday() {
        return weekday;
    }

    /** Sets weekday of Course
     * @param weekday String containing weekday of Course
     */
    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    /** Overrides clone() from interface Cloneable
     * @return deep clone of current Course object
     */
    @Override
    public Course clone(){
        return new Course(name, description, department, time, weekday);
    }

    /** Overrides toString() to be customized for this class
     * @return String containing fields specific to this class
     */
    @Override
    public String toString(){
        return name+", "+description+", "+department+", "+time+", "+weekday+".";
    }
}
