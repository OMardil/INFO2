package src;

public class AndroidDemo2 {
	public static void main(String[] args) {
		Android array[] = new Android[10];
		for(int i=0; i<array.length; i++) {
			if (i%2 == 1) {
				array[i] = new Android();
				Android.changeTag(13);
			} else {
				array[i] = new Android("Jack");
			}
				System.out.println(array[i]);
		}
	}
}