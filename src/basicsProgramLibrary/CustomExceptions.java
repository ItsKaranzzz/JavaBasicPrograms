package basicsProgramLibrary;

public class CustomExceptions extends Exception {
	String test;

//Creating Custom Exception
	public CustomExceptions(String exceptionString) {
		super(exceptionString);
	}

	public static int testInt(int x) {

		return x / 0;
	}

	public static void testString(String test) throws CustomExceptions {

		if (test.equals("test")) {
			throw new CustomExceptions("Handled!!");

		} else
			System.out.println(test);
	}

	public static void main(String[] args) {

		try {
			testString("test");
			testInt(12);
			testString("Test");

			// Handling multiple exceptions

		} catch (CustomExceptions | ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Exception catched whether custom or Arithematic");
		}

	}
	// Handling multiple exception with multiple catch
	/*
	 * catch (CustomExceptions e) { System.out.println("Custom exception catched");
	 * } catch (ArithmeticException e) {
	 * System.out.println("/zero Exception catched"); }
	 */

}
