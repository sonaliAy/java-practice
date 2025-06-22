import java.util.LinkedList;

public  class Main {
	public static void main(String[] args) {
	LinkedList<String>list =new LinkedList<>();

//Add element
		list.add("Apple");
		list.add("Banana");
		list.add("cheery");

//Add element at the beginning and end
		list.addFirst("orange");
		list.addLast("grapes");

//get first and last element
		String first = list.getFirst();  //"orange"
		String last = list.getLast();    //"grapes"

//remove first and last element
		list.removeFirst();  //remove "orange"
		list.removeLast();   //remove"grapes"

//iterate over list
		for(String item:list) {
			System.out.println(item);
		}
	}
}