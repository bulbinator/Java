import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        // Set store only unique items, storing the same item will not work.
        Set<String> hashSet = new HashSet<>(); // HashSet do not retain order.

        hashSet.add("baker");
        hashSet.add("coomer");
        hashSet.add("susman");

        Set<String> linkedSet = new LinkedHashSet<>(); // HashSet do not retain order.
        Set<String> treeSet = new TreeSet<>();


        // Iteration:

        for(String i: hashSet) {
            System.out.println(i);
        }

        // Contain fucntion:

        if (hashSet.contains("coomer")) {
            System.out.println("Contains coomer");
        }


    }
}
