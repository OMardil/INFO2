package act4;

public class Act4 {

	public static void main(String[] args) {

		String[] arr1 = {"Hola", "abeja", "ave", "avenida", "avena", "zoologico" };
		bubbleSort(arr1);
		print(arr1);
		
		
		int[][] a = {{99,7,1},{4,2,5},{9,8,6}};
		sortMatrix(a);
		for(int[] row: a) {
			for(int element: row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		
		
	}


	private static void print(String[] arr1) {
		for(String out: arr1) {
			System.out.println(out);
		}
	}


	public static int[] findElement(int[] array, int key) {
		
		int[] answer;
		int count = 0;
		
		for(int element: array) {
			if (element == key) {
				count++;
			}
		}
		
		answer = new int[count];
		
		
		for(int i = 0, fill = 0; i<array.length; i++) {
			if (array[i] == key) {
				answer[fill++] = i;
			}
		}	
		
		return answer;
		
	}
	
	
	public static void bubbleSort(String[] data) {
		
		if (data == null)
			return;
		
		for(int i = 0; i<data.length-1; i++) {
			for(int j = 0; j<data.length-1-i; j++) {
				compareAndSwap(data, j, j+1);				
			}
		}
		
	}


	private static void compareAndSwap(String[] data, int i, int j) {
		
		int result = data[i].compareTo(data[j]);
		if (result < 0) {
			swap(data, i, j);
		}
		
	}


	private static void swap(String[] data, int i, int j) {
		String temp = data[j];
		data[j] = data[i];
		data[i] = temp;
	}
	
	
	private static void sortMatrix(int[][] array) {
		
		
		int elementCount = array.length * array[0].length;
		
		for(int i = 0; i<elementCount; i++) {
			
			int min = i;
			for(int j = i+1; j<elementCount; j++) {
				if (array[min/array.length][min%array.length] > array[j/array.length][j%array.length])
					swap(array, min, j);
			}
			
		}
		
		
	}


	private static void swap(int[][] array, int a, int b) {

		int temp = array[a/array.length][a % array.length];
		array[a/array.length][a % array.length] = array[b/array.length][b % array.length];		
		array[b/array.length][b % array.length] = temp;
	}
	
	                  

}
