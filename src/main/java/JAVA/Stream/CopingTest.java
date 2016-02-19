package JAVA.Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by ivnytska on 2/19/2016.
 */
public class CopingTest {

    public static void main(String[] args) {

        Path pathSource = Paths.get("C:\\Users\\ivnytska\\Desktop\\1");
        Path pathDestination = Paths.get("C:\\Users\\ivnytska\\Desktop\\new");
        try {
            Files.walkFileTree(pathSource, new DirectoryCopy(pathSource,pathDestination));
            System.out.println("Files copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
