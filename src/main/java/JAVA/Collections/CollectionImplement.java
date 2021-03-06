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


    // работает
    @Override
    public int size() {
        int count = 0;
        for (Object item : array) {
            count++;
            size = count;
        }
        return count;
    }

    // работает
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

    // работает
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

    //работает
    @Override
    public boolean add(Object o) {
        size();
        array = Arrays.copyOf(array, size + 1);
        array[size] = o;
        size();
        if (contains(o))
            return true;
        else return false;
    }

    // работает
    @Override
    public boolean remove(Object o) {
        int index = 0;
        if (!contains(o)) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(o)) {
                index = i;
            }
        }

        Object[] tempArr = new Object[array.length - 1];

        for (Object item : array) {
            for (int i = 0, j = 0; i < array.length; i++) {
                if (array[i] != o) {
                    tempArr[j] = array[i];
                    j++;
                }
            }
        }

        array = Arrays.copyOf(tempArr, tempArr.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = tempArr[i];
        }

        if (!contains(o)) {
            return true;
        } else
            return false;
    }


    // работает(1й вариант)
//    @Override
//    public boolean addAll(Collection c) {
//        Object[] newArray = c.toArray();
//        int oldHash = Arrays.hashCode(array);
//        int oldLength = array.length;
//        try {
//            array = Arrays.copyOf(array, array.length + newArray.length);
//        } catch (OutOfMemoryError error) {
//            throw new OutOfMemoryError();
//        }
//        System.arraycopy(newArray, 0, array, oldLength, newArray.length);
//        int newHash = Arrays.hashCode(array);
//        size();
//        if (oldHash != newHash) {
//            return true;
//        }
//        return false;
//    }

    //работает(2й вариант)
    @Override
    public boolean addAll(Collection c) {
        Object[] newArray = c.toArray();
        for (Object item : newArray)
            add(item);
        if (containsAll(c)) {
            return true;
        } else return false;
    }

    //работает
    @Override
    public void clear() {
        for (int i = 0; i < size; i++)
            array[i] = null;
        size = 0;
    }

    //работает
    @Override
    public boolean retainAll(Collection c) {
        for (Object itemOld : array) {
            if (!c.contains(itemOld)) {
                remove(itemOld);
            }
        }

        if (c.size() == array.length && containsAll(c)) {
            return true;
        } else return false;
    }

    //работает
    @Override
    public boolean removeAll(Collection c) {
        Object[] newArray = c.toArray();
        int oldHash = Arrays.hashCode(array);
        for (Object item : newArray) {
            remove(item);
        }
        size();
        int newHash = Arrays.hashCode(array);
        if (oldHash != newHash) {
            return true;
        }
        return false;
    }

    //работает
    @Override
    public boolean containsAll(Collection c) {
        Object[] newArray = c.toArray();
        boolean a = true;//
        for (Object item : newArray) {
            if (contains(item)) {
                a = true;
            } else {
                a = false;
                break;
            }
        }
        return a;
    }

    @Override
    public Object[] toArray(Object[] a) {
        if (a.length < array.length) {
            Arrays.copyOf(array, array.length, a.getClass());
//            System.arraycopy(array, 0, a, 0, array.length);
        } else {
            System.arraycopy(array, 0, a, 0, array.length);
        }
        return a;
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
