package basicsProgramLibrary;

public class DecimalToBinary {

	public static void main(String[] args) {

		int number = 789;
		System.out.println(DecimalToBinaryConversion(number));

	}

	public static int DecimalToBinaryConversion(int n) {
		int binary = 0, r = 0;
		while (n != 0) {
			r = n % 2;
			binary = binary * 10 + r;
			n = n / 2;

		}

		return reverseOfNumber(binary);
	}

	public static int reverseOfNumber(int n) {
		int s = 0;
		while (n != 0) {
			s = s * 10 + n % 10;
			n = n / 10;
		}

		return s;
	}

}
