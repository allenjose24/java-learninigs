import java.util.Scanner;

public class Task11 {
    /*
    Ask user to enter age, gender (M or F ) and marital status (true or false).

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your gender: ");
        String str = scanner.next().toLowerCase();
        char gender = str.charAt(0);
        System.out.println("Are you married? (true or false): ");
        // boolean married = scanner.nextBoolean();


        if(gender=='m'){
            if(age>=20 && age<40){
                System.out.println("You are eligible to work anywhere");
            }
            else if(age>=40 && age<60){
                System.out.println("You are eligible to work only in urban areas");
            }
            else{
                System.out.println("ERROR: You are not eligible to work");
            }
        } else if(gender=='f'){
            System.out.println("You are eligible to work only in urban areas");
        } else{
            System.out.println("ERROR: Invalid gender");
        }
        
        scanner.close();
    }
}
