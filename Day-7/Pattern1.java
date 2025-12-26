import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a  number: ");
        int n = scanner.nextInt();

        int k = (int)Math.ceil(n/2);
        // System.out.println(k);
        for(int i=0; i<n; i++){
            if(i<=k){
                for(int j=0; j<i; j++){
                    System.out.print("  ");
                }
                for(int j=0; j<n-2*i;j++){
                    System.out.print("* ");
                }
            }else{
                for(int j=0; j<n-i-1; j++){
                    System.out.print("  ");
                }
                for(int j=0; j<2*i-n+2;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
