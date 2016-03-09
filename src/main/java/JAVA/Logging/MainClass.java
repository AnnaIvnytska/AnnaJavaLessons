package JAVA.Logging;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.status.StatusLogger;

/**
 * Created by ivnytska on 2/15/2016.
 * <p>
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

public class MainClass {
    public static void main(String[] args) {
        Logger LOG = LogManager.getLogger("MyLogger");

        LOG.trace("Entering application");
        FileSaver fileSaver = new FileSaver();
        fileSaver.save("тра-та-та", "C:\\Users\\ivnytska\\Desktop\\anna.txt");

        LOG.trace("Exiting application.");

    }
}
