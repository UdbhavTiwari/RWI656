package JavaArrays;

import java.util.Scanner;

public class second_largest {

    public static void main(String[] args) {
        
         Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int a[] = new int[size];

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
        System.out.println("here is second largest number :"+secondL);
    }
    
}
