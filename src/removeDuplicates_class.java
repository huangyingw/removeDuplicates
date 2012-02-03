import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicates_class {
	static void removeDuplicates(List<String> obj) {
		Set<String> set = new HashSet<String>();
		set.addAll(obj);
		obj.clear();
		obj.addAll(set);
	}

	public static void main(String args[]) {
		// String[] arr = { "good", "better", "best", "best", "first", "last",
		// "last", "last", "good" };
		// List test = Arrays.asList(arr);
		List<String> test1 = new ArrayList<String>(Arrays.asList("good",
				"better", "best", "best", "first", "last", "last", "last",
				"good"));
		removeDuplicates(test1);
		for (String str : test1) {
			System.out.print(str + ",");
		}
	}
}
