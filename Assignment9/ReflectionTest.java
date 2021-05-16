//package Assignment9;

import java.lang.reflect.*;

/** Main method for Assignment 9
 * @Author Ian Chavez
 */
public class ReflectionTest {
    public static void main(String[] args) {

        // Setup
        Address address = new Address();
        Class addressClass = address.getClass();
        Person person = new Person();
        Class personClass = person.getClass();

        // Person declared methods
        System.out.println("Person declared methods: ");
        Method[] personDeclaredMethods = personClass.getDeclaredMethods();
        for(Method method : personDeclaredMethods){
            String methodName = method.getName();
            Class[] parameters = method.getParameterTypes();

            if(parameters.length==0){
                System.out.println(methodName + "() has 0 parameters");
            }
            else{
                System.out.println(methodName + "() has " + parameters.length +
                        " parameter(s) of the following types:");
            }
            for(Class p : parameters){
                System.out.println("\t" + p.getName());
            }
        }

        // Address all methods
        System.out.println("\nAddress all methods: ");
        Method[] addressMethods = addressClass.getMethods();
        for(Method method : addressMethods){
            String methodName = method.getName();
            Class[] parameters = method.getParameterTypes();

            if(parameters.length==0){
                System.out.println(methodName + "() has 0 parameters");
            }
            else{
                System.out.println(methodName + "() has " + parameters.length +
                        " parameter(s) of the following types:");
            }
            for(Class p : parameters){
                System.out.println("\t" + p.getName());
            }
        }

        // Address declared fields
        System.out.println("\nAddress declared fields: ");
        Field[] addressDeclaredFields = addressClass.getDeclaredFields();
        for(Field field : addressDeclaredFields){
            System.out.println(field.getName());
        }
        System.out.println("\nField types: ");
        for(Field field : addressDeclaredFields){
            System.out.println(field.toString());
        }

        // Instantiate 3 Person instances and 1 Address instance
        try {
            Constructor<Person> personConstructor = Person.class.getConstructor();
            Person p1 = personConstructor.newInstance();
            Person p2 = personConstructor.newInstance();
            Person p3 = personConstructor.newInstance();

            // Invoke methods on instance of Person class
            Method firstName = personClass.getDeclaredMethod("setFirstName", String.class);
            firstName.invoke(p1, "First");
            Method lastName = personClass.getDeclaredMethod("setLastName",String.class);
            lastName.invoke(p1, "Last");
            Method age = personClass.getDeclaredMethod("setAge", int.class);
            age.invoke(p1, 0);
            System.out.println("\nPerson instance information: \n" + p1.toString());

            Constructor<Address> addressConstructor = Address.class.getConstructor();
            Address a1 = addressConstructor.newInstance();
        }
        catch (NoSuchMethodException | IllegalAccessException | InstantiationException |
                InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
