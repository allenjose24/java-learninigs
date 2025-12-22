import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner scanner  = new Scanner(System.in);

        char ch = 'y';
        do{
            
            System.out.println("Enter a number");
            int num = scanner.nextInt();
            int fact = 1;
            for(int i=1;i<=num;i++){
                fact = fact*i;
            }
            System.out.println("Factorial is " + fact);
            System.out.println("press y or Y to continue");
            ch = scanner.next().charAt(0);
        }while(ch=='y' || ch=='Y');
        scanner.close();
    }
}
 