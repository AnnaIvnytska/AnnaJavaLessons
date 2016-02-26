package JAVA.Threads.Task2;

/**
 * Created by ivnytska on 2/25/2016.
 */

/*Разработать приложение, в котором главный поток каждые 100ms инкрементирует счетчик от 1 до 1000,
а 3 потока стартуют при достижении счеткика 100, 300 и 500 соответственно - каждую секунду выводят
в консоль сообщение о своей работе*/

public class MainThread implements Runnable {

    int counter = 0;

//    public MainThread(int counter){
//        this.counter = counter;
//    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
            counter++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Main thread: counter is " + counter);
        }
    }

    public static void main(String[] args) {
        MainThread mt = new MainThread();
        Thread mainThread = new Thread(mt);
        mainThread.start();

        Thread additionalThread = new Thread(new AdditionalThreads());
        additionalThread.start();


    }


}
