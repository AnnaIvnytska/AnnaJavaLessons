package JAVA.Reflection.Task1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*Создать аннотацию @Public, с помощью которой можно аннотировать только поля. Создать bean класс, в котором будут поля
во всеми возможными модификаторами доступа, аннотированные @Public и не аннотированные.  Создать утилитный класс с методом
getPublicValue, на вход которого подается проинициализированный любыми не пустыми значениями bean класс и название поля,
и на выходе получаем значение поля, если поле помечено аннотацией @Public, и получаем исключение IlegalAccessException в
обратном случае. В методе main нужно создать bean, проинициализировать и вывести в консоль значение объектов или исключения
для всех полей этого класса с помощью getPublicValue метода.*/

/**
 * Created by ivnytska on 2/26/2016.
 */

public class AnnotationClass {
    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Public {

    }
}
