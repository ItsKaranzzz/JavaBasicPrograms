package basicsProgramLibrary;

public class test {

	public static void main(String[] args) {
		String k="data[0]";
		
		String arr1=k.split("\\[")[0];
		Object test=Integer.parseInt(k.split("\\[")[1].replace("]", ""));
		System.out.println(arr1);
		System.out.println(test);
		
		

	}

}
