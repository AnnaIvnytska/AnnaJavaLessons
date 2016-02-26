package JAVA.Threads.Task1;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by ivnytska on 2/25/2016.
 */
public class FirstCustomer implements Runnable {

    BlockingQueue<Integer> queue;

    public FirstCustomer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    boolean stop = false;

    public void run() {
        //actions
        while (stop == false){
            try {


            if ((queue.peek() % 2) == 0) {
                try {
                    System.out.println("Четное: " + queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }}  catch (NullPointerException ne) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}