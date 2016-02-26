package JAVA.Threads.Task2;

/**
 * Created by ivnytska on 2/26/2016.
 */

/*Разработать приложение, в котором главный поток каждые 100ms инкрементирует счетчик от 1 до 1000,
а 3 потока стартуют при достижении счеткика 100, 300 и 500 соответственно - каждую секунду выводят
в консоль сообщение о своей работе*/

public class AdditionalThreads implements Runnable {
    int counter;
    String message;

    public AdditionalThreads(int counter, String message) {
        this.counter = counter;
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 1; i < 1000000; i++) {
            System.out.println(message);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}