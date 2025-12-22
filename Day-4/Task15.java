import java.util.Scanner;

public class Task15 {
    /*
    Prime Number */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean res = true;

        for(int i=2; i<(int)Math.sqrt(num); i++){
            if(num%i==0){
                System.out.println("The number "+num+" is not a prime number");
                res = false;
                break;
            }
        }
        if(res){
            System.out.println("The number "+num+" is a prime number");
        }
        scanner.close();
    }
}
