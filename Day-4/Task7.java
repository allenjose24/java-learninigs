import java.util.Scanner;

public class Task7 {
    /*
    A company decided to give bonus of 5% to employee if his/her YOE is greater than or equal to 5 years.
    Design a program to calculate the bonus of an employee.
    Ask user to enter his/her salary and YOE */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your current salary: ");
        int salary = scanner.nextInt();
        System.out.print("Enter your YOE (Years of Experience): ");
        int yoe = scanner.nextInt();


        double newSalary = (yoe>=5)?salary+salary*0.05:salary;
        System.out.println("Your new salary is: " + newSalary);
        scanner.close(); 
    } 
}
 