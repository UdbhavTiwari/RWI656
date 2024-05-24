public class FinalKeyword {

    public static final int MAX_COUNT = 100;

    public static void main(String[] args) {
        System.out.println("Maximum count: " + MAX_COUNT);

        // MAX_COUNT = 200; // Error: Cannot assign a value to final variable
    }
    
}
/* 
The MAX_COUNT variable is declared as final, indicating that its value cannot be changed once assigned.
Inside the main method, we print the value of MAX_COUNT.
Attempting to change the value of MAX_COUNT (uncommenting the line MAX_COUNT = 200;) will result in a compilation error because MAX_COUNT is declared as final.
*/