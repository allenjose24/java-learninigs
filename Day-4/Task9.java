import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the number of classes held: ");
        int classesHeld = scanner.nextInt();
        System.out.println("Enter the number of classes attended: ");
        int classesAttended = scanner.nextInt();
        scanner.close();

        double percentage = (classesAttended/(double)classesHeld)*100;
        if (percentage>=75) {
            System.out.println("You are allowed to sit in the exam");
        } else {
            System.out.println("You are not allowed to sit in the exam");
        }
    }
}
