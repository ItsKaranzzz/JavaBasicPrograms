package basicsProgramLibrary;

public class VariableTypes {
	// Here name is a Instance variable
		public String name = "Karan";

		// here sirname is a Class variable
		public static String sirname = "Chaudhary";

		public static void main(String[] args) {

			// here Address is local variable
			String Address = "RR Nagar";
			
			//Calling Instance variable using object of class
			System.out.println(new VariableTypes().name);
			
			// Calling class variable directly or using class name.
			System.out.println(sirname);
			
			// Calling of local variable in scope of local boundaries
			System.out.println(Address);
		}
}
