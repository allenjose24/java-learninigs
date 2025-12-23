import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
         * WAP to print the sum of squares of first n natural numbers
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        for(int i=1; i<=num; i++){
            sum += i*i;
        }
        System.out.println("Sum of squares of first " + num + " natural numbers is: " + sum);
        scanner.close();
    }
}
