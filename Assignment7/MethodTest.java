//package Assignment7;

import java.util.ArrayList;
import java.util.Arrays;

/** Class to implement a generic method and test it for Assignment 7
 * @author Ian Chavez
 */
public class MethodTest {

    /** Counts amount of elements in generic list
     * @return int containing amount of elements in generic list
     */
    public static <T> int count(ArrayList<T> list){
        int count = 0;
        for(T t : list){
            count++;
        }
        return count;
    }

    // Tests count() by creating 3 arraylists and counting them
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>(Arrays.asList("test1","test2","test3","test4","test5"));
        ArrayList<Integer> integers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Double> doubles = new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0));

        System.out.println("Count of Strings: "+count(strings));
        System.out.println("Count of Integers: "+count(integers));
        System.out.println("Count of Doubles: "+count(doubles));
    }
}
