import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) {
        try{
            Class<?> c = Class.forName("Student");
            Constructor con = c.getDeclaredConstructor(String.class, int.class);
            con.setAccessible(true);
            Student s = (Student) con.newInstance("Allen",22);
            Method method = c.getDeclaredMethod("displayName");
            method.invoke(s);

        } catch(ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e){
            e.printStackTrace();
        }
    }
    
}

class Student{
    private String name;
    private int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }

    void displayName(){
        System.out.println("The name of the Student is: " + name);
    }

    void displayAge(){
        System.out.println("The age of the student is: "+ age);
    }
}
