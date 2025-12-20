import java.util.Scanner;

public class Task3 {
    /*
    
     * 1- + Addition
     * 2- - Subtraction
     * 3- * Multiplication
     * 4- / Division
     * 5- % Modulus
     */
    public static void main(String[] args) {

        System.out.println("---======Your Calculator======---\n");

        boolean b = true;
        while (b) {
            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Subtraction");
            System.out.println("Enter 3 for Multiplication");
            System.out.println("Enter 4 for Division");
            System.out.println("Enter 5 for Modulus\n");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if(choice < 1 || choice > 5){
                System.out.println("Invalid choice");
                continue;
            }

            System.out.println("\nEnter your values for operation");
            int[] values = takeInput();

            int ans = 0;

            switch (choice) {
                case 1:
                    ans = values[0] + values[1];
                    break;
                case 2:
                    ans = values[0] - values[1];
                    break;
                case 3:
                    ans = values[0] * values[1];
                    break;
                case 4:
                    ans = values[0] / values[1];
                    break;
                case 5:
                    ans = values[0] % values[1];
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Answer: " + ans);

            System.out.println("If want to start press Y else N");
            char ch = sc.next().charAt(0);
            if (ch == 'N' || ch == 'n') {
                b = false;
            }

        }

    }

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int arr[] = { num1, num2 };
        return arr;

    }

}
