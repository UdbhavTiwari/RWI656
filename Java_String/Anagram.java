package Java_String;

public class Anagram {

    public static void main(String[] args) {
        

        String str1 = "hello";
        String str2 = "olelh";

        boolean areAnagram = yesAnagram(str1, str2);

        if(areAnagram){
            System.err.println("string :"+str1+" and string "+str2+" are anagram");
        }
        else{
            System.err.println("Strings are not anagrams");
        }

    }
    

    public static boolean yesAnagram(String str1,String str2){

        if(str1.length()!=str2.length()){
            return false;
        }
        
            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();

            java.util.Arrays.sort(ch1);
            java.util.Arrays.sort(ch2);

            return java.util.Arrays.equals(ch1, ch2);

    }

}
