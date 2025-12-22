import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String ride = (age>=20)?" He can drive a car" : (age>=18 && age<20)?" He can ride a bike" : (age<18 && age>=16)?" He can ride a scooty" : "Invalid age";
        System.out.println(ride);

        scanner.close();
    
    }
}
