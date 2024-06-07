package Java_String;

import java.util.Scanner;

public class Palindrome_string {

    public static void main(String[] args) {
        

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scn.nextLine();
        scn.close();
        int L = 0;
        int R = str.length()-1;
        boolean Y = true;
          while(L<=R){  

            if(str.charAt(L)==str.charAt(R)){
                L++;
                R--;
            }
            else{
                Y=false;
                break;
            }

          }  
          if(Y==false){
            System.out.println("String is not palindrome");
          }
          else{
            System.out.println("String is palindrome");
          }
      




    }
    
}
