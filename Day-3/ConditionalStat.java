public class ConditionalStat {
    public static void main(String[] args) {

        /*
        WAP to show the difference between if, if-else, if-else if, switch, and ternary operator
        

        COnditional Statements are of few types
        * if
        * if-else
        * if-else if
        * switch
        * ternary operator
        * nested if
         */

        // if-else if-else
        int num = 10;
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        //if-else
        int num2 = 10;
        if (num2 > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative or Zero");
        }

        //nested if
        int num3 = 10;
        if (num3 > 0) {
            if (num3 % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } else {
            System.out.println("Negative or Zero");
        }

        //switch
        int num4 = 10;
        switch (num4) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Other");
                break;
        }

        //ternary operator
        int num5 = 10;
        System.out.println(num5 > 0 ? "Positive" : "Negative or Zero");
    }
}
