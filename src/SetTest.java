import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		String[] colours = {"green", "white", "orange", "orange", "white", "green"};
		List<String> list = Arrays.asList(colours);
		
		System.out.printf("List: %s%n", list);
		
		printNonDuplicates(list);

	}
	
	private static void printNonDuplicates(Collection<String> values) {
		
		Set<String> set = new HashSet<>(values);
		
		System.out.printf("%nNo duplicates in a set and is stored as a hash table");
		
		for(String setValueinFor : set) {
			System.out.printf("%n%s ", setValueinFor);
		}
		
		System.out.println();
		
	}

}
