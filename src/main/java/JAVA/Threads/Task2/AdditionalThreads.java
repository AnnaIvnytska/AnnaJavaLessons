package JAVA.Threads.Task2;

/**
 * Created by ivnytska on 2/26/2016.
 */

/*Разработать приложение, в котором главный поток каждые 100ms инкрементирует счетчик от 1 до 1000,
а 3 потока стартуют при достижении счеткика 100, 300 и 500 соответственно - каждую секунду выводят
в консоль сообщение о своей работе*/

public class AdditionalThreads implements Runnable {
    MainThread mt = new MainThread();
    Thread thread1 = new Thread();
    Thread thread2 = new Thread();
    Thread thread3 = new Thread();

    @Override
    public void run() {
        while (mt.counter > 100) {
            thread1.start();
            for (int i = 1; i < mt.counter; i++) {
                System.out.println("thread1: I'm working from 100");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        while (mt.counter > 300) {
            thread2.start();
            for (int i = 1; i < mt.counter; i++) {
                System.out.println("thread2: I'm working from 300");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        while (mt.counter > 500) {
            thread3.start();
            for (int i = 1; i < mt.counter; i++) {
                System.out.println("thread3: I'm working from 500");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}
