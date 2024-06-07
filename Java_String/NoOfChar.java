package Java_String;

import java.util.Scanner;

public class NoOfChar {                         // occurence of character in a string 

        public static void main(String[] args) {
            

            
    Scanner scn = new Scanner(System.in);
    System.out.println("ENter the Word :");
    String word = scn.nextLine();
    System.out.println("now put the alphabet whose count you want to get");
    String alphabet = scn.next();
    scn.close();
    int count=0;


    for (int i = 0; i < word.length(); i++) {

        if(alphabet.charAt(0)==word.charAt(i)){

            count++;
        }
        
    }

    System.out.println("The alphabet is coming "+count+" times");
    

    
        }



    
}
