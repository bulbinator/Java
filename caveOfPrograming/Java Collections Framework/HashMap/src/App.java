import java.util.HashMap;
import java.util.Map;
// Basically Python dictionaries lol

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap(); // Integers are the keys to the Strings in the HashMap

        map.put(1, "baker");
        map.put(2,"coomer");
        map.put(3, "susman");

        String text = map.get(2); // coomer
        String Null = map.get(4); // prints null

        // Iterating through a map:

        for(Map.Entry<Integer, String> i: map.entrySet()) {
            int key = i.getKey();
            String value = i.getValue();
        }

    }
}
