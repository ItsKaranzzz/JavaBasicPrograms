package basicsProgramLibrary;

public class GPseries {

	public static int nthTermofGP(int a, int b, int n) {

		int r = b / a;
		int s=1;
		for(int i=1;i<=n-1;i++)
			s=r*s;
		return a * s;
	}

	public static void main(String[] args) {

		System.out.println(nthTermofGP(2, 10, 5));
	}
}
