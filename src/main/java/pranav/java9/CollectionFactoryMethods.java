package pranav.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryMethods {

    public static void main(String[] args) {
        //Unmodifiable collections
        List<String> fruits = List.of("apple", "banana", "orange");
        Map<Integer, String> numbers = Map.of(1, "one", 2,"two", 3, "three");
        Set<String> strKeySet = Set.of("key1", "key2", "key3");
    }
}
