package pranav.java8;

import java.util.Date;
import java.util.logging.Logger;

public class DefaultMethods {
    private static final Logger LOGGER = Logger.getLogger(DefaultMethods.class.getName());

    public interface Logging {
        void log(String message);

        default void log(String message, Date date) {
            LOGGER.info(date.toString() + ": " + message);
        }
    }

    public class LoggingImplementation implements Logging {

        @Override
        public void log(String message) {
            LOGGER.info(message);
        }
    }
}
