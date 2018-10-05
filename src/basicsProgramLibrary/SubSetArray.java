package basicsProgramLibrary;

import java.util.HashSet;

public class SubSetArray {

	public static void main(String[] args) {

		int A[] = { 3, 2, 5, 6, 8, 0, 9, 7 };
		int B[] = { 1, 4 };
		int C[] = { 3, 1, 0, 4 };
		int D[] = { 3, 6, 8, 0 };

		System.out.println(subsetCheck(A, B));
		System.out.println(subsetCheck(A, C));
		System.out.println(subsetCheck(A, D));
	}

	public static boolean subsetCheck(int a[], int b[]) {
		HashSet<Integer> base = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++)
			base.add(a[i]);

		for (int j = 0; j < b.length; j++) {
			if (base.add(b[j]))
				return false;
		}

		return true;
	}
}
