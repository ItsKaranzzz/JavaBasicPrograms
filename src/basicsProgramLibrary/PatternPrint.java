package basicsProgramLibrary;

public class PatternPrint {

	/*
	 * 333222111$ 
	 * 332211$ 
	 * 321$
	 * 
	 */

	public static void printPat(int n) {

		for (int i = n; i >= 1; i--) {
			{
				for (int j = n; j >= 1; j--) {

					for (int k = 0; k < i; k++)
						System.out.print(j);
				}
				System.out.println("$");
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {

		printPat(2);
		System.out.println();
		printPat(3);
	}
}
