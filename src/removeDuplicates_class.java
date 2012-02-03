import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class removeDuplicates_class {
	static void removeDuplicates(List<String> obj) {
		Iterator<String> iteri = obj.iterator();
		Iterator<String> iterj;
		while (iteri.hasNext()) {
			iterj = iteri;
			while (iterj.hasNext()) {
				if (iteri.equals(iterj.next()))
					iterj.remove();
			}
			iteri.next();
		}
	}

	public static void main(String args[]) {
		List<String> test1 = new ArrayList<String>(Arrays.asList("good",
				"better", "best", "best", "first", "last", "last", "last",
				"good"));
		removeDuplicates(test1);
		for (String str : test1) {
			System.out.print(str + ",");
		}
	}
}
