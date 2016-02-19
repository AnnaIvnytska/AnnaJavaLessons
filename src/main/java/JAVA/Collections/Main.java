package JAVA.Collections;

/**
 * Created by ivnytska on 2/17/2016.
 */
public class Main {

    public static void main(String[] args) {
        CollectionImplement<String> collectionImplement = new CollectionImplement<String>();
        collectionImplement.add("1");
        collectionImplement.add("2");
        collectionImplement.add("3");
        collectionImplement.add("4");
        collectionImplement.add("5");
        collectionImplement.add("6");
        collectionImplement.add("7");
        collectionImplement.add("8");
        collectionImplement.add("9");
        collectionImplement.add("10");

        CollectionImplement<String> additionalCollection = new CollectionImplement<String>();
        additionalCollection.add("1");
        additionalCollection.add("2");
        additionalCollection.add("3");
//        additionalCollection.add("4");
//        additionalCollection.add("5");
//        additionalCollection.add("6");
        additionalCollection.add("7");
//        additionalCollection.add("8");
//        additionalCollection.add("9");
//        additionalCollection.add("10");

        String[] aaa = {};

//        System.out.println("collectionImplement.size() = " + collectionImplement.size());
//        System.out.println("collectionImplement.isEmpty() = " + collectionImplement.isEmpty());
//        System.out.println("collectionImplement.contains() = " + collectionImplement.contains("1"));
//  ?        System.out.println("iterator = " + collectionImplement.iterator());
//        System.out.println("collectionImplement.toArray() = " + collectionImplement.toArray());
//        System.out.println("collectionImplement.remove() = " + collectionImplement.remove("8"));
//        System.out.println("collectionImplement.addAll() = " + collectionImplement.addAll(additionalCollection));
//        collectionImplement.clear();
//        System.out.println("collectionImplement.containsAll() = " + collectionImplement.containsAll(additionalCollection));
//        System.out.println("collectionImplement.toArray() = " + collectionImplement.toArray());
//        System.out.println("collectionImplement.toArray() = " + collectionImplement.toArray(aaa));
//        System.out.println("collectionImplement.removeAll() = " + collectionImplement.removeAll(additionalCollection));
        System.out.println("collectionImplement.retainAll() = " + collectionImplement.retainAll(additionalCollection));


    }

}

