package Chapter3.Patient;

/**
 * Created by ivnytska on 1/27/2016.
 */
public class Patient {
    int id;
    String surname;
    String name;
    String middleName;
    String address;
    int phoneNumber;
    int medCartNumber;
    String diagnosis;

    public Patient(int id, String surname, String name, String middleName, String address, int phoneNumber, int medCartNumber, String diagnosis) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medCartNumber = medCartNumber;
        this.diagnosis = diagnosis;
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
        return "ID: " + this.id + ", NAME: " + this.name + ", SURNAME: " + this.surname + ", DIAGNOSIS: " + this.diagnosis;
    }
}
