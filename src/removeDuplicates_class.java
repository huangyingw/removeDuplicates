import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicates_class {
	static void removeDuplicates(List<String> obj) {
		if (obj == null)
			return;
		for (int i = 0; i < obj.size(); i++) {
			for (int j = obj.size() - 1; j > i; j--) {
				if (obj.get(i).equals(obj.get(j))) {
					obj.remove(j);
				}
			}
		}
	}

	static void removeDuplicates_set(List<String> obj) {
		Set<String> set = new HashSet<String>();
		set.addAll(obj);
		obj.clear();
		obj.addAll(set);
	}

	public static void main(String args[]) {
		List<String> test1 = new ArrayList<String>(Arrays.asList("good",
				"better", "best", "best", "first", "last", "last", "last",
				"good"));
		removeDuplicates(test1);
		for (String str : test1) {
			System.out.print(str + ",");
		}
		System.out.println();

		test1 = new ArrayList<String>(Arrays.asList("good", "better", "best",
				"best", "first", "last", "last", "last", "good"));
		removeDuplicates_set(test1);
		for (String str : test1) {
			System.out.print(str + ",");
		}

	}
}
