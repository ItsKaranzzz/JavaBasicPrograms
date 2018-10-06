package basicsProgramLibrary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DuplicateNumberBetween1toN {
	
	/*You have got a range of numbers between 1 to N, where one of the number is
	repeated. You need to write a program to find out the duplicate number.*/

	static Scanner s;
	public static void main(String[] args) {
		
		int number;
		List<Integer> numberlist=new ArrayList<Integer>();
		
		s=new Scanner(System.in);
		System.out.println("Enter the max limit:");
		number=s.nextInt();
		
		for(int i=0;i<number;i++) {
			System.out.println("Enter elements:");
			s=new Scanner(System.in);
			numberlist.add(s.nextInt());
		}
		
		duplicateFinder(numberlist);
		
		}
	
	public static void duplicateFinder(List<Integer> arr) {
		
		HashSet<Integer> allNumbers=new HashSet<Integer>();
		//int count=0;
		for(int i=0;i<arr.size();i++) {
			
			if(!allNumbers.add(arr.get(i))) {
				//count++;
				System.out.println("Repeated number: "+arr.get(i));
				
			}
		}
		//System.out.println("non repeated number:"+allNumbers);
		//System.out.println("number of Repeated values:"+count);
	}

}
