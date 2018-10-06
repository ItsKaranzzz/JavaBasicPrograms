package basicsProgramLibrary;

import java.util.HashSet;

public class DuplicateRemoval {
	static String input, output;

	public static void main(String[] args) {
		input = "ababbabccde";
		System.out.println("String after removal of duplicate is: " + duplicateRemooval(input));
	}

	public static String duplicateRemooval(String s) {
		output = "";
		char arr[] = s.toCharArray();

		HashSet<Character> test = new HashSet<Character>();
		for (int i = 0; i < arr.length; i++)
			test.add(arr[i]);

		for (char a : test) {
			output = output + a;
		}

		return output;

	}
}
