import java.util.Scanner;

public class Task14 {
    /*
    keep asking for a password until the user enters the  */
    public static void main(String[] args) {
        String password = "allenjose@24";
        Scanner scanner  = new Scanner(System.in);
        String str; int count = 3;
        boolean res  = false;
        do{
            System.out.print("Enter your password: ");
            str = scanner.nextLine();
            count--;
            if(str.equals(password)){
                res = true;
                System.out.println("Login Successful!");
                break;
            }else if(!str.equals(password) && count>0){
                System.out.println("You have "+count+" more attempts.");
                System.out.println("Try again...");
            }
        }while(count>0);

        if(res==false && count==0){
            System.out.println("Login failed");
        }
        scanner.close();
    }
}
