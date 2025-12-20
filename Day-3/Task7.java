import java.util.Scanner;

public class Task7 {
    /*
     * WAP to check whether the character is upper case or not
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        char ch = sc.next().charAt(0);
        
        String ans = (ch>=65 && ch<= 90)?"Upper case":"Not Upper Case";
        System.out.println(ans);
        sc.close();
    }
    
}
