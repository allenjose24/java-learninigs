import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the age of the first person: ");
        int age1 = scanner.nextInt();
        System.out.println("Enter the age of the second person: ");
        int age2 = scanner.nextInt();
        System.out.println("Enter the age of the third person: ");
        int age3 = scanner.nextInt();
        scanner.close();

        String str = (age1>age2 && age1>age3)?"First person is the oldest" : (age2>age1 && age2>age3)?"Second person is the oldest" : "Third person is the oldest";
        String str2 = (age1<age2 && age1<age3)?"First person is the youngest" :    (age2<age1 && age2<age3)?"Second person is the youngest" : "Third person is the youngest";
        System.out.println(str);
        System.out.println(str2);


    }
}
