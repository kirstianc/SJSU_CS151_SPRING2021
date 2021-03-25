//package Assignment5;
//import java.util.*;

/** Tests Person class
 * @author Ian Chavez
 */
public class PersonTest {
    public static void main(String[] args) {
        Person joe = new Person("Joe", "Smith", 40);
        Person amy = new Person("Amy", "Gold", 32);
        Person tony = new Person("Tony", "Stork", 21);
        Person sean = new Person("Sean", "Irish", 24);
        Person tina = new Person("Tina", "Brock", 28);
        Person lenny = new Person("Lenny", "Hep", 18);

        ArrayList<Person> people = new ArrayList<Person>();

        people.add(joe);
        people.add(amy);
        people.add(tony);
        people.add(sean);
        people.add(tina);
        people.add(lenny);

        Collections.sort(people, new AgeComparator());
        System.out.println("Age ascending: "+people);
        Collections.reverse(people);
        System.out.println("Age descending: "+people);

        Collections.sort(people, new FnameComparator());
        System.out.println("First name ascending: "+people);
        Collections.reverse(people);
        System.out.println("First name descending: "+people);

        Collections.sort(people, new LnameComparator());
        System.out.println("Last name ascending: "+people);
        Collections.reverse(people);
        System.out.println("Last name descending: "+people);

    }

    // Custom Comparator for Age
    public static class AgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    }

    // Custom Comparator for First Name
    public static class FnameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.getFname().charAt(0), p2.getFname().charAt(0));
        }
    }

    // Custom Comparator for Last Name
    public static class LnameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.getLname().charAt(0), p2.getLname().charAt(0));
        }
    }
}
