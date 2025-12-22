import java.util.Scanner;

public class Task1 {
    /*
    Check 
    - if age is above 20 then he can drive a car
    - if age is above 18 and below 20 then he can ride a bike
    - if age is above 16 and below 18 then he can ride a scooty
    - if age is below 16 then he can't ride anything */

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String ride = (age>=20)?" He can drive a car" : (age>=18 && age<20)?" He can ride a bike" : (age<18 && age>=16)?" He can ride a scooty" : "Invalid age";
        System.out.println(ride);

        scanner.close();
    
    }
}
