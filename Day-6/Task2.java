import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of 1st Array: ");
        int s1 = scanner.nextInt();
        int[] arr = new int[s1];
        System.out.print("Enter the values for the 1st Array: ");

        for (int i = 0; i < s1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the size of the 2nd Array: ");
        int s2 = scanner.nextInt();
        int[] arr2 = new int[s2];
        System.out.print("Enter the values for the 2nd Array: ");
        for (int i = 0; i < s2; i++) {
            arr2[i] = scanner.nextInt();
        }
        scanner.close();
        if (s1 != s2) {
            System.out.println("They are not identical");
            return;
        }
        for (int i = 0; i < s1; i++) {
            if (arr[i] != arr2[i]) {
                System.out.println("They are not identical");
                return;
            }
        }
        System.out.println("They are identical");
    }
}
