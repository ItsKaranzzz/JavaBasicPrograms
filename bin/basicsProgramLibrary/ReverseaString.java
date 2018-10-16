
public class ReverseaString {

	public static void main(String[] args) {
		// Reverse String type 1
		String x = new String("Karan");
		String y = "";
		for (int i = x.length() - 1; i >= 0; i--) {
			y = y + x.charAt(i);
		}
		System.out.println(y);

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		// reverse String type 2
		StringBuffer s = new StringBuffer(x);
		System.out.println(s.reverse());

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		// Garbage removal from string
		System.out.println("~~~~~~~~~~~~~Remove Garbage~~~~~~~~~~~~~~");

		String p = "!@#!@#!@$@#$@#KARAN1@#!@$@#$@#$CHAUDAHARY!@#$()@#_$)@_#)$_@#)$(@_#$";

		System.out.println(p.replaceAll("[^A-Za-z0-9]", ""));

		// Finding missing number from Array
		System.out
				.println("~~~~~~~~~~~~~~~~~~~~~~~~~Finding the missing no. in an array~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		int arr[] = { 1, 2, 3, 5, 6, 7 };

		int l = 0;
		int k = 0;
		for (int i = 1; i <= 7; i++) {
			l = l + i;

		}
		for (int j = 0; j < arr.length; j++) {
			k = k + arr[j];

		}
		System.out.println(l - k);

		// Reverse of a number
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		int number = 14239;

		int r, reversenumber = 0;

		while (number != 0) {
			r = number % 10;
			reversenumber = reversenumber * 10 + r;
			number = number / 10;

		}

		System.out.println(reversenumber);

		
		
		
	}

}
