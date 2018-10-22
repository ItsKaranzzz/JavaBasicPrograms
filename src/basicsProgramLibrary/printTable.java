package basicsProgramLibrary;

public class printTable {

	public static void printTable(int n) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i * n);
		}
	}

	public static void main(String[] args) {

		printTable(9);
	}
}
