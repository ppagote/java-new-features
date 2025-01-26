package pranav.java21;

import java.util.HashMap;
import java.util.Map;

//https://www.happycoders.eu/java/java-19-features/
public class PreloadedHashMap {

    public static void main(String[] args) {

        //this will store 10*.75 = 7 data (by default) and the   double the size.
        Map<String, String> map = new HashMap<>(10);

        int ceil = (int) Math.ceil(10 / (double) 0.75f);
        System.out.println("ceil = " + ceil);
        //this will allow 10 data and internally create hashmap with size as 14.
        HashMap<Object, Object> map1 = HashMap.newHashMap(10);
    }
}
