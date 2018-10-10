package basicsProgramLibrary;

public class FinalStatic {

	// Illustration to show that final / static functions can be overloaded
	// in java

	public final void test1() {
		System.out.println("HE");
	}

	public final void test1(int k) {
		System.out.println("She");

	}

	public static void test2() {
		System.out.println("Man");
	}

	public static void test2(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {

		test2();
		test2("Female");
		new FinalStatic().test1();
		new FinalStatic().test1(10);
	}
}
