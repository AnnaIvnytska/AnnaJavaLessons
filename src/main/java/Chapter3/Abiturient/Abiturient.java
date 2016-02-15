package Chapter3.Abiturient;

import java.util.Comparator;

/**
 * Created by ivnytska on 1/27/2016.
 */
public class Abiturient {
    int id;
    String surname;
    String name;
    String middleName;
    String address;
    int phoneNumber;
    int mark;

    public Abiturient(int id, String surname, String name, String middleName, String address, int phoneNumber, int mark) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getsurname() {
        return surname;
    }
    public void setsurname(String surname) {
        this.surname = surname;
    }


    @Override
    public String toString() {
        return "ID: " + this.id + ", NAME: " + this.name + ", SURNAME: " + this.surname + ", MARK: " + this.mark;
    }
}