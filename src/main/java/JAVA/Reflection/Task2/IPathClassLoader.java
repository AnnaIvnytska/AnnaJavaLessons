package JAVA.Reflection.Task2;

/**
 * Created by ivnytska on 3/1/2016.
 */


/*Существует интерфейс:
public interface PathClassLoader {
    void setPath(String dir);
    String getPath();
}
Создать наследника класса ClassLoader имплементирующего PathClassLoader, который сможет загружать классы не только из
classpath, но и из сторонней директории, имя которой передается через функции интерфейса PathClassLoader.
*/

public interface IPathClassLoader {
    void setPath(String dir);

    String getPath();
}