package JAVA.Singleton2;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by ivnytska on 06-Apr-16.
 */
public class Main {
//    public Class c = this.getClass();

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        UtilClass1 utilClass1 = new UtilClass1();

        utilClass1.getClassesWithAnnotatedFields(utilClass1.getClasses("JAVA.Singleton2"));
        Girl asd = new Girl();
        System.out.println(asd.human.testVariable);

    }
}