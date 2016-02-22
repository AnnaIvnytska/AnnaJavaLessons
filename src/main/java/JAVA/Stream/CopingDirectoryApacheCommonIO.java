package JAVA.Stream;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by ivnytska on 2/22/2016.
 */
public class CopingDirectoryApacheCommonIO {
    public static void main(String[] args) {
        File srcFolder = new File("C:\\\\Users\\\\ivnytska\\\\Desktop\\\\1");
        File destFolder = new File("C:\\\\Users\\\\ivnytska\\\\Desktop\\\\1new");
        try {
            FileUtils.copyDirectory(srcFolder, destFolder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
