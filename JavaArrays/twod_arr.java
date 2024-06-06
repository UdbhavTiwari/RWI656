package JavaArrays;

import java.util.Scanner;

public class twod_arr {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
    
    int row = scn.nextInt();
    int col = scn.nextInt();
    int arr2D[][]= new int[row][col];

    for( int i = 0;i < row;i ++){

        for (int j = 0; j < col; j++) {

            arr2D[i][j]=scn.nextInt();
            
        }
    }
    scn.close();

    for( int i = 0;i < row;i ++){

        for (int j = 0; j < col; j++) {

           System.out.print(arr2D[i][j]);
            
        }
        System.out.println();
    }
        
    }

    
}
