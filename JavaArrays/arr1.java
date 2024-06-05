package JavaArrays;

import java.util.Scanner;

public class arr1 {

    public static void main(String[] args) {
        
        int a[] = new int[5];

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            
            a[i] = scn.nextInt();
        }
        scn.close();
        int firstL=a[0];
        int secondL=a[1];

        for (int i = 0; i < a.length; i++) {
            
           if(a[i]>firstL){
            secondL=firstL;
            firstL=a[i];
           }
           else if (a[i]>secondL&&a[i]!=firstL){
            secondL=a[i];
           }

        }
        System.out.println("here is second largest"+secondL);
    }
    
}
