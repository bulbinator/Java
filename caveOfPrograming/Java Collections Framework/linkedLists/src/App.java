import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // Array list vs Linked List:

        ArrayList<Integer> arrayList = new ArrayList<>(); // If you want to remove items from the end of your list, use arrays.
        LinkedList<Integer> linkedList = new LinkedList<>(); // If you want to remove items from anywhere in your list, use linked lists.

        timer("ArrayList", arrayList);
        timer("LinkedList", linkedList);

    }

    // Testing these two lists:

    private static void timer(String type, List<Integer> list) {
        // Initializing lists
        for(int i=0; i<1E5; i++){  // "1E5" is 100,000 items

            list.add(i);
        }

        // records start time:
        long start = System.currentTimeMillis();

        /* Adding items at the end of the list (PS time is pretty insignificant here)
        for(int i = 0; i <1E5; i++) {
            list.add(i);
        }
        */

        // Adding items elsewhere in the list
        for(int i=0; i<1E5; i++){
            list.add(0, i);
        }

        // Time taken: 1793 ms for ArrayList
        // Time taken: 6 ms for LinkedList
        // SHEESH

        // records end time
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end-start) + " ms for " + type);
    }
}

/*
 * ArrayList manage arrays internally:
 * [0][1][2][3][4][5]....
 * So if you want to add an item in between or in the middle, it has the change the position of each element in the array. i.e they all go up one.
 *
 * LinkedList consist of elements where each element references the next element
 * [0]->[1]->[2]->....
*/
