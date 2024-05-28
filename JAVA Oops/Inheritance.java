// Define a superclass named Vehicle
class Vehicle {
    // Attribute
    String brand;

    // Method to honk
    public void honk() {
        System.out.println("Beep! Beep!");
    }
}

// Define a subclass named Car that inherits from Vehicle
class Car extends Vehicle {
    // Additional attribute
    String modelName;

    // Constructor to initialize the object
    public Car(String brand, String modelName) {
        this.brand = brand;
        this.modelName = modelName;
    }

    // Method to display details
    public void display() {
        System.out.println("Brand: " + brand + ", Model: " + modelName);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an object of Car class
        Car myCar = new Car("Toyota", "Corolla");
        myCar.honk();  // Call inherited method
        myCar.display();  // Call method from Car class
    }
}
