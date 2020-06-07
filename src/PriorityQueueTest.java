import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<Double> queue = new PriorityQueue<>();
		
		queue.offer(3.2);
		queue.offer(1.2);
		queue.offer(5.4); //offer allows us to insert elements of double type
		
		System.out.println("Polling from the queue:");
		
		while(queue.size() > 0) {
			System.out.printf("%n%.1f%n", queue.peek()); //view the top element has changed
			queue.poll(); //removes the highest priority element...
		}
		
		System.out.printf("Is the queue now empty after calling poll %f%n", queue.poll());
		
		queue.offer(1.1);
		
		System.out.println("Polling from the queue using an enhanced for:");
		
		for(Double d: queue) {
			System.out.printf("%n%.1f", d);
		}
		
		queue.poll(); //poll removes the highest-priority element of the priority queue i.e. head of the queue
		
		System.out.printf("%n%nPolling from the queue using an enhanced for after poll:");
		
		for(Double d: queue) {
			System.out.printf("%n%.1f", d);
		}
		

	}

}
