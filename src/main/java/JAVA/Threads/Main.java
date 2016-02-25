package JAVA.Threads;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by ivnytska on 2/25/2016.
 */
public class Main {


    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue(101);
        Producer prod = new Producer(queue);
        Thread producer = new Thread(prod);
        producer.start();

        FirstCustomer fc = new FirstCustomer(queue);
        Thread firstCustomer = new Thread(fc);
        firstCustomer.start();

        SecondCustomer sc = new SecondCustomer(queue);
        Thread secondCustomer = new Thread(sc);
        secondCustomer.start();

        boolean a = true;

        while (a) {
            if (queue.size() == 0 && prod.getIsFinished()) {
                fc.stop = true;
                sc.stop = true;
                a = false;
            }
        }
        producer.interrupt();

    }
}
