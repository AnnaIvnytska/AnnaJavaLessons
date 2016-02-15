package Chapter3.Student;

import Chapter3.Student.Student;

import java.util.ArrayList;

/**
 * Created by ivnytska on 1/26/2016.
 */
public class MainStudent {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Иванова", "Ира", "Ивановна", 1993, 04, 19, "address", 123123, "Sociology", 3, "SOC1"));
        students.add(new Student(2, "Лымарь", "Ира", "Ивановна", 2001, 04, 19, "address", 123123, "Science", 3, "SOC3"));
        students.add(new Student(3, "Куров", "Олег", "Александрович", 1993, 04, 19, "address", 123123, "Sociology", 3, "SOC2"));
        students.add(new Student(4, "Сидорова", "Ира", "Ивановна", 1993, 04, 19, "address", 123123, "Business", 3, "B3"));
        students.add(new Student(5, "Зюба", "Ира", "Ивановна", 1993, 04, 19, "address", 123123, "Sociology", 3, "SOC4"));
        students.add(new Student(6, "Коврига", "Ира", "Ивановна", 1866, 04, 19, "address", 123123, "Economy", 3, "EC1"));
        students.add(new Student(7, "Коврига", "Ира", "Ивановна", 1993, 04, 19, "address", 123123, "Economy", 3, "EC1"));
        students.add(new Student(8, "Коврига", "Ира", "Ивановна", 1993, 04, 19, "address", 123123, "Economy", 3, "EC1"));
        students.add(new Student(9, "Сидорова", "Ира", "Ивановна", 2000, 04, 19, "address", 123123, "Business", 3, "B3"));

//        showStudentByFaculty("Sociology", students);
//        showStudentByYear(students, 1993);
        showStudentByGroup(students , "EC1");
    }


    public static void showStudentByFaculty(String facultyName, ArrayList<Student> allStudent) {
        ArrayList<Student> arrStudentByFaculty = new ArrayList<Student>();
        for (int i = 0; i < allStudent.size(); i++) {
            if (allStudent.get(i).faculty.equals(facultyName)) {
                arrStudentByFaculty.add(allStudent.get(i));
            }
        }

        for (int i = 0; i < arrStudentByFaculty.size(); i++) {
            System.out.println(arrStudentByFaculty.get(i));
        }
    }

//    public static void showStudentForAllFacultyAndGroup(ArrayList<Student> allStudent) {
//
//    }

    public static void showStudentByYear(ArrayList<Student> allStudent, int year) {
        for (int i = 0; i < allStudent.size(); i++) {
            if (allStudent.get(i).year > year) {
                System.out.println("Студенты младше " + year + " года рождеиния: " + "\n" + allStudent.get(i));
            }
        }
    }

    public static void showStudentByGroup(ArrayList<Student> allStudent, String group) {
        for (int i = 0; i < allStudent.size(); i++) {
            if (allStudent.get(i).group == group) {
                System.out.println("Студенты руппы " + group + ": " + "\n" + allStudent.get(i));
//            } else System.out.println("Такой группы не существует!");
        }
    }
}}



