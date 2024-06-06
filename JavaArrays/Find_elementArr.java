package JavaArrays;

import java.util.Scanner;

public class Find_elementArr {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int a[] = new int[size];

        for (int i = 0; i < a.length; i++) {    
            a[i] = scn.nextInt();
        }
        System.out.println("give the no. you need to find in array ");
        int find = scn.nextInt();
        scn.close();

        int flag =0;
        for (int i = 0; i < a.length; i++) {

            if(find==a[i]){
                System.out.println("This number is present on index : " + i);
                flag = 1;
            }
            
        }
        if(flag==0){
            System.out.println("number is not present in array");
        }
        

    }

    
}
