package JAVA.Threads;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by ivnytska on 2/25/2016.
 */
public class Main {

    Queue<Integer> queue = new PriorityQueue<Integer>();

    public static void main(String[] args) {
        Thread producer = new Thread(new Producer());
        producer.start();

        new FirstCustomer().start();

        Thread secondCustomer = new Thread(new SecondCustomer());
        secondCustomer.start();
    }
}
