package JavaArrays;
import java.util.Scanner;
public class Sum_array {
    

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("enter array size ");
        int size = scn.nextInt();
        int a1[] = new int[size];
        int a2[] = new int[size];
        int sumArr[]= new int[size];
        
        System.out.println("enter 1st array element ");
        for (int i = 0; i < a1.length; i++) {
            a1[i]=scn.nextInt();  
        }
        System.out.println("enter 2nd array element ");
        for (int i = 0; i < a1.length; i++) {
            a2[i]=scn.nextInt();  
        }


        for (int i = 0; i < a1.length; i++) {
                sumArr[i]=a1[i]+a2[i];
        }
        
        for (int i = 0; i < sumArr.length; i++) {
            System.out.println(sumArr[i]);
        }


    }
}
