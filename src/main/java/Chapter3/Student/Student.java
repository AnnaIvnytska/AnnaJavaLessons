package Chapter3.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Created by ivnytska on 1/26/2016.
 */
public class Student {
    int id;
    String surname;
    String name;
    String middleName;
    int year;
    int month;
    int day;
    String address;
    int phoneNumber;
    String faculty;
    int course;
    String group;




    public Student(int id, String surname, String name, String middleName, int year, int month, int day, String address, int phoneNumber, String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.year = year;
        this.month = month;
        this.day = day;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + ", фамилия: " + this.surname + ", имя: " + this.name;
    }
}
