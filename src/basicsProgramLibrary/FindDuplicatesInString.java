package basicsProgramLibrary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicatesInString {

	public static void main(String[] args) {

		String given = "Karan Chaudhary";
		stringDuplicateFinder(given);
		duplicateFinderwithOccurenceCount(given);

	}

	// For finding the duplicate entities within a String

	public static void stringDuplicateFinder(String x) {

		char arr[] = x.toCharArray();

		int count = 0;
		String out = "";
		HashSet<Character> uniqueChar = new HashSet<Character>();
		for (int i = 0; i < arr.length; i++) {
			if (!uniqueChar.add(arr[i])) {
				// System.out.println("duplicate char:" + arr[i]);
				out = out + arr[i];
			}

		}

		System.out.println("Duplicates in the String are: " + DuplicateRemoval.duplicateRemooval(out));

	}

	// to Find the duplicates and the no of occurence of the duplication

	public static void duplicateFinderwithOccurenceCount(String x) {

		char arr[] = x.toCharArray();
		HashMap<Character, Integer> allChars = new HashMap<Character, Integer>();

		for (char c : arr) {
			if (allChars.containsKey(c))
				allChars.put(c, allChars.get(c) + 1);
			else
				allChars.put(c, 1);

		}

		Set<Character> keys = allChars.keySet();
		for (char c : keys) {
			if (allChars.get(c) > 1) {
				System.out.println(c + "--->" + allChars.get(c));

			}
		}

	}

}
