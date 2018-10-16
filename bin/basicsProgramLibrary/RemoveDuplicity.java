import java.util.HashSet;

public class RemoveDuplicity {

	public static void main(String[] args) {

		
		//Using traditional way
		String arr[] = { "Karan", "Rohit", "Raj", "Raveena", "Ranbir", "Tazz", "Karan" };
		String duplicate="";
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j]))
					duplicate = arr[i];
			}
		}
		System.out.println(duplicate);

		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//using HashSet 
		HashSet<String> remDup=new HashSet<String>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(remDup.add(arr[i])==false)
				System.out.println(arr[i]);
			
			
		}
	
	}
	
	
	

}
