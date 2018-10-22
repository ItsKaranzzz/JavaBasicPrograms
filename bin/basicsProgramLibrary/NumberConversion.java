
import java.util.Scanner;

public class NumberConversion {

	private static int number;
	private static String onedigits[] = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
	private static String twodigits[] = { "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty" };
	private static String threedigits[] = { "Hunderd", "Thousands" };
	private static String teendigits[] = { "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "seventeen",
			"Eighteen", "Nineteen" };

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s;

		try {
			do {

				s = new Scanner(System.in);
				System.out.println("Enter any number between 1 to 999");
				try {

					number = s.nextInt();

				} catch (Exception e) {
					throw new Exception("Please enter the valid number");
				}
				
				if((number<=100)&&(number>0))
				System.out.println(numbertoWordConversion(number));
				
				if(number>999) {
					throw new Exception("Please enter the number within range specified");
				}
				else if((number >100)&&(number<=999)){
					numberConversionafterHundred(number);
				}
					
			} while (number != 0);
			System.out.println("You have been exited");
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

	public static String numbertoWordConversion(int n)  {

		if ((n < 10) && (n > 0)) {
			return onedigits[n-1];
	
		} else if ((n > 10) && (n < 20)) {
			int r = n % 10;
			return teendigits[r - 1];

		} else if ((n == 10) || (n == 20) || (n == 30) || (n == 40) || (n == 40) || (n == 50) || (n == 60) || (n == 70)
				|| (n == 80) || (n == 90)) {
			n = n / 10;

			return twodigits[n - 1];
		} else if ((n > 20) && (n < 100) && (n != 10) && (n != 20) && (n != 30) && (n != 40) && (n != 40) && (n != 50)
				&& (n != 60) && (n != 70) && (n != 80) && (n != 90)) {
			int r = n % 10;
			n = n / 10;
			return (twodigits[n - 1] + " " + onedigits[r - 1]);
	
		} else if (n == 100) {
			return threedigits[0];

		}
		
			return null;
		
			
		}
		
	public static void numberConversionafterHundred(int n) {
		
			int r=n%100;
			int t=n/100;
			
			if(numbertoWordConversion(r)!=null)
			System.out.println(onedigits[t-1]+" "+threedigits[0]+" "+numbertoWordConversion(r));
			else	
			System.out.println(onedigits[t-1]+" "+threedigits[0]);
		
		
		
	}
		
		

}
