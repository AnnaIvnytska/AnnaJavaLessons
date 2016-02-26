package JAVA.Threads.Task2;

/**
 * Created by ivnytska on 2/25/2016.
 */

/*Разработать приложение, в котором главный поток каждые 100ms инкрементирует счетчик от 1 до 1000,
а 3 потока стартуют при достижении счеткика 100, 300 и 500 соответственно - каждую секунду выводят
в консоль сообщение о своей работе*/

public class MainThread {

    public static void main(String[] args) {
        int counter = 0;

        AdditionalThreads thread1 = new AdditionalThreads(counter, "thread1 works");
        AdditionalThreads thread2 = new AdditionalThreads(counter, "thread2 works");
        AdditionalThreads thread3 = new AdditionalThreads(counter, "thread3 works");

        for (int i = 1; i < 1000; i++) {
            counter++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Main thread: counter is " + counter);
            if (counter == 100) {
                new Thread(thread1).start();
            }
            if (counter == 300) {
                new Thread(thread2).start();
            }
            if (counter == 500) {
                new Thread(thread3).start();
            }
        }
    }
}
