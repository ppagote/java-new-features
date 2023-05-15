package pranav.java10;

import java.util.List;

public class LocalTypeVar {

    public static void main(String[] args) {
        var roland = new Person("Roland", "Deschain");
        var susan = new Person("Susan", "Delgado");
        var eddie = new Person("Eddie", "Dean");
        var detta = new Person("Detta", "Walker");
        var jake = new Person("Jake", "Chambers");

        var persons = List.of(roland, susan, eddie, detta, jake);

        persons.stream()
                .map(person -> person.name + " - " + person.lastname)
                .forEach(System.out::println);
    }

    public record Person(String name, String lastname){}
}
