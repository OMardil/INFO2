package rec;

public class Fibonacci {

	public static void main(String[] args) {

		for(int i=0; i<20; i++) {
			int out1 = fibonacciIterative(i);
			System.out.println(out1);
		}
	}

	public static int fibonacciRecursive(int n) {

		if (n <= 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}

		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}

	public static int fibonacciIterative(int n) {

		int[] calc = {0,0};

		if (n <= 0) {
			calc[0] = 0;
			calc[1] = 0;
		} else if (n >= 1) {
			calc[0] = 0;
			calc[1] = 1;
		}

		for (int i=2; i<=n; i++) {
			int newNumber = calc[0] + calc[1];
			calc[0] = calc[1];
			calc[1] = newNumber;
		}

		return calc[1];
	}
}