//package Assignment5;
//import java.util.*;

/** Contains methods that work with ArrayList<Integer> data structure
 * @author Ian Chavez
 */
public class ListManipulator {

    /** Accepts an array list of integers and sorts it in ascending or descending order
     * @param myLst array list to be sorted
     * @param ascending if true, ascending, if false descending
     * @return sorted array list
     */
    public ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending){

        Collections.sort(myLst); // sorts ascending
        if(!ascending){
            Collections.reverse(myLst); // if ascending is false, reverse sorted list
        }
        return myLst;
    }

    /** Accept an array list of integers and swamps positions of the largest and the smallest elements
     * @param myLst array list to have elements swapped
     * @return array list with swapped elements
     */
    public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst){
        ArrayList<Integer> temp = sort(myLst, true);

        Integer s = temp.get(0); // smallest
        Integer l = temp.get(temp.size()); // largest
        int li = myLst.indexOf(l); // index of largest

        myLst.set(myLst.indexOf(s), l); // smallest -> largest
        myLst.set(li, s); // old largest -> old smallest
        return myLst;
    }

    /** Accepts an array list of integers, creates a table of unique values and the number of times each value occurs, sorts this table, and outputs it to command line
     * @param myLst array list to convert into table
     */
    public void table(ArrayList<Integer> myLst){
        TreeSet<Integer> col1 = new TreeSet<Integer>(myLst);
        Iterator<Integer> it = col1.iterator();
        while(it.hasNext()){
            System.out.println(it.next() + " has " + Collections.frequency(myLst, it.next()) + " occurrences.");
        }
    }
}
