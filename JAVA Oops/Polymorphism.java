// Parent class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Polymorphism extends Animal {  // cat class
    public void sound() {
        System.out.println("Cat meows");
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Polymorphism();

        myAnimal.sound();
        myDog.sound();
        myCat.sound();
    }
}
