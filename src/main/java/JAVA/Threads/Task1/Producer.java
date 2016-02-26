package JAVA.Threads.Task1;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * Created by ivnytska on 2/25/2016.
 */

public class Producer implements Runnable {

    BlockingQueue<Integer> queue;
    public boolean isFinished = false;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public boolean getIsFinished() {
        return isFinished;
    }

    Random rand = new Random();

    @Override
    public void run() {
        //actions
        for (int i = 0; i < 100; i++) {
            queue.add((rand.nextInt(100)));
        }
        isFinished = true;
    }
}
