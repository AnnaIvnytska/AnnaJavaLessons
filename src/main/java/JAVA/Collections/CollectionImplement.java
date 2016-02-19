package JAVA.Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by ivnytska on 2/15/2016.
 */
public class CollectionImplement<T> implements Collection {

    public Object[] array = {};
    public int startIterator = -1;
    public int size;


    @Override
    public int size() {
        int count = 0;
        for (Object item : array) {
            count++;
            size = count;
        }
        return count;
    }

//    int size = size();

    @Override
    public boolean isEmpty() {
        int count = 0;
        for (Object item : array) {
            count++;
        }
        if (count == 0) {
            return true;
        } else
            return false;
    }

    @Override
    public boolean contains(Object o) {
        boolean value = true;
        for (Object item : array) {
            if (item == o) {
                value = true;
                break;
            } else
                value = false;
        }
        return value;
    }


    @Override
    public IteratorImplement iterator() {
        IteratorImplement iteratorImplement = new IteratorImplement();
        return null;
    }

    @Override
    public Object[] toArray() {
        return array;
    }

    @Override
    public boolean add(Object o) {
        size();
        array = Arrays.copyOf(array, size + 1);
        array[size] = o;

        return false;
    }

    // нужно доработать, переместить данные в старый массив + проверка, удалился ли элемент
    @Override
    public boolean remove(Object o) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(o)) {
                index = i;
            }
        }
        Object[] tempArr = new Object[array.length - 1];
        for (int i = 0; i < index; i++) {
            tempArr[i] = array[i];
        }

        for (int i = index; i < tempArr.length; i++) {
            tempArr[i] = array[i + 1];
        }

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = tempArr[i];
        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        return false;
    }

    // cкорее всего неправильно
    @Override
    public boolean addAll(Collection c) {
        Object[] newArray = c.toArray();
        int oldHash = Arrays.hashCode(array);
        int oldLength = array.length;
        try {
            array = Arrays.copyOf(array, array.length + newArray.length);
        } catch (OutOfMemoryError error) {
            throw new OutOfMemoryError();
        }
        System.arraycopy(newArray, 0, array, oldLength, newArray.length);
        int newHash = Arrays.hashCode(array);
        size();
        if (oldHash != newHash) {
            return true;
        }
        return false;
//        add(c);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++)
            array[i] = null;

        size = 0;
    }

    //не то
    @Override
    public boolean retainAll(Collection c) {
        Object[] arrayNew = toArray(array);
        for (int i = 0; i < size; i++) {
            if (c.contains(arrayNew[i])) {
                remove(arrayNew[i]);
            }
//            for (int j = 0; j < arrayNew.length; j++) {
//                System.out.println(array[j]);
//            }
        }
        return true;
    }

    //из-за remove не правильно работает
    @Override
    public boolean removeAll(Collection c) {
        Object[] newArray = c.toArray();
        int oldHash = Arrays.hashCode(array);
        for (Object x : newArray) {
            remove(x);
        }
        size();
        int newHash = Arrays.hashCode(array);
        if (oldHash != newHash) {
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        boolean a = true;
        for (int i = 0; i < array.length; i++) {
            if (c.contains(array[i])) {
                a = true;
            } else a = false;
        }
        return a;

    }

    @Override
    public Object[] toArray(Object[] a) {
        if (a.length < array.length) {
            return Arrays.copyOf(array, array.length, a.getClass());
        } else {
            System.arraycopy(array, 0, a, 0, array.length);
            return a;
        }
    }

    /*-----------------------------*/

    public class IteratorImplement implements Iterator {

        @Override
        public boolean hasNext() {
            if (startIterator != size() - 1) {
                return true;
            } else return false;
        }

        @Override
        public Object next() {
            if (startIterator >= size())
                throw new NoSuchElementException();
            startIterator++;
            return array[startIterator];
        }
    }
}
