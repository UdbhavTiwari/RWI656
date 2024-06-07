package Java_String;

public class Declare_string {
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String ("Udbhav");
        String sut = "anamika";
		System.out.println(str);
		str = str.concat("tiwari");       // concatinate  
		System.out.println(str);

        char ch = str.charAt(1);   // gives character at i index

        int len = str.length();    // gives length

        String substr1 = str.substring(2);        // give string from index 2  to end    
        String substr2 = str.substring(1, 4);    // 1 to 4

        String str2 = "Hello";
        boolean isEqual = str.equals(str2);   //false

        String lowerStr = str.toLowerCase();  
        String upperStr = str.toUpperCase();

        String trimmedStr = str.trim();  // remove space from start and from end

        String replacedStr1 = str.replace('u', 'p');  
        String replacedStr2 = str.replace("b", "c"); 

        System.out.println(ch+" "+len+" "+substr1+" "+substr2+" "+isEqual+" "+lowerStr+" "+upperStr+" "+trimmedStr+" "+replacedStr1+" "+replacedStr2+" "+sut);
	}
    
}
