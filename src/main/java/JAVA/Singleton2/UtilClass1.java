package JAVA.Singleton2;

import JAVA.Reflection.Task1.AnnotationClass;
import JAVA.Reflection.Task1.BeanClass;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.*;


/*Создать аннотацию @Public, с помощью которой можно аннотировать только поля. Создать bean класс, в котором будут поля
во всеми возможными модификаторами доступа, аннотированные @Public и не аннотированные.  Создать утилитный класс с методом
getPublicValue, на вход которого подается проинициализированный любыми не пустыми значениями bean класс и название поля,
и на выходе получаем значение поля, если поле помечено аннотацией @Public, и получаем исключение IlegalAccessException в
обратном случае. В методе main нужно создать bean, проинициализировать и вывести в консоль значение объектов или исключения
для всех полей этого класса с помощью getPublicValue метода.*/


/**
 * Created by ivnytska on 2/29/2016.
 */
public class UtilClass1 {

//    public static void makeInstance(Human human) throws IllegalAccessException {

    /**
     * Given a package name, attempts to reflect to find all classes within the package
     * on the local file system.
     *
     * @param packageName
     * @return
     */


    public static Class[] getClasses(String packageName)
            throws ClassNotFoundException, IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        assert classLoader != null;
        String path = packageName.replace('.', '/');
        Enumeration resources = classLoader.getResources(path);
        List dirs = new ArrayList();
        while (resources.hasMoreElements()) {
            URL resource = (URL) resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        ArrayList classes = new ArrayList();
        for (Object directory : dirs) {
            classes.addAll(findClasses((File) directory, packageName));
        }
        return (Class[]) classes.toArray(new Class[classes.size()]);
    }

    /**
     * Recursive method used to find all classes in a given directory and subdirs.
     *
     * @param directory   The base directory
     * @param packageName The package name for classes found inside the base directory
     * @return The classes
     * @throws ClassNotFoundException
     */
    private static List findClasses(File directory, String packageName) throws ClassNotFoundException {
        List classes = new ArrayList();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }

    public static List getClassesWithAnnotatedFields(Class[] classes) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        ArrayList<Class> annotatedClass = new ArrayList<>();
        for (Class oneClass : classes) {
            Field[] allFields = oneClass.getDeclaredFields();
            for (Field oneField : allFields) {
                if (oneField.isAnnotationPresent(MyReflectionAnnotation.class)) {
                 oneClass.getField("human").set(oneClass,oneField.getType().getDeclaredMethod("getInstance").invoke(oneField));
//                    annotatedClass.add(oneClass);
                }
            }
        }
        return annotatedClass;
    }

//        Field[] allFields = human.getClass().getDeclaredFields();
//        for (Field field : allFields) {
//            if ((field.getAnnotation(MyReflectionAnnotation.class).annotationType().isAnnotation())
//                    && field.getAnnotation(MyReflectionAnnotation.class) != null)
//            {
//                Human.getInstance();
//            }
//        }

}
