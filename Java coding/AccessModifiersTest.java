// Public access modifier
public class PublicExample {
    public int publicNumber;

    public void publicMethod() {
        System.out.println("This is a public method.");
    }
}

// Private access modifier
class PrivateExample {
    private int privateNumber;

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    public void accessPrivate() {
        privateNumber = 10; // Accessible within the same class
        privateMethod();   // Accessible within the same class
    }
}

// Protected access modifier
class ProtectedExample {
    protected int protectedNumber;

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }
}

// Default (Package-Private) access modifier
class DefaultExample {
    int defaultNumber;

    void defaultMethod() {
        System.out.println("This is a default method.");
    }
}

// Test class to demonstrate access modifiers
public class AccessModifierTest {
    public static void main(String[] args) {
        // Public example
        PublicExample publicObj = new PublicExample();
        publicObj.publicNumber = 10;    // Accessible from anywhere
        publicObj.publicMethod();        // Accessible from anywhere

        // Private example
        PrivateExample privateObj = new PrivateExample();
        // privateObj.privateNumber = 10;   // Not accessible outside the class
        // privateObj.privateMethod();       // Not accessible outside the class
        privateObj.accessPrivate();      // Accessible through a public method

        // Protected example
        ProtectedExample protectedObj = new ProtectedExample();
        protectedObj.protectedNumber = 10;  // Accessible within the same package
        protectedObj.protectedMethod();      // Accessible within the same package

        // Default example
        DefaultExample defaultObj = new DefaultExample();
        defaultObj.defaultNumber = 10;  // Accessible within the same package
        defaultObj.defaultMethod();     // Accessible within the same package
    }
}
 
public