import java.util.Scanner;

public class SimpleJava{

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        scn.close();

            System.out.println("The difference is "+(a-b));
            

        

    }
}