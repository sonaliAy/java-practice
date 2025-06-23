import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		// Add elements
		set.add("Apple");
		set.add("Banana");
		set.add("cherry");
		set.add("Apple"); // Duplicate will be ignored

		// Check if the set contains an element
		System.out.println("Contain Banana: " + set.contains("Banana")); 
		
		// Remove an element
		set.remove("Banana");

		// Iterate over the set
		System.out.println("Elements in the set:");
		for (String item : set) {
			System.out.println(item); // Order is not guaranteed
		}

		// Get the size of the set
		System.out.println("Size of the set: " + set.size());
		
		// Check if the set is empty
		System.out.println("Is the set empty: " + set.isEmpty());

		// Clear the set
		set.clear();
		System.out.println("Size of the set after clearing: " + set.size());
	}
}
