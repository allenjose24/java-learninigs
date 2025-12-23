import java.util.Scanner;
public class Task2 {
    /*
     * WAP to print the total number of factors of a number excluding its
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int i=1, count=0;
        while(i<=(int)Math.sqrt(num)){
            if(num%i==0){
                if(num/i==i){
                    count++;
                    System.out.println(i+" ");
                }else{
                    count+=2;
                    System.out.println(i+" "+num/i+" ");
                }
            }
            i++;
        }

        System.out.println("\nTotal Factors are: "+(count-1));
        scanner.close();
    }
}
