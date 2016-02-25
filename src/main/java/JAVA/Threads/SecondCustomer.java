package JAVA.Threads;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by ivnytska on 2/25/2016.
 */
public class SecondCustomer implements Runnable {
    BlockingQueue<Integer> queue;

    public SecondCustomer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    boolean stop = false;

    @Override
    public void run() {
        //actions
        while (!stop) {
            try {


            if ((queue.peek() % 2) != 0) {
                try {
                    System.out.println("Нечетные: " + queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } } catch (NullPointerException ne) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

