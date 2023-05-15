package pranav.java9;

import java.util.logging.Logger;

public class DiamondOperator {
    private static final Logger LOGGER = Logger.getLogger(DiamondOperator.class.getName());

    public abstract static class StringAppender<T> {
        public abstract T append(String a, String b);
    }

    public static void main(String[] args) {
        StringAppender<String> appending = new StringAppender<>() {
            @Override
            public String append(String a, String b) {
                return a + "-" + b;
            }
        };
        String append = appending.append("Pranav", "Pagote");
        LOGGER.info("append = " + append);
    }
}
