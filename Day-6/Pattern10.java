public class Pattern10 {
    public static void main(String[] args) {
        char ch = 'E';
        for(int i=0; i<5; i++){
            for(int j=1; j<=5; j++){
                System.out.print((char)(ch-i) + " ");
            }
            System.out.println();
        }
    }
}
