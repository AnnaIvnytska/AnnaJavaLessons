package Chapter3.Customer;

import java.util.Comparator;

/**
 * Created by ivnytska on 1/27/2016.
 */
public class Customer {
    int id;
    String surname;
    String name;
    String middleName;
    String address;
    int creditCardNumber;
    int bankAccountNumber;

    public Customer(int id, String surname, String name, String middleName, String address, int creditCardNumber, int bankAccountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    };

    public static Comparator<Customer> custSurnameComparator = new Comparator<Customer>() {
        public int compare(Customer o1, Customer o2) {
            String custName1 = o1.surname.toUpperCase();
            String custName2 = o2.surname.toUpperCase();
            return custName1.compareTo(custName2);
        }
    };

    @Override
    public String toString() {
        return "ID: " + this.id + ", фамилия: " + this.surname + ", имя: " + this.name;
    }
}
