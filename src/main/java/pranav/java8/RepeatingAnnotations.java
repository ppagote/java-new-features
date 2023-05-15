package pranav.java8;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.logging.Logger;

public class RepeatingAnnotations {
    private static final Logger LOGGER = Logger.getLogger(RepeatingAnnotations.class.getName());

    @Retention(RetentionPolicy.RUNTIME)
    public @interface Cars {
        Manufacturer[] value() default {};
    }

    @Manufacturer("Mercedes Benz")
    @Manufacturer("Toyota")
    @Manufacturer("BMW")
    @Manufacturer("Range Rover")
    public interface Car {

    }


    @Repeatable(value = Cars.class)
    public @interface Manufacturer {
        String value();

    }

    public static void main(String[] args) {

        Manufacturer[] a = Car.class.getAnnotationsByType(Manufacturer.class);
        LOGGER.info("Number of car manufacturers is " + a.length);

        LOGGER.info("\n-------Printing out Car Manufacturers--------");

        Cars cars = Car.class.getAnnotation(Cars.class);
        Arrays.stream(cars.value()).map(Manufacturer::value).forEach(LOGGER::info);
    }

}
