import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
// Basically Python dictionaries lol

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap(); // Integers are the keys to the Strings in the HashMap

        map.put(1, "baker");
        map.put(2,"coomer");
        map.put(3, "susman");

        String text = map.get(2); // coomer

        // Iterating through a map:

        for(Integer i: map.keySet()) {
            int key = i;
            String value = map.get(i);
            System.out.println(key + ": " + value);
        }

        // Linked HashMaps:
        LinkedHashMap<Integer, String> linkedHashMapashMap = new LinkedHashMap<>(); // These give your maps order sorts the map by the way you put them in.

        // Tree Map:
        TreeMap<Integer, String> treeMap = new TreeMap<>(); // These sort your map's keys.
    }
}
