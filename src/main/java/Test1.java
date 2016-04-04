/**
 * Created by ivnytska on 8/25/2015.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
public class Test1 {


    public static void MainStudent(String[] args) {

        List rawlist = new ArrayList();;
        List<String> list = new ArrayList<String>();
        rawlist = list;
        rawlist.add(8);
    }
    System.out.println(rawlist);
}
*/


public class Test1 {

    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<Integer>();
        List<String> listStr = new ArrayList<String>();

        listInt.size();

        listInt.add(8);
        listInt.add(1);

        System.out.println(listInt);

        listStr.add("hello");
        listStr.add("world");

        System.out.println(listStr);
        StringBuilder stringBuilder = new StringBuilder();
    }


}

