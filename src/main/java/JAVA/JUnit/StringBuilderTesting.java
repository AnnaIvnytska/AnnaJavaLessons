package JAVA.JUnit;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by ivnytska on 11-Apr-16.
 * <p>
 * Написать тест в терминах BDD на класс StringBuilder *
 */
public class StringBuilderTesting {
    StringBuilder stringBuilderForTest;

    @Before
    public void setUpStringBuilder() {
        stringBuilderForTest = new StringBuilder("abc");
    }

    @Test
    public void shouldAppendString(){
        String newStr = stringBuilderForTest.append("d").toString();
        assertEquals(newStr, "abcd");
    }

    @Test
    public void shouldReverseString(){
        String newStr = stringBuilderForTest.reverse().toString();
        assertEquals(newStr, "cba");
    }

    @Test
    public void shouldCountLength(){
        int length = stringBuilderForTest.length();
        assertEquals(length, 3);
    }

    @Test
    public void shouldInsertChar(){
        String newStr = stringBuilderForTest.insert(2,"y").toString();
        assertEquals(newStr, "abyc");
    }
}