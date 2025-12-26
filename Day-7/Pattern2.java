import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int k = (int)Math.ceil(n/2);

        for(int i=0;i<n;i++){
            if(i<=k){
                for(int j=0; j<k-i; j++){
                    System.out.print("  ");
                }
                for(int j=0;j<2*i+1;j++){
                    if(j==0 || j==2*i){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }else{
                for(int j=0;j<i-k;j++){
                    System.out.print("  ");
                }
                for(int j=0; j<2*(n-i)-1;j++){
                    if(j==0||j==2*(n-i)-2){
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
