public class Pattern16 {
    public static void main(String[] args) {
        int temp = 1;
        for(int i=1,j=1;i<=5 && j<=i;){
            System.out.print(temp+ " ");
            temp ^= 1;
            if(i==j){
                i++;
                System.out.println();
                j=1;
                temp=1;
            }
            else j++;
        }
    }
}
