package basicsProgramLibrary;

public class OveridingFinalStatic extends FinalStatic {

	// Final can nnot be overridden so is static in JAva
	/*
	 * public final void test1(){ System.out.println("Male"); }
	 */ public static void main(String[] args) {

		// Here it is not overriding any thing but simply calling class methods or
		// parent class methods
		test2();
		test2("Hero");

	}

}
