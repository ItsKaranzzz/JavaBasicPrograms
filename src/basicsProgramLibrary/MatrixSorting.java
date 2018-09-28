package basicsProgramLibrary;
import java.util.ArrayList;
import java.util.Collections;

public class MatrixSorting {

	public static void main(String[] args) {

		int mat[][] = { { 3, 4, 5 }, { 2, 7, 9 }, { 1, 6, 11 } };

		System.out.println(mat.length);
		ArrayList<Integer> sortIt = new ArrayList<Integer>();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				sortIt.add(mat[i][j]);
			}
		}

		Collections.sort(sortIt);

		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {

				mat[i][j] = sortIt.get(count);
				System.out.print(mat[i][j] + "\t");
				count++;
			}
			System.out.println();
		}

	}
}
