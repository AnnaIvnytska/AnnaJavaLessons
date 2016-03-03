package JAVA.Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ivnytska on 3/2/2016.
 */

/*Реализовать метод-сумматор, на входе получающий Map со строковым ключем и списком любых Number
как значение, на выходе возвращающим Map с тем же ключем и Double (сумма списка по этому ключу)
как значение, показать использование на примере
*/

public class Task1 {

    public static Map<String, Double> totalizer(Map<String, List<? super Number>> map) {
        Double summOfValues = (double) 0;
        Map<String, Double> newReturnMap = new HashMap<>();

        for (Map.Entry<String, List<? super Number>> entry : map.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                Double a = (double) (entry.getValue().get(i));
                summOfValues += a;
            }

            newReturnMap.put(entry.getKey(), summOfValues);
        }
        return newReturnMap;
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        List<? super Number> l = new ArrayList<>();
        l.add(1);
        l.add(1.1);
        l.add(888888888);

        Map<String, List<? super Number>> list = new HashMap<>();
        list.put("first", l);
        totalizer(list);
    }
}

