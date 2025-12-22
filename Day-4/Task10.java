import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        scanner.close();
        

        //using inbuilt functions
        System.out.println("----Inbuilt functions----");
        if (Character.isUpperCase(ch)) {
            System.out.println("Uppercase");
        } else if(Character.isLowerCase(ch)) {
            System.out.println("Lowercase");
        } else{
            System.out.println("Invalid input");
        } 


        System.out.println();
        //using ascii values
        System.out.println("----Ascii values----");
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } else if(ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else{
            System.out.println("Invalid input");
        } 

    }
}
