public class Pattern15 {
    public static void main(String[] args) {
        char ch='l';
        for(int i=1,j=1;i<=5 && j<=i;){
            System.out.print((char)(ch++)+ " ");
            if(i==j){
                i++;
                System.out.println();
                j=1;
            }
            else j++;
        }
    }
}
