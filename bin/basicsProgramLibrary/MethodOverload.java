
public class MethodOverload {

	public static void main(String args) {

		System.out.println("Test Main 1");


	}

	public static void main(int a, int b) {
		System.out.println("Test M<ain  2");
	}

	public static void main(int b) {
		System.out.println("Test M<ain  3");
	}

	public static void main(String[] ar) {

		System.out.println("Test Main 4");
		main(12, 20);
		main(100);
		main("Karan");
	}

}
