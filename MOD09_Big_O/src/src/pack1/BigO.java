package pack1;

public class BigO {

	public static void main(String[] args) {

	}

	public static void fillArray(int n) {
		int[] array = new int[n];
		System.out.println("Begin");
		for(int i=0; i<n; i++) {
			array[i] = i;
		}
		System.out.println("End");
	}
	
	public static void fillMatrix(int n) {
		int[][] matrix = new int[n][n];
		for(int r=0; r<n; r++) {
			for(int c=0; c<n; c++) {
				matrix[r][c] = r*n + c;
			}
		}
	}		
}
