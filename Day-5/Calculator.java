import java.util.Scanner;

class Calculator{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice");
        int choice = scanner.nextInt();
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println("The sum of the numbers is: "+ add(a,b));
                break;

            case 2:
                System.out.println("The difference of the numbers is: "+ sub(a,b));
                break;
            
            case 3:
                System.out.println("The product of the numbers is: "+ mul(a,b));
                break;

            case 4:
                System.out.println("The divisio of the numbers is: "+div(a,b));
                break;

            case 5:
                System.out.println("The reminder of the numbers is: "+reminder(a, b));
                break;

            case 6:
                System.out.println("The discounted price is: " + discount(a, b));
                break;
        }

        scanner.close();

    }

    static int add(int a, int b){
         return a+b;
    }
    static int sub(int a, int b){
         return a-b;
    }
    static int mul(int a, int b){
         return a*b;
    }
    static int div(int a, int b){
         return a/b;
    }
    static int reminder(int a, int b){
         return a%b;
    }
    static int discount(int a, int b){
         return (a - (a*b)/100);
    }
}