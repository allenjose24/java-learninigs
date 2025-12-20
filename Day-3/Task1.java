import java.util.Scanner;
public class Task1 {
    /*
     * WAP to take age and name as input from the user and print it
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        // sc.nextLine(); /*to consume the newline character which comes after the digits entered by the user before the newline character*/
        sc.nextLine();
        System.out.print("Enter Name: ");
        String str = sc.nextLine();

        sc.close();
        
        System.out.println("Name: " + str);
        System.out.println("Age: " + age);
    }
}
