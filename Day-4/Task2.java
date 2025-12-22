import java.util.Scanner;

public class Task2 {
    /*
    Design a program for grading  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter your marks: ");
        int marks = scanner.nextInt();

        /*
        String grade = (marks>=90 && marks<=100) ? "A+" : 
        (marks>=80 && marks<90) ? "A" : 
        (marks>=70 && marks<80) ? "B+" : 
        (marks>=60 && marks<70) ? "B" : 
        (marks>=50 && marks<60) ? "C+" : 
        (marks>=40 && marks<50) ? "C" : "Fail";
        System.out.println("Your grade is: " + grade);
        */

        int n = marks/10;
        switch (n){
            case 9:
                System.out.println("Grade: A+");
                break;
            case 8:
                System.out.println("Grade: A");
                break;
            case 7:
                System.out.println("Grade: B+");
                break;
            case 6:
                System.out.println("Grade: B");
                break;
            case 5:
                System.out.println("Grade: C+");
                break;
            case 4:
                System.out.println("Grade: C");
                break;
            default:
                System.out.println("Grade: Fail");
                break;
        }

        scanner.close();
    }
    
}
