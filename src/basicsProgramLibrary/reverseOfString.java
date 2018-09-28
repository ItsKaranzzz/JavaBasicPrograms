package basicsProgramLibrary;

public class reverseOfString {

	public static void main(String[] args) {

		String input = "Hello India How Are You";
		String output = "";
// way 1

		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);

		}

		System.out.println(output);

// way 2
//this will work even with spaces
		StringBuffer s = new StringBuffer(input);
		System.out.println(s.reverse());
		
		
//way 3
//asked in interview
		String output2="";

		String splitted[]=input.split(" ");
		for(int i=0;i<splitted.length;i++) {
			s=new StringBuffer(splitted[i]);
			output2=output2+" "+s.reverse();
		}
		
		System.out.println(output2.trim());
	}
}
