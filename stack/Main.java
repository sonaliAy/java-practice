import java.util.Stack;

public class Main {
	public static void main(String[] args) {
	    Stack<String>stack =new Stack<>();
	    
	    //push element onto the Stack
	    stack.push("Apple");
	    stack.push("Banana");
	    stack.push("Cherry");
	    
	    //peek at the top element
	    String top = stack.peek(); //"cherry"
	    
	    //pop the top element
	    String removed = stack.pop(); //remove"cherry"
	    
	    //check if the stack is empty
	    boolean isEmpty = stack.empty(); //false
	    
	    //search for an element (1-based position)
	    int position = stack.search("Banana"); //1
	    
	    //Iterator over the stack
	    while(!stack.empty()){
	        System.out.println(stack.pop());
	    }
	}
}