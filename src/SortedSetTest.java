import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

	public static void main(String[] args) {
		String[] colours = {"green", "white", "orange", "orange", "white", "green"};
		SortedSet<String> tree = new TreeSet<>(Arrays.asList(colours));
		
		System.out.println("sorted set");
		printSet(tree);
		
		System.out.println("headset orange");
		printSet(tree.headSet("orange")); //every element less than orange
		
		System.out.println("headset orange");
		printSet(tree.tailSet("orange")); //every element greater than or equal to orange
		
		System.out.printf("first: %s%n", tree.first());
		System.out.printf("last: %s%n", tree.last());

	}
	
	private static void printSet(SortedSet<String> set) {
		for(String s: set) {
			System.out.printf("%s ", s);
		}
		System.out.println();
	}

}
