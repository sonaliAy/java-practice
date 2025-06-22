import java.util.LinkedList;
import java.util.Queue;
 public class Main{
    public static void main(String[]args){
        Queue<String>queue = new LinkedList<>();
        
        //add element to the queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        
        //peek at the front element
        String front = queue.peek();  //"Apple"
        
        //remove the front element
        String removed = queue.poll();  //remove"Apple"
        
        //check if the queue is empty
        boolean isEmpty = queue.isEmpty();  //false
        
        //iterate over the queue
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}