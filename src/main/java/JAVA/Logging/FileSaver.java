package JAVA.Logging;

import exception.Save;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//import org.apache.log4j.BasicConfigurator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.status.StatusLogger;


/**
 * Created by ivnytska on 2/12/2016.
 * Скопировать исходники пятой работы (исключения) и добавить туда логирование.
 * Использовать следующие уровни:
 * <p>
 * TRACE
 * DEBUG
 * INFO
 * WARN
 * ERROR
 * <p>
 * Кроме этого использовать методы для логирования flow
 */
public class FileSaver implements Save {

    Logger LOG = LogManager.getLogger("MyLogger");
//    Logger.getRootLogger().setLevel(Level.INFO);


    public void save(String text, String file) {
        if (new File(file).exists()) {
            try {
                throw new FileAbsenceException();

            } catch (FileAbsenceException e) {

                LOG.warn("Didn't do it. File is already exist!");
                System.out.println("Такой файл уже существует!");

            }
        } else {
            try (FileWriter writer = new FileWriter(file, false)) {
                LOG.info("Новый файл создан!");
                writer.write(text);
                writer.flush();
                LOG.debug("writer.flush()");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                LOG.error("ERROR!");
            }
        }
    }
}