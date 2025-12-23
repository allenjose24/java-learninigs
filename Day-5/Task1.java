public class Task1 {
    public static void main(String[] args) {
       
        int count = 1000/7;
        System.out.println("count = "+count);
        int count1 = 1000/10;
        System.out.println("count1 = "+count1);    

        int ans=1, i=1;
        int count2=0;
        while(ans<=1000){
            ans = 7*i;
            i+=10;
            if(ans<=1000){
                count2++;
            }
        }

        System.out.println(count+count1-count2);
    }
}
