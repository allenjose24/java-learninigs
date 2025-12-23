import java.util.Scanner;

public class Task3 {
    /*
    Fibonacci series */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        for (int i = 0, a = 0, b = 1; i < num; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        scanner.close();
    }
}
