import module java.base;

public class TernaryOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
	sc.nextLine();
	sc.close();
        int ascii = ch;
        String answer = (ch >= 65 && ch<= 90 || ch>=97 && ch<=122 ) ? "Alphabet" : (ch >= 48 && ch<= 57) ? "Number" : "Special Characters";
	System.out.println(answer);  
    }
}
