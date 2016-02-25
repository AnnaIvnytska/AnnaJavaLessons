package JAVA.Threads;

import java.util.ArrayList;

/**
 * Created by ivnytska on 2/25/2016.
 */
public class FirstCustomer extends Thread {
    public void run() {
        //actions
        Main main = new Main();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < main.queue.size(); i++) {
            if ((main.queue.peek() % 2) == 0) {
                evenNumbers.add(i);
                System.out.println(evenNumbers.get(i));
            }
        }
    }
}