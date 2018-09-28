package basicsProgramLibrary;
import java.util.ArrayList;
import java.util.Collections;

public class secondHeighest {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 1, 9, 7, 3, 8 };
		int t = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		System.out.println("Second Highest number :" + arr[1]);
//way 2
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for (int j = 0; j < arr.length; j++)
			arr1.add(arr[j]);
		Collections.sort(arr1, Collections.reverseOrder());
		System.out.println("Second Highest number:"+arr1.get(1));
	}
}