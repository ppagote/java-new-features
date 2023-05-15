package pranav.java9;

import java.util.Optional;
import java.util.stream.Stream;

public class NewOptionalMethod {

    public static void main(String[] args) {
        Optional<String> stringOptional = Stream.of("1", "2").filter(s -> s.equals("3")).findFirst();

        String s = stringOptional.orElseThrow();
        System.out.println("s = " + s);

        stringOptional.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Not found")
        );
    }
}
