package pranav.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UnmodifiableCollectionsMethods {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");

        List<String> stringList = fruits.stream()
                .collect(Collectors.toUnmodifiableList());
        List<String> copyList = List.copyOf(fruits);

        fruits.add("berries");
        System.out.println("fruits = " + fruits);
        //stringList.add("pears");
        System.out.println("stringList = " + stringList);


        //copyList.add("mango");
        System.out.println("copyList = " + copyList);


    }
}
