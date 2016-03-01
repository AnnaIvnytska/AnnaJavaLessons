package JAVA.Reflection.Task1;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;


/*Создать аннотацию @Public, с помощью которой можно аннотировать только поля. Создать bean класс, в котором будут поля
во всеми возможными модификаторами доступа, аннотированные @Public и не аннотированные.  Создать утилитный класс с методом
getPublicValue, на вход которого подается проинициализированный любыми не пустыми значениями bean класс и название поля,
и на выходе получаем значение поля, если поле помечено аннотацией @Public, и получаем исключение IlegalAccessException в
обратном случае. В методе main нужно создать bean, проинициализировать и вывести в консоль значение объектов или исключения
для всех полей этого класса с помощью getPublicValue метода.*/


/**
 * Created by ivnytska on 2/29/2016.
 */
public class UtilClass {

//    public String getPublicValue(BeanClass beanClass, String fieldName) throws IllegalAccessException {
////        Class clazz = beanClass.getClass();
//        Field[] fields = beanClass.getClass().getDeclaredFields();
//
//
//        String result = "";
//
////        Field[] fields1 = clazz.getDeclaredFields();
//        for (Field field : fields) {
////            System.out.println("\t" + field);
//            if (field.getAnnotation(AnnotationClass.Public.class). && field.getName().equals(fieldName)){
//                result = fieldName;
//                break;
//            }else{
////                throw new IllegalAccessException();
//                result = "fff";
//            }
//        }
//        System.out.println(result);
//        return result;   //непонятно, что будет с else
//    }


    //работает, но возвращает название поля, а не его значние, из того, что List создан как String, а не Field
//    public String getPublicValue(BeanClass beanClass, String fieldName) throws IllegalAccessException {
//        Field[] allFields = beanClass.getClass().getDeclaredFields();
//        List<String> annotatedFields = new LinkedList<String>();

    //формируем annotatedFields только с нужной аннотацией
//        for (Field field : allFields) {
//            try {
//                if ((field.getAnnotation(AnnotationClass.Public.class).annotationType().isAnnotation())
//                        && field.getAnnotation(AnnotationClass.Public.class) != null) {
//                    annotatedFields.add(field.getName());
//                }
//            } catch (NullPointerException e) {
//            }
//        }
//
//        if (annotatedFields.contains(fieldName)) {
//            for (String field : annotatedFields) {
//                if (field.equals(fieldName)) {
//                    System.out.println(field);
//                }
//            }
//        } else {
//            throw new IllegalAccessException();
//        }
//        return fieldName;


    //новый работает как надо

    public String getPublicValue(BeanClass beanClass, String fieldName) throws IllegalAccessException {
        Field[] allFields = beanClass.getClass().getDeclaredFields();
        List<Field> annotatedFields = new LinkedList<Field>();
        for (Field field : allFields) {
            try {
                if ((field.getAnnotation(AnnotationClass.Public.class).annotationType().isAnnotation())
                        && field.getAnnotation(AnnotationClass.Public.class) != null) {
                    annotatedFields.add(field);
                }
            } catch (NullPointerException e) {
            }
        }

        for (Field field : annotatedFields) {
            if (field.getName().equals(fieldName)) {
                System.out.println(field.get(beanClass).toString());
                return field.get(beanClass).toString();
            }
        }
        throw new IllegalAccessException();
    }
}



