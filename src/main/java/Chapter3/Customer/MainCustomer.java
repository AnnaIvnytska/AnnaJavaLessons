package Chapter3.Customer;

import Chapter3.Customer.Customer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ivnytska on 1/27/2016.
 */
public class MainCustomer {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "Pupkin", "Oleg", "Ivanovich", "adress", 111, 123123));
        customers.add(new Customer(2, "Rude", "Stan", "Ivanovich", "adress", 222, 123124));
        customers.add(new Customer(3, "Fillippin", "Vova", "Ivanovich", "adress", 333, 123125));
        customers.add(new Customer(4, "Andreev", "Alex", "Ivanovich", "adress", 444, 123126));
        customers.add(new Customer(5, "Svetov", "Juriy", "Ivanovich", "adress", 555, 123127));

//        sortCustomerDescending(customers);
        showCustByCardNumber(customers, 100, 300);

    }

    public static void sortCustomerDescending(ArrayList<Customer> customers) {
        System.out.println("Before Sorting:");
        for (Customer counter : customers) {
            System.out.println(counter);
        }

        Collections.sort(customers, Customer.custSurnameComparator);

        System.out.println("After Sorting:");
        for (Customer counter : customers) {
            System.out.println(counter);
        }
    }

    public static void showCustByCardNumber(ArrayList<Customer> customers, int from, int to) {
        for (Customer counret : customers) {
            if (counret.creditCardNumber >= from && counret.creditCardNumber <= to) {
                System.out.println(counret);
            }
        }
    }

}
