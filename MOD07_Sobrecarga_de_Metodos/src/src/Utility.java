
public class Utility {

	
	public static void main(String[] args) {
		String o1 = secretMethod("Hola", 1); //o1 = Hola1
		String o2 = secretMethod(1,"Hola");  //o1 = 1Hola		
	}
	
	private static String secretMethod(String s1, int num1) {
		return s1 + num1;		
	}
	
	private static String secretMethod(int num1, String s1) {
		return num1 + s1;
	}
	
	
	private static int add(double num1, double num2) {
		return (int)(num1 + num2);
	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

}
