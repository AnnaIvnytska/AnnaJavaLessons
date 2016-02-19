package JAVA.Stream;

import java.io.*;

/**
 * Created by ivnytska on 2/19/2016.
 */
public class CopingDirectoryIO {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("C:\\\\Users\\\\ivnytska\\\\Desktop\\\\1");
        File destFolder = new File("C:\\\\Users\\\\ivnytska\\\\Desktop\\\\1new");
        if (!srcFolder.exists()) {

            System.out.println("Directory does not exist.");
            //just exit
            System.exit(0);
        } else {
            copyFolder(srcFolder, destFolder);
        }
    }

    public static void copyFolder(File src, File dest) throws IOException {
        if (src.isDirectory()) {
            if (!dest.exists()) {
                dest.mkdir();
                System.out.println("Directory copied from " + src + "  to " + dest + "(вроде 1 раз, если нет файла)");
            }

            String[] files = src.list();
            for (String file : files) {
                File srcFolder = new File(src, file);
                File destFolder = new File(dest, file);
                copyFolder(srcFolder, destFolder);
            }
        } else {
            InputStream inputStream = new FileInputStream(src);
            OutputStream outputStream = new FileOutputStream(dest);

            byte[] buffer = new byte[1024];

            int length;

            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            inputStream.close();
            outputStream.close();
            System.out.println("File copied from " + src + " to " + dest);
        }

    }
}
