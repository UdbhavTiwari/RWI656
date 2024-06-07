package Java_String;

public class Remove_Duplicates {
    
    public static void main(String[] args) {
        
        String original = " Udbhavvdbhaav";
        String result = removeDuplicates(original);
        System.out.println("original string is : "+original);
        System.out.println("without duplicates string is : "+ result);

    }


    public static String removeDuplicates(String str){


        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);               //.indexOf(ch) is used to know where the ch is present in the string 
                                                   // or not if present it gives index of string where it is present if not it gives -1                        
            if (result.indexOf(ch) == -1) {        // Check if the character is already in the result string or not
                result += ch;                      // Add the character if it's not a duplicate
            }
        }
        return result;
    }


 }



