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

public class SecondClass implements Converter<String, Integer[]> {

    @Override
    public String get(Integer[] input) {
        String result = Arrays.toString(input).replace("[", "").replace("]", "").replace(",", "");
        return result;
    }
}
