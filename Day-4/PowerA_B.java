import java.util.Scanner;

public class PowerA_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();
        int ans = 1;

        for (int i = 1; i <= b; i++) {
            ans = ans * a;
        }

        System.out.println("The value of " + a + "^" + b + " is " + ans);
        scanner.close();
    }
}
