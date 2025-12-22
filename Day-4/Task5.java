import java.util.Scanner;

public class Task5 {
    /*
    Ask user to enter first number and second number
    and print which number is greater */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        String str = (num1>num2)?"First number is greater":"Second number is greater";
        System.out.println(str);
        scanner.close();
    }
}
