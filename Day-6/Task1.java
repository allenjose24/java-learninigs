public class Task1 {
    public static void main(String[] args) {
        int[] arr = {323, 144, 526, 999, 101};
        for(int num : arr){
            if(checkPalindrome(num)){
                System.out.println(num);
            }
        }
    }
    static boolean checkPalindrome(int num){
        
        String str = String.valueOf(num);
        for(int i=0;i<str.length()/2;i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(str.length()-i-1);
            if(ch1!=ch2) return false;
        }
        return true;
    }
}
