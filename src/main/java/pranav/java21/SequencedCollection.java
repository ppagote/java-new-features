package pranav.java21;

import java.util.*;

//https://howtodoinjava.com/java/sequenced-collections/
public class SequencedCollection {

    public static void main(String[] args) {

        sequencedCollection();

        sequencedSet();

        sequencedMap();

        List<Integer> list = List.of(1, 2, 3);
        //list.addLast(4);  //Exception in thread "main" java.lang.UnsupportedOperationException

        TreeSet<Integer> set = new TreeSet(List.of(1, 2, 3));
        // set.addFirst(4);  //Exception in thread "main" java.lang.UnsupportedOperationException

        List<Integer> list1 = List.of();
        //list.getFirst();  //Exception in thread "main" java.lang.NoSuchElementException
    }

    private static void sequencedMap() {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println("firstEntry = " + map.firstEntry()); //1=One
        System.out.println("lastEntry = " + map.lastEntry()); //3=Three
        System.out.println(map);  //{1=One, 2=Two, 3=Three}
        Map.Entry<Integer, String> first = map.pollFirstEntry();   //1=One
        System.out.println("first = " + first);
        Map.Entry<Integer, String> last = map.pollLastEntry();    //3=Three
        System.out.println("last = " + last);
        System.out.println(map);  //{2=Two}
        map.putFirst(1, "One");     //{1=One, 2=Two}
        map.putLast(3, "Three");    //{1=One, 2=Two, 3=Three}
        System.out.println(map);  //{1=One, 2=Two, 3=Three}
        System.out.println(map.reversed());   //{3=Three, 2=Two, 1=One}
    }

    private static void sequencedSet() {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(List.of(1, 2, 3));
        System.out.println("linkedHashSet = " + linkedHashSet);
        Integer firstElement = linkedHashSet.getFirst();   // 1
        System.out.println("firstElement = " + firstElement);
        Integer lastElement = linkedHashSet.getLast();    // 3
        System.out.println("lastElement = " + lastElement);
        linkedHashSet.addFirst(0);  //List contains: [0, 1, 2, 3]
        System.out.println("lastElement = " + lastElement);
        linkedHashSet.addLast(4);   //List contains: [0, 1, 2, 3, 4]
        System.out.println("lastElement = " + lastElement);
        System.out.println(linkedHashSet.reversed());   //Prints [5, 3, 2, 1, 0]
    }

    private static void sequencedCollection() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);   // List contains: [1]
        System.out.println("arrayList = " + arrayList);

        arrayList.addFirst(0);  // List contains: [0, 1]
        System.out.println("arrayList = " + arrayList);
        arrayList.addLast(2);   // List contains: [0, 1, 2]
        System.out.println("arrayList = " + arrayList);

        Integer firstElement = arrayList.getFirst();  // 0
        System.out.println("firstElement = " + firstElement);
        Integer lastElement = arrayList.getLast();  // 2
        System.out.println("lastElement = " + lastElement);

        List<Integer> reversed = arrayList.reversed();
        System.out.println(reversed); // Prints [2, 1, 0]


        arrayList.add(3);

        System.out.println(arrayList);      //[0, 1, 2, 3]
        System.out.println(arrayList.reversed());    //[3, 2, 1, 0]
    }
}
