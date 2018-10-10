package basicsProgramLibrary;

public class Exit {

	public static void main(String[] args) {
		System.out.println("Before Exit");
		//exit method returns nothing and is called from Runtime Class and take 
		//status as int
		//non zero status code indicates abnormal termination
		System.exit(1);
		
		System.out.println("After Exit");
	}

}
