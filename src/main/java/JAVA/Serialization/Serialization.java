package JAVA.Serialization;

import java.io.*;

/**
 * Created by ivnytska on 2/24/2016.
 */
public class Serialization {
    public void serializing(Account obj) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("objects1.dat"));
        out.writeObject(obj);
        out.flush();
        out.close();
    }

    public void deserializing(Account obj) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("objects1.dat"));
        obj = (Account) in.readObject();
        System.out.println(obj.getId() + obj.getName() + obj.getRole());

    }
}