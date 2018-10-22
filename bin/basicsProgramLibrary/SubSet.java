import java.util.HashSet;

public class SubSet {

	public static void main(String[] args) {

		int A[] = { 3, 5, 8, 1, 9, 4, 5, 7 };
		int B[] = { 2, 0 };
		int C[] = { 1, 5, 2 };
		int D[] = { 0, 1, 3, 2, 6 };
		int E[] = { 8, 1, 9, 4 };

		System.out.println(subSetCheck(A, B));
		System.out.println(subSetCheck(A, C));
		System.out.println(subSetCheck(A, D));
		System.out.println(subSetCheck(A, E));
	}

	public static boolean subSetCheck(int[] a, int[] b) {

		HashSet<Integer> setA = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			setA.add(a[i]);
		}

		for (int i = 0; i < b.length; i++) {
			if (setA.add(b[i])) {
				return false;
			}

		}

		return true;

	}

}
