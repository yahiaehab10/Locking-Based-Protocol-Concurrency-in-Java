# Semaphore Example

This is a simple Java program that demonstrates the use of semaphores to control access to a shared resource. The program consists of two threads, `Thread A` and `Thread B`, which both manipulate a shared cumulative sum (`CumSum`). The threads are synchronized using a `Semaphore` object to ensure that only one thread can access the shared resource at a time.

## Prerequisites
- Java Development Kit (JDK) installed
- Basic knowledge of Java programming

## Instructions
1. Ensure that you have Java installed on your system.
2. Copy and save the code provided in separate Java files with the following names:
   - `Driver.java` for the `Driver` class
   - `MyThread.java` for the `MyThread` class
   - `Shared.java` for the `Shared` class
3. Open a command prompt or terminal and navigate to the directory containing the Java files.
4. Compile the Java files by executing the following command:
   ```
   javac Driver.java MyThread.java Shared.java
   ```
5. Run the program by executing the following command:
   ```
   java Driver
   ```

## Code Explanation

### Driver.java
The `Driver` class contains the `main` method, which is the entry point of the program. It creates a `Semaphore` object with a permit count of 1 and two threads (`Thread A` and `Thread B`) using the `MyThread` class. The threads are started and joined to ensure that they complete their execution before printing the final cumulative sum value.

### MyThread.java
The `MyThread` class extends the `Thread` class and represents the individual threads in the program. Each thread is associated with a semaphore (`sem`) and has a unique name (`threadName`). The `run` method is overridden to define the behavior of each thread.

For `Thread A`, it acquires the semaphore, updates the cumulative sum (`CumSum`) based on the formula (`(X + Y) + CumSum`), and sleeps for a short duration. After completing the loop, it releases the semaphore.

For `Thread B`, it follows a similar pattern but subtracts the value of the formula (`(X + Y)`) from the cumulative sum (`CumSum`).

### Shared.java
The `Shared` class holds the shared variables used by the threads. It defines three variables: `X`, `Y`, and `CumSum`. These variables are accessed and modified by both `Thread A` and `Thread B`.

## Acknowledgments
This example is inspired by the concept of semaphores and the need for thread synchronization when working with shared resources in concurrent programming.
