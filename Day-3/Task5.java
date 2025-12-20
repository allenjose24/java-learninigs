import java.util.Scanner;

public class Task5 {
    /*
     * WAP to check whether the number is divisible by 5 and 11 or not
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        
        String ans = ((a%5==0 && a%11==0)?"Divisible by 5 and 11":"Not Divisible by 5 and 11");
        System.out.println(ans);
        sc.close();

    }
    
}
