package Chapter3.Patient;

import Chapter3.Customer.Customer;

import java.util.ArrayList;

/**
 * Created by ivnytska on 1/27/2016.
 */
public class MainPatient {
    public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<Patient>();
        patients.add(new Patient(1, "Pupkin", "Oleg", "Ivanovich", "adress", 111, 123123, "flu"));
        patients.add(new Patient(2, "Rude", "Stan", "Ivanovich", "adress", 222, 123124, "arthritis"));
        patients.add(new Patient(3, "Fillippin", "Vova", "Ivanovich", "adress", 333, 123125, "flu"));
        patients.add(new Patient(4, "Andreev", "Alex", "Ivanovich", "adress", 444, 123126, "flu"));
        patients.add(new Patient(5, "Svetov", "Juriy", "Ivanovich", "adress", 555, 123127, "genyantritis"));

//        showPatientByDiagnosis(patients, "flu");
        showPatientByMedCartNumber(patients, 123123, 123125);
    }

    public static void showPatientByDiagnosis(ArrayList<Patient> patients, String diagnosis) {
        for (Patient count : patients) {
            if (count.diagnosis == diagnosis) {
                System.out.println(count);
            }
        }
    }
    public static void showPatientByMedCartNumber(ArrayList<Patient> patients, int from, int to) {
        for (Patient counret : patients) {
            if (counret.medCartNumber >= from && counret.medCartNumber <= to) {
                System.out.println(counret);
            }
        }
    }

}
