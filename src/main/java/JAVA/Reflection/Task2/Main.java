package JAVA.Reflection.Task2;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by ivnytska on 3/1/2016.
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        ClassLoaderChild classLoaderChild = new ClassLoaderChild(Main.class.getClassLoader());
        String pathToClass = "C:\\Users\\ivnytska\\Desktop\\1";

        classLoaderChild.setPath(pathToClass);
        Class result = classLoaderChild.loadClassFromFile("Student");
        System.out.println(Arrays.toString(result.getClass().getDeclaredMethods()));

    }
}
