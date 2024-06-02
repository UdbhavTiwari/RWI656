abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    // Concrete method
    public void describeShape() {
        System.out.println("This is a " + color + " shape.");
    }

    // Abstract method
    abstract double area();
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    // Additional concrete method specific to Circle
    public void describeCircle() {
        System.out.println("This circle has a radius of " + radius);
    }
}

class Rectangle extends Shape {
    double width, height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    // Additional concrete method specific to Rectangle
    public void describeRectangle() {
        System.out.println("This rectangle has a width of " + width + " and a height of " + height);
    }
}


public class ConcreteG {
    public static void main(String[] args) {
        Shape circle = new Circle("red", 5);
        Shape rectangle = new Rectangle("blue", 4, 6);

        // Using the concrete method from the base class
        circle.describeShape();
        System.out.println("Area: " + circle.area());

        rectangle.describeShape();
        System.out.println("Area: " + rectangle.area());

        // Using additional concrete methods specific to subclasses
        ((Circle) circle).describeCircle();
        ((Rectangle) rectangle).describeRectangle();
    }
}
