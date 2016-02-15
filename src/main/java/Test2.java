/**
 * Created by ivnytska on 8/26/2015.
 */

import com.sun.xml.internal.fastinfoset.util.CharArray;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.sql.Time;
import java.util.*;
import java.lang.String;


public class Test2 {
    public static void main(String[] args) {
        int sum;
        int i;
        i = 1; sum = 0; for (; i <= 100; i++) sum += i;
        sum = 0; for (i = 1; i <= 100;) sum += i++;
//        for (i = 1, sum = 0; i <= 100; sum += i+, i++);
        for (i = 1, sum = 0; i <= 100; sum += i++);
//        for (i = 0, sum = 0; i++, i <= 100; sum += i);
    }
}
