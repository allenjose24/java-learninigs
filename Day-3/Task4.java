import java.util.Scanner;

public class Task4 {
    /*
     * WAP to check whether the number is even or odd
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        String ans = ((a & 1) == 1) ? "Odd" : "Even";
        System.out.println(ans);
        sc.close(); 
    }
}
