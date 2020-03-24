package rec;

public class BigO {

	public static void main(String[] args) {
		int a = 20;
		int[] array = new int[a];
		
		System.out.println(countArrayElementsA(array));
		System.out.println(countArrayElementsB(array));
		System.out.println(countArrayElementsC(array));
		
	}

	
	public static int countArrayElementsA(int[] a) {
		return a.length;
	}
	
	public static int countArrayElementsB(int[] a) {
		int count = 0;
		for(int i=0; i<a.length; i++) {
			count++;
		}
		return count;
	}

	public static int countArrayElementsC(int[] a) {
		int count = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<10; j++) {
				count++;
			}
		}
		return count/10;
	}
	
}
