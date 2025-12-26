public class Task3 {
    public static void main(String[] args) {
        char[] arr = {'a','a','l','l','a'};
        for(int i=0; i<arr.length/2; i++){
            if(arr[i]!=arr[arr.length-i-1]){
                System.out.println("The array is not palindromic");
                return;
            }
        }

        System.out.println("The array is palindromic");
    }
    
}
