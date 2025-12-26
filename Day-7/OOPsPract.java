import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OOPsPract {

    /*
    This file shows of the 4 Methods on how you can initialize an Object
    
    This specific method is called REFLECTION..!
    */

    public static void main(String[] args) {
        try {
            // 1. Load the class blueprint into memory using its String name
            // Class.forName() searches the classpath for the "Student" class.
            Class<?> c = Class.forName("Student");

            // 2. Create a new instance (object) of the class
            // getDeclaredConstructor() finds the default constructor.
            // newInstance() calls that constructor to create the object 's'.
            Student s = (Student) c.getDeclaredConstructor().newInstance();

            // 3. Access a specific field, even if it is 'private'
            // getDeclaredField("name") looks for the variable named "name" in the blueprint.
            Field f = c.getDeclaredField("name");

            // 4. Bypass Java's access control (encapsulation)
            // This is necessary because 'name' is private in the Student class.
            f.setAccessible(true);

            // 5. Assign a value to the field for our specific object 's'
            f.set(s, "John");

            // 6. Access a method from the class blueprint
            // getDeclaredMethod("display") looks for the "display()" method.
            Method m = c.getDeclaredMethod("display");

            // 7. Execute (Invoke) the method on our specific object 's'
            m.invoke(s);

        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | 
                 IllegalAccessException | InstantiationException | InvocationTargetException e) {
            // Reflection is "risky" because names are Strings, so we must catch these errors.
            e.printStackTrace();
        }
    }
}

class Student {
    private String name;

    // A zero-argument constructor is required for getDeclaredConstructor().newInstance()
    Student() { }

    public void display() {
        System.out.println("The name of the Student is: " + name);
    }
}