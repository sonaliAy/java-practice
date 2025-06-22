import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // PriorityQueue with natural ordering
        PriorityQueue<String> queue = new PriorityQueue<>();

        // Add elements to the queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("cherry");

        // Peek at the highest-priority element
        String top = queue.peek();  // "Apple" (natural order for String)

        // Poll the highest-priority element
        String removed = queue.poll();  // removes "Apple"

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();  // false

        // Iterate over the queue
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // PriorityQueue with custom comparator (reverse order)
        PriorityQueue<Integer> customQueue = new PriorityQueue<>(Comparator.reverseOrder());

        // Add elements to the custom queue
        customQueue.add(1);
        customQueue.add(3);
        customQueue.add(2);

        // Iterate over the custom queue
        while (!customQueue.isEmpty()) {
            System.out.println(customQueue.poll());  // prints: 3, 2, 1
        }
    }
}
