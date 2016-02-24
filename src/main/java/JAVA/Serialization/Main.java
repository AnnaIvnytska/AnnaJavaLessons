package JAVA.Serialization;

import java.io.IOException;

/**
 * Created by ivnytska on 2/23/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Account account = new Account();
        Serialization serialization = new Serialization();
        serialization.serializing(account);
        serialization.deserializing(account);
    }
}