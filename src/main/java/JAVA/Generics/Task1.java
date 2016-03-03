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

    public static Map<String, Double> totalizer(Map<String, List<? extends Number>> map) {
        Map<String, Double> newReturnMap = new HashMap<>();

        for (Map.Entry<String, List<? extends Number>> entry : map.entrySet()) {
            Double a = (double) 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                a += entry.getValue().get(i).doubleValue();
            }
            newReturnMap.put(entry.getKey(), a);
        }
        return newReturnMap;
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();

        List<Double> valuePart1 = new ArrayList<Double>();
        valuePart1.add(1.1);
        valuePart1.add(1.1);
        valuePart1.add(1.1);

        List<Integer> valuePart2 = new ArrayList<Integer>();
        valuePart2.add(1);
        valuePart2.add(1);
        valuePart2.add(1);

        List<Long> valuePart3 = new ArrayList<Long>();
        valuePart3.add(2147483648L);
        valuePart3.add(2147483648L);
        valuePart3.add(2147483648L);

        Map<String, List<? extends Number>> mapList = new HashMap<>();
        mapList.put("first", valuePart1);
        mapList.put("second", valuePart2);
        mapList.put("third", valuePart3);
        Map<String, Double> result = totalizer(mapList);
        System.out.println(mapList.entrySet());
        System.out.println(result.entrySet());
    }
}

