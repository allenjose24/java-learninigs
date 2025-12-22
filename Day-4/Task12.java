import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int a, sum=0 ;
        do{
            System.out.print("Enter the number: ");
            a = scanner.nextInt();
            if(a<=0) {
                System.out.println("The entered value is either a negative or 0 and cannot be accepted");
                System.out.println("Terminating session.");
                break;
            }
            sum+=a;
        }while(a>0);

        System.out.println("Collected sum of the entered positive values is: " + sum);
        scanner.close();
    }
}
