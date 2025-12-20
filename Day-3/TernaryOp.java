import java.util.Scanner;
/*
WAP to check whether the given character is alphabet, number or special character
using ternary operator  
*/

public class TernaryOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
	    char ch = str.charAt(0);
	    int ascii = ch;
	    sc.close();
        String answer = (ascii >= 65 && ascii<= 90 || ascii>=97 && ascii<=122 ) ? "Alphabet" : (ascii >= 48 && ascii<= 57) ? "Number" : "Special Characters";
	    System.out.println(answer);  
    }
}
