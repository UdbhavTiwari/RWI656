// Define a class named ObjClass about cars
public class ObjClass {    
    // Instance variables (attributes) of the class
    String color;
    String model;
    int year;

    // Constructor method to initialize objects
    public ObjClass(String color, String model, int year) {
        this.color = color;  // 'this' keyword refers to the current object
        this.model = model;
        this.year = year;
    }

    // Method to display the car details
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year + "\n");
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating objects of the ObjClass class
        ObjClass car1 = new ObjClass("Red", "Toyota", 2021);  // the obj name must be unique
        ObjClass car2 = new ObjClass("Blue", "Honda", 2019);
        ObjClass car3 = new ObjClass("Red", "Toyota", 2021);


        // Calling methods on the objects
        car1.displayDetails(); // Display details of car1
        car2.displayDetails(); // Display details of car2
        car3.displayDetails(); // Display details of car3

        
    }
}
