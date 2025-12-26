import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {12,15,6,9,5};
        int a, b;
        for(int i=0; i<arr.length/2; i++){
            arr[arr.length-i-1] = arr[i]+arr[arr.length-i-1] - (arr[i]=arr[arr.length-i-1]);
        }

        System.out.println(Arrays.toString(arr));
    }
}
