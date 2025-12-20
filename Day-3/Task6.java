import java.util.Scanner;

public class Task6 {
    /*
    WAP to check whether the three sides of a triangle is valid or not */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side of the triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter the second side of the triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter the third side of the triangle: ");
        int c = sc.nextInt();
        
        String ans = ((a+b>c && a+c>b && b+c>a)?"Valid Triangle":"Invalid Triangle");
        System.out.println(ans);
        
        sc.close();
    }
    
}
