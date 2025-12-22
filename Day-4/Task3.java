import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        switch (day){
            case "Monday" :
                System.out.println("Eat Biriyani");
                break;
            case "Tuesday" :
                System.out.println("Eat Burger");
                break;
            case "Wednesday" :
                System.out.println("Eat Samosa");
                break;
            case "Thursday" :
                System.out.println("Eat Pizza");
                break;
            case "Friday" :
                System.out.println("Eat Momos");
                break;
            case "Saturday" :
                System.out.println("Eat Bread pakoda");
                break;
            case "Sunday" :
                System.out.println("Eat Chowmin");
                break;
            default :
                System.out.println("Invalid day");
                break;
        }

        scanner.close();
    }
}
