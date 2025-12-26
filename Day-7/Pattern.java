import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        /*for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        } */

        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter your value: ");
        int n = scanner.nextInt();

        for(int i=0; i<n;i++){
            
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }

        }
        scanner.close();
    }
}
