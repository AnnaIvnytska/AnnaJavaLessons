package JAVA.Reflection.Task2;

//import com.sun.java.util.jar.pack.Package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by ivnytska on 3/1/2016.
 */

/*Существует интерфейс:
public interface PathClassLoader {
    void setPath(String dir);
    String getPath();
}
Создать наследника класса ClassLoader имплементирующего PathClassLoader, который сможет загружать классы не только из
classpath, но и из сторонней директории, имя которой передается через функции интерфейса PathClassLoader.
*/

public class ClassLoaderChild extends ClassLoader implements IPathClassLoader {
    private Path directory;

    public ClassLoaderChild(ClassLoader parent) {
        super(parent);
    }

    @Override
    public void setPath(String dir) {
//        Path folder = Paths.get(dir);
//        this.directory = folder;
        Path folder = null;
        if (!dir.contains(".class")) {
            folder = Paths.get(dir);
        } else {
            folder = Paths.get(dir);
            folder = folder.getParent();
        }
        this.directory = folder;
    }

    @Override
    public String getPath() {
        return directory.toString();
    }

//    public Class<?> loadClassFromFile(String className) throws ClassNotFoundException, IOException, NullPointerException {
//        File pathToFile = null;
//        byte[] bytes = null;
//        if (directory == null) {
//            throw new ClassNotFoundException();
//        }
//        if (!className.matches(".class")) {
//            className = className.replace('.', File.separatorChar) + ".class";
//        }
//        pathToFile = directory.resolve(className).toFile();
//        bytes = loadFileFromFs(pathToFile);
//        return defineClass(null, bytes, 0, bytes.length);
//    }
//
//    private byte[] loadFileFromFs(File pathToFile) throws IOException {
//        byte[] bytes = null;
//        if (!pathToFile.exists()) {
//            throw new FileNotFoundException();
//        }
//        bytes = Files.readAllBytes(pathToFile.toPath());
//        return bytes;
//    }
}