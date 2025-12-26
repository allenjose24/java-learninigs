public class Pattern11 {
    public static void main(String[] args) {
        int temp=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(temp+" ");
                temp ^= 1;
            }
            System.out.println();
        }
    }
}
