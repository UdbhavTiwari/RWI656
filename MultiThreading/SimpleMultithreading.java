package MultiThreading;

// Define a class that extends the Thread class
class MyThread extends Thread {
    private String threadName;

    // Constructor to set the name of the thread
    MyThread(String name) {
        threadName = name;
    }

    // Override the run method to define the task for the thread
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + " is running: " + i);
            try {
                // Sleep for a while to simulate some work
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished.");
    }
}

public class SimpleMultithreading {
    public static void main(String[] args) {
        // Create instances of MyThread
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
