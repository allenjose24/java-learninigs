public class Pattern12 {
    public static void main(String[] args) {
        for(int i=1,j=1;i<=5 && j<=i;){
            System.out.print(6-j + " ");
            if(i==j){
                i++;
                System.out.println();
                j=1;
            }
            else j++;
        }
    }
}
