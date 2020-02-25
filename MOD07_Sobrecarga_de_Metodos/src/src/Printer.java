
public class Printer {

	//main method
	public static void main(String[] args) {
		int[][] matrix = {{1,2},{3,4}};
		Printer.print(matrix);	
		System.out.println("---------");
		Printer.print(matrix[0]);
	}
	
	public static void printArrayOfInts(int[] array) {
		for(int element: array) {
			System.out.print(element + "\t");
		}		
	}

	public static void printMatrixOfInts(int[][] matrix) {
		for(int[] row: matrix) {
			Printer.printArrayOfInts(row);
			System.out.println();
		}		
	}
	
	public static void print(int[] array) {
		for(int element: array) {
			System.out.print(element + "\t");
		}			
	}
	
	public static void print(int[][] matrix) {
		for(int[] row: matrix) {
			Printer.printArrayOfInts(row);
			System.out.println();
		}			
	}
	
	public static void printArrayOfChars(char[] array) {
		for(char element: array) {
			System.out.println(element);
		}		
	}
	
	public static void printArrayOfStrings(String[] array) {
		for(String element: array) {
			System.out.println(element);
		}
	}
	
}
