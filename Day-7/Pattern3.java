import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (i <= n / 2) {
                for (int j = 0; j < n; j++) {
                    if (j >= 0 && j <= i || j >= n - i - 1 && j <= n - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            } else {
                for(int j=0; j<n; j++){
                    if(j>=0 && j<=n-i-1 ||j>=i && j<=n-1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
