package JAVA.Threads;

import java.util.ArrayList;

/**
 * Created by ivnytska on 2/25/2016.
 */
public class SecondCustomer implements Runnable {
    @Override
    public void run() {
        //actions

        Main main = new Main();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < main.queue.size(); i++) {
            if ((main.queue.peek() % 2) != 0) {
                oddNumbers.add(i);
                System.out.println(oddNumbers.get(i));
            }
        }
    }
}

