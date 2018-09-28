package basicsProgramLibrary;
import java.util.HashSet;

public class DuplicateRemoval {

	public static void main(String[] args) {
		String input="ababbabccde";
		String output="";
		char arr[]=input.toCharArray();
	
	
		HashSet<Character> test=new HashSet<Character>();
		for(int i=0;i<arr.length;i++)
		test.add(arr[i]);
		
		for(char a:test) {
			output=output+a;
		}
		
		System.out.println(output);
	}
}
