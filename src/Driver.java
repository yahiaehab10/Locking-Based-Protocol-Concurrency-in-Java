import java.util.concurrent.*;

public class Driver {
    public static void main(String args[]) throws InterruptedException {
        // creating a Semaphore object with number of permits 1
        Semaphore sem = new Semaphore(1);

        // create two threads with name A and B
        // Note that thread A will increment the CumSum
        // and thread B will decrement the CumSum
        Thread A = new MyThread(sem, "A");
        Thread B = new MyThread(sem, "B");

        // TODO start threads A and B
        A.start();
        B.start();

        // TODO wait for threads A and B
        A.join();
        B.join();

        // TODO Print the CumSum Value after executing the 2 threads
        System.out.println("CumSum: " + Shared.CumSum);
    }
}
