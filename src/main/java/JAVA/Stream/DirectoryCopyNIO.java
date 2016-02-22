package JAVA.Stream;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by ivnytska on 2/19/2016.
 */
public class DirectoryCopyNIO extends SimpleFileVisitor {
    private Path source, destination;

    public DirectoryCopyNIO(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

//    public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes) {
//        Path newd = destination.resolve(source.relativize(path));
//        try {
//            Files.copy(path, newd, StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return FileVisitResult.CONTINUE;
//    }

    public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes) {
        Path newd = destination.resolve(source.relativize(path));
        try {
            Files.copy(path, newd, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes fileAttributes) {
        Path newd = destination.resolve(source.relativize(path));
        try {
            Files.copy(path, newd, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return FileVisitResult.CONTINUE;
    }


    public static void main(String[] args) {

        Path pathSource = Paths.get("C:\\Users\\ivnytska\\Desktop\\1");
        Path pathDestination = Paths.get("C:\\\\Users\\\\ivnytska\\\\Desktop\\\\1new");
        try {
            BasicFileAttributes basicAttr = Files.readAttributes(pathSource, BasicFileAttributes.class);

            Files.walkFileTree(pathSource, new DirectoryCopyNIO(pathSource, pathDestination));
            DirectoryCopyNIO directoryCopyNIO = new DirectoryCopyNIO(pathSource, pathDestination);
            directoryCopyNIO.visitFile(pathSource, basicAttr);
            directoryCopyNIO.preVisitDirectory(pathSource, basicAttr);
            System.out.println("Files copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}