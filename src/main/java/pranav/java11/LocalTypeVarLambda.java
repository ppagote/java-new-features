package pranav.java11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LocalTypeVarLambda {
    public static void main(String[] args) {
        var roland = new Person("Roland", "Deschain");
        var susan = new Person("Susan", "Delgado");
        var eddie = new Person("Eddie", "Dean");
        var detta = new Person("Detta", "Walker");
        var jake = new Person("Jake", "Chambers");

        var filteredPersons =
                Stream.of(roland, susan, eddie, detta, jake)
                        .filter((var x) -> x.name().contains("a"))
                        .collect(Collectors.toList());
        System.out.println(filteredPersons);
    }

    public record Person(String name, String lastname){}
}
