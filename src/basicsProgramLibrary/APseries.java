package basicsProgramLibrary;

public class APseries {

	public static int nthTermofAP(int a, int b, int n) {

		int s = 0;
		s = a + (n - 1) * (b - a);
		return s;
	}

	public static void main(String[] args) {

		System.out.println(nthTermofAP(2, 3, 4));
		System.out.println(nthTermofAP(1, 2, 10));
	}
}
