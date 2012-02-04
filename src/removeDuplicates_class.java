import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		System.out.println();

		test1 = null;
		removeDuplicates(test1);
		if (test1 == null)
			return;
		else
			for (String str : test1) {
				System.out.print(str + ",");
			}
	}
}
