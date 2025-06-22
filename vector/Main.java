import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // Add elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cheery");

        // Add element at specific position
        vector.add(1, "orange");

        // Get element at index
        String fruit = vector.get(2);  // "Banana"

        // Set element at index
        vector.set(2, "papaya");

        // Remove element by index
        vector.remove(1);  // removes "orange"

        // Remove element by value
        vector.remove("papaya");

        // Iterate over Vector
        for (String item : vector) {
            System.out.println(item);
        }

        // Check if vector contains a specific element
        boolean hasApple = vector.contains("Apple");

        // Get size of Vector
        int size = vector.size();
    }
}
