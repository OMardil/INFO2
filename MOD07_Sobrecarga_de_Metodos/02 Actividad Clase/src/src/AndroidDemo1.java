package src;

public class AndroidDemo1 {
	public static void main(String[] args) {
		Android array[] = new Android[10];
		for(int i=0; i<array.length; i++) {
			array[i] = new Android();
			System.out.println(array[i]);
		}
	}
}
