public class Pattern14 {
    public static void main(String[] args) {
        char ch='Z';
        for(int i=1,j=1;i<=5 && j<=i;){
            System.out.print((char)(ch-j+1)+ " ");
            if(i==j){
                i++;
                System.out.println();
                j=1;
            }
            else j++;
        }
    }
}
