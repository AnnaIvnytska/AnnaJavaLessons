package Chapter3.Abiturient;

import Chapter3.Patient.Patient;

import java.util.ArrayList;

/**
 * Created by ivnytska on 1/27/2016.
 */
public class MainAbiturient {
    public static void main(String[] args) {
        ArrayList<Abiturient> abiturients = new ArrayList<Abiturient>();
        abiturients.add(new Abiturient(1, "Pupkin", "Oleg", "Ivanovich", "address", 111, 12));
        abiturients.add(new Abiturient(2, "Rude", "Stan", "Ivanovich", "address", 222, 11));
        abiturients.add(new Abiturient(3, "Fillippin", "Vova", "Ivanovich", "address", 333, 9));
        abiturients.add(new Abiturient(4, "Andreev", "Alex", "Ivanovich", "address", 444, 7));
        abiturients.add(new Abiturient(5, "Svetov", "Juriy", "Ivanovich", "address", 555, 3));

//        showStudentWithBadMark(abiturients);
//        showStudentWithExpectedMark(abiturients, 7);
        showBestStudent(abiturients);
    }

    public static void showStudentWithBadMark(ArrayList<Abiturient> abiturients) {
        for (Abiturient count : abiturients) {
            if (count.mark <= 6) {
                System.out.println(count);
            }
        }
    }

    public static void showStudentWithExpectedMark(ArrayList<Abiturient> abiturients, int expectedMark) {
        for (Abiturient count : abiturients) {
            if (count.mark >= expectedMark) {
                System.out.println(count);
            }
        }
    }

    public static void showBestStudent(ArrayList<Abiturient> abiturients) {
        for (int i = 0; i < abiturients.size(); i++) {
            for (int j = 0; j < abiturients.size() - i - 1; j++) {
                if (abiturients.get(j).mark < abiturients.get(j + 1).mark) {
                    int t = abiturients.get(j).mark;
                    abiturients.get(j).mark = abiturients.get(j + 1).mark;
                    abiturients.get(j + 1).mark = t;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(abiturients.get(i));
        }
    }
}
