import java.util.Scanner;

public class Task2 {
    /*
     * Degree btech
     * Stream It
     * knowledege Java
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine().toLowerCase();
        System.out.println("Enter your degree: ");
        String degree = sc.nextLine().toLowerCase();
        System.out.println("Enter your stream: ");
        String stream = sc.nextLine().toLowerCase();
        System.out.println("Enter your knowledge: ");
        String knowledge = sc.nextLine();
        sc.close();

        int count = 0;
        if (degree.equals("btech")) {
            count++;
            if (stream.equals("it")) {
                count++;
                if (knowledge.equals("java")) {
                    count++;
                }
            }
        }
        if (count == 3) {
            System.out.println("Congragulations " + name + " you are Eligible for job");
        } else {
            System.out.println("Sorry you are Not eligible for job");
        }
    }
}
