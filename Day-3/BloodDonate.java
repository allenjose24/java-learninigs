import java.util.Scanner;

public class BloodDonate {
    public static void main(String[] args) {
        System.out.println("----========Blood Donation Eligibility========----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter weight: ");
        double weight = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter blood count: ");
        int bloodCount = sc.nextInt();
        sc.nextLine();
        sc.close();


        if(age>=18){
            if(weight>45){
                if(bloodCount>=4){
                    System.out.println("Eligible for blood donation");
                }else{
                    System.out.println("Not eligible for blood donation");
                }
            }else{
                System.out.println("Not eligible for blood donation");
            }
        }else{
            System.out.println("Not eligible for blood donation");
        }
    }
}
