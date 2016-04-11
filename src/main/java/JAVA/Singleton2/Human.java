package JAVA.Singleton2;

/**
 * Created by ivnytska on 06-Apr-16.
 */
public class Human {
    public  int testVariable =6 ;
    private static Human instance;

    private Human() {
    }

    public static Human getInstance() {
        if (instance == null) {
            instance = new Human();
        }
        return instance;
    }
}