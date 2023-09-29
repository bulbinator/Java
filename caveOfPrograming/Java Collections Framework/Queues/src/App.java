import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
    public static void main(String[] args) {
        // line of ppl:  (head of queue) <-- ooooooooo <-- (tail of queue)
        // Queues are a FIFO structure, i.e First in, First out. So in this case, an item enters from the tail and exits from the head

        Queue<Integer> q1 = new ArrayBlockingQueue<>(3);
    }
}
