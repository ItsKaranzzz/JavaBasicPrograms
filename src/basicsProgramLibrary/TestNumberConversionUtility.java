package basicsProgramLibrary;

import com.util.app.NumberToWordConversionApp;

public class TestNumberConversionUtility {
	public static void main(String[] args) {
		NumberToWordConversionApp t = new NumberToWordConversionApp();

		System.out.println(t.convertNumberLessThanOrHundred(13));
		System.out.println(t.convertNumberGreaterthanHundred(763));
		t.numToWordConversionStandaloneApp();
	}
}
