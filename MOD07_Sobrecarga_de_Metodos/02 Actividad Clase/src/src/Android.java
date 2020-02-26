package src;

import java.util.ArrayList;
import java.util.List;

public class Android {

	private String name;
	private static int tag;
	private static List<Integer> primeNumbers = new ArrayList<>();

	public Android() {
		Android.tag = (Android.tag == 0) ? 1 : Android.tag;
		this.name = "Bob" + Android.tag;
		Android.changeTag();
	}

	public Android(String name) {
		Android.tag = (Android.tag == 0) ? 1 : Android.tag;
		this.name = name + Android.tag;
		Android.changeTag();		
	}

	private static void changeTag() {

		int i = Android.tag + 1;

		while (!isPrime(i)) {
			i++;
		}

		Android.tag = i;
	}
	
	public static void changeTag(int primeNumber) {
		if (isPrime(primeNumber)) {
			if (Android.tag < primeNumber) {
				Android.tag = primeNumber;
			}
		}
	}

	private static boolean isPrime(int number) {

		int lastPrime = 1;

		// Since isPrime() will be called with increasing numbers, we can store all
		// prime
		// numbers found to this point and avoid rechecking every number.
		for (Integer i : primeNumbers) {
			// if target number is found in primeNumbers list, then return true
			if (i == number) {
				return true;
				// otherwise, check if number is divisible by any primeNumbers element. If it
				// is,
				// this number is not a prime number
			} else if (i < number && number % i == 0) {
				return false;
			}
			lastPrime = i;
		}

		// check from last element of primeNumbers+1 up to number. If number is
		// divisible by j, then
		// it is not prime
		int j = 0;
		for (j = lastPrime + 1; j < number; j++) {
			if (number % j == 0) {
				return false;
			}
		}

		// if no numbers were found, this means we found a new prime number! Add it to
		// the list.
		primeNumbers.add(j);
		return true;
	}

	public String toString() {
		return this.name;
	}

}
