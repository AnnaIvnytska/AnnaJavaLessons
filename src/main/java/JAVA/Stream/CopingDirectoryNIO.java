package JAVA.Stream;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by ivnytska on 2/22/2016.
 */
public class CopingDirectoryNIO {
    public static void main(String[] args) throws IOException {
        Path pathSource = Paths.get("C:\\Users\\ivnytska\\Desktop\\1");
        Path pathDestination = Paths.get("C:\\Users\\ivnytska\\Desktop\\1new");

        Files.walkFileTree(pathSource, new FileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                System.out.println("pre visit dir:" + dir);
                Path newd = pathDestination.resolve(pathSource.relativize(dir));
                try {
                    //Files.copy(pathSource, newd, StandardCopyOption.REPLACE_EXISTING);
                    Files.createDirectories(newd);
                } catch (FileAlreadyExistsException e) {
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Скопированно:" + dir + " в " + newd);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println("visit file: " + file);
                Path newd = pathDestination.resolve(pathSource.relativize(file));
                try {
                    Files.copy(file, newd, StandardCopyOption.REPLACE_EXISTING);
                } catch (FileAlreadyExistsException e) {
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
