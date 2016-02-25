package JAVA.Threads;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * Created by ivnytska on 2/25/2016.
 */


/*
Разработать приложение, где producer помещает в очередь 100 случайных чисел,
а 2 consumer’а ждут появления в очереди чисел - один четных, другой нечетных -
забирают их и выводят в консоль
*/

public class Producer implements Runnable{
    Main main = new Main();
    Random rand = new Random();

    @Override
    public void run() {
        //actions
        for (int i = 0; i <= 100; i++)
            main.queue.add((rand.nextInt(100)+1));


    }
}
