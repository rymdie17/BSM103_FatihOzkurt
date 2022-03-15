import java.util.Arrays;

public class matrixAddExp {
	
	public static void main(String[] args) {
		int[][] A = {{1,2}, {3,4}};
		int[][] B = {{4,5}, {6,7}};
		int[][] C = matrixAdd(A, B);
		System.out.println(Arrays.toString(C[0]) + "\n" + Arrays.toString(C[1]));
	}

	public static int[][] matrixAdd(int[][] A, int[][] B) {

		int rows = A.length;
		int cols = 0;
		if (rows > 0) {
			cols = A[0].length;
		}
		int[][] C = new int[rows][cols];

		for (int satir = 0; satir < rows; satir++) {
			for (int sutun = 0; sutun < cols; sutun++) {
				C[satir][sutun] = A[satir][sutun] + B[satir][sutun];
			}
		}
	
		return C;
	}
}
