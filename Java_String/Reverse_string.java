package Java_String;

import java.util.Scanner;

public class Reverse_string {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string :");
        String Straight = scn.nextLine();
        scn.close();
        String reverse="";
        for (int i = Straight.length()-1; i >= 0; i--) {

           reverse+=Straight.charAt(i);
     
        }

        System.out.println("The reversed string is :"+ reverse);

    }
}
