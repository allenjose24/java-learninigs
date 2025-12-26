import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraysLearn {
    public static void main(String[] args) {
        /*
        ---------------------Decalre an array Number of Methods---------------------
        dataType  []variableName;
        dataType[] variableName;   //This is the best Method to initialize an array...!!
        dataType variableName[];
        
        -All three methods are correct 


        ---------------------Initialize an array Number of Methods---------------------
        1. dataType[] variableName = {value1, value2, value3, ...};
        2. dataType[] variableName = new dataType[arraySize];


        ---------------------Access an array Number of Methods---------------------
        1. variableName[index];
        2. variableName.length;


        */

        Integer[] a= new Integer[5];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }

        System.out.println(Arrays.toString(a));
        scanner.close();

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
    } 
}
