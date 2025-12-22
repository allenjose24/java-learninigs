import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int sum=100;
        int a,i=0;
        Scanner scanner  = new Scanner(System.in);
        do{
            a = scanner.nextInt();
            sum-=a;
            i++;
        }while(sum>0);

        System.out.println("It took " + i + " number of digits to reach or exceed 100.");
        scanner.close();
    }
}
