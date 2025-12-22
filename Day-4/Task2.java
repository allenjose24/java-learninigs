import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter your marks: ");
        int marks = scanner.nextInt();

        String grade = (marks>=90 && marks<=100) ? "A+" : 
        (marks>=80 && marks<90) ? "A" : 
        (marks>=70 && marks<80) ? "B+" : 
        (marks>=60 && marks<70) ? "B" : 
        (marks>=50 && marks<60) ? "C+" : 
        (marks>=40 && marks<50) ? "C" : "Fail";
        System.out.println("Your grade is: " + grade);

        scanner.close();
    }
    
}
