import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingMatrix {

	public static void main(String[] args) {

		int mat[][] = { { 4, 5, 6 }, { 3, 7, 9 }, { 9, 2, 1 } };

		sortMatrix(mat);
	}

	public static void sortMatrix(int[][] mat) {
		List<Integer> matElements = new ArrayList<Integer>();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				matElements.add(mat[i][j]);
			}
		}
		Collections.sort(matElements);
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = matElements.get(count);
				System.out.print(mat[i][j]);
				count++;
			}
			System.out.println();
		}

	}

}
