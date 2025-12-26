public class Pattern18 {
    public static void main(String[] args) {
        for(int i=1,j=5;i<=j && j>=1;){
            System.out.print("* ");
            if(i==j){
                j--;
                System.out.println();
                i=1;
            }
            else i++;
        }
    }
}
