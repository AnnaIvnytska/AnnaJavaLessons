package JAVA.Generics.Task2;

import java.util.Arrays;

/**
 * Created by ivnytska on 3/3/2016.
 */

/*
Реализовать интерфейс Converter с методом get, на вход принимающим параметризованный тип I и возвращающий
параметризированный тип T.

Реализовать 2 класса наследника - один преобразовывает Float в Double, другой -
массив Integer в String (конкатенация всех элементов через пробел). Показать использование на примере
*/

public class Main {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        Double result = firstClass.get(1.1F);
        System.out.println(result);

        SecondClass secondClass = new SecondClass();
        Integer[] i = {1, 1, 1, 1, 1, 1};
        String result2 = secondClass.get(i);
        System.out.println(result2);

    }
}

