package JAVA.Threads.Task1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by ivnytska on 2/25/2016.
 */

/*
Разработать приложение, где producer помещает в очередь 100 случайных чисел,
а 2 consumer’а ждут появления в очереди чисел - один четных, другой нечетных -
забирают их и выводят в консоль
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
