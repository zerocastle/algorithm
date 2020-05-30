package ys.codeTest;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {

		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		System.out.println(new SpiralMatrix().makeSpiral(mat));

	}

	private List<Integer> makeSpiral(int[][] mat) {
		System.out.println("oo");

		List<Integer> result = new ArrayList<Integer>();

		int rowStart = 0;
		int rowEnd = mat.length - 1;
		int colStart = 0;
		int colEnd = mat[0].length - 1;

		while (rowStart <= rowEnd && colStart <= colEnd) {
			// 오른 쪽으로 이동
			for (int i = colStart; i <= colEnd; i++) {
				result.add(mat[rowStart][i]);
			}
			rowStart++;

			// 아래 쪽으로 이동
			for (int i = rowStart; i <= rowEnd; i++) {
				result.add(mat[i][colEnd]);
			}
			colEnd--;

			// 왼쪽으로 이동
			if (rowStart <= rowEnd)
				for (int i = colEnd ; i >= colStart; i--) {
					result.add(mat[rowEnd][i]);
				}
			rowEnd--;

			// 위로이동
			if (colStart <= colEnd)
				for (int i = rowEnd; i >= rowStart; i--) {
					result.add(mat[rowEnd][colStart]);
				}
			colStart++;

		}

		return result;

	}

}
