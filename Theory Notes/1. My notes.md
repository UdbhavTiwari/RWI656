# JAVA THEORY
 
##  Features of java and its internal working of code

Java is a popular programming language with many cool features that make it great for creating different types of software. Here’s a simple explanation of why Java is so awesome:

1.**Easy to Learn**:
Java is designed to be easy to understand and use. It has a syntax that looks a bit like English, so it’s not too hard to learn, especially if you know some basic programming.

2.**Works Everywhere (Platform-Independent)**:
You can write a Java program on one computer, and it will work on any other computer that has Java installed. This is because Java uses something called the Java Virtual Machine (JVM) to run programs. The JVM makes sure your Java program can run on any device.

3.**Safe (Secure)**:
Java has built-in security features to keep your computer safe from viruses and bad programs. It checks everything to make sure it’s okay before running it, making it a secure choice for developing applications.

4.**Strong (Robust)**:
Java helps prevent mistakes in your code that could crash your program. It has features like strong memory management and exception handling that catch errors early and keep your programs running smoothly.

5.**Can Do Many Things at Once (Multithreaded)**:
Java can run several tasks at the same time. For example, a game made in Java can play music, show a video, and let you play, all at the same time. This is because Java supports multithreading, which allows multiple activities to happen simultaneously.

6.**Great for Online Stuff (Distributed)**:
Java is really good at helping computers talk to each other over the internet. It has tools for building applications that work over networks, making it perfect for creating websites and online games.

7.**Fast (High Performance)**:
Java programs can run quickly because of the Just-In-Time (JIT) compiler. The JIT compiler turns Java bytecode into native machine code at runtime, improving the execution speed of applications.

8.**Keeps Getting Better (Dynamic)**:
Java can add new features and fix problems without starting over from scratch. It can dynamically link in new class libraries, methods, and objects, which are not known at compile time but can be used at runtime.

9.**Can Be Used Anywhere (Portable)**:
Java programs can run on different kinds of devices, like computers, phones, or even TVs, as long as they have Java installed. This makes Java very portable and versatile.

10.**Lots of Ready-Made Tools (Rich Standard Library)**:
Java comes with many built-in tools that help you do common tasks easily. It has libraries for working with data structures, networking, file I/O, and making graphical user interfaces (GUIs), which speed up development.

11.**No Need to Clean Up (Automatic Memory Management/Garbage Collection)**:
Java takes care of cleaning up memory that your program doesn’t need anymore through a process called garbage collection. You don’t have to worry about forgetting to free up memory, which makes your programs more reliable.

---
---
---

# Writing and Compiling Java Code

## Writing Java Code

- You write your Java code in a text file with the .java extension.

### Example:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## Compiling Java Code

- The Java compiler (javac) converts the human-readable Java source code into bytecode, which is a set of instructions that can be executed by the Java Virtual Machine (JVM).
- Bytecode is saved in a .class file.

### Command:

```sh
javac HelloWorld.java
```

## Execution of Java Code

### Class Loader:

- The class loader loads the .class files containing the bytecode into the JVM.
- It also handles loading of other required classes and libraries.

### Bytecode Verification:

- The bytecode verifier checks the bytecode to ensure it follows Java’s security and correctness rules.
- This step helps to prevent code that could violate Java’s safety and security constraints from being executed.

### JVM (Java Virtual Machine):

- The JVM is responsible for executing the bytecode.
- It interprets the bytecode or compiles it to native machine code at runtime using the Just-In-Time (JIT) compiler.
- The JVM is platform-dependent but the bytecode is platform-independent, allowing Java code to be “write once, run anywhere.”

### Execution Engine:

- **Interpreter:** Interprets and executes the bytecode line by line. It’s simple but slower than the JIT compiler.
- **JIT Compiler:** Converts bytecode into native machine code for better performance. The next time the same code is executed, the JVM uses the compiled native code instead of interpreting the bytecode again.

### Garbage Collection:

- Java automatically manages memory allocation and deallocation.
- The Garbage Collector (GC) is responsible for reclaiming memory by deleting objects that are no longer reachable in the program.


## Example Flow

### Write Java Code:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Compile Java Code:

```sh
javac HelloWorld.java
```

### Run Java Program:

```sh
java HelloWorld
```

### Class Loading:

- HelloWorld.class is loaded by the class loader.

### Bytecode Verification:

- Verifier checks HelloWorld.class for correctness.

### Execution in JVM:

- JVM interprets or JIT compiles the HelloWorld bytecode.
- Executes `System.out.println("Hello, World!");`

[To know about JDK click here](JDK.md)