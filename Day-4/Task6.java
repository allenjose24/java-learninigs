import java.util.Scanner;

public class Task6 {
    /*
    A shop will give discount of 10% if the cost of the purchased amount is more than 1000.
    Ask user to enter the quantity of T-shirts required 
    let one tshirt price be 200
    and print total amount to be paid  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of T-shirts required: ");
        int tshirts = scanner.nextInt();
        scanner.close();

        int price = tshirts * 200;
        if (price > 1000) {
            System.out.println("Original Price: " + price);
            System.out.println("10% Discounted Price: " + (price - (price * 0.1)));
        } else {
            System.out.println("Total price: " + price);
        }
    }
}
