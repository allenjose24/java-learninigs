public class Pattern {
    public static void main(String[] args) {
        for(int i=1,j=1;i<=5 && j<=i;){
            System.out.print("* ");
            if(i==j){
                i++;
                System.out.println();
                j=1;
            }
            else j++;
        }
    }
}
