import java.util.Scanner;

public class Task4 {
    /*
    Take values of length and breadth from user and print whether the shape is square or not */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length  = scanner.nextInt();
        int breadth = scanner.nextInt();

        String str = (length==breadth)?"Square":"Not a Square";
        System.out.println(str);
        scanner.close();
    }
}
