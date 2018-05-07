public class CountNumbers {
	public final static int DIGIT = 10;

	public static int multiplyOfNumbers(int a) {
		int firstDigit = a % DIGIT;
		a /= DIGIT;
		int secondDigit = a % DIGIT;
		a /= DIGIT;
		int thirdDigit = a % DIGIT;
		a /= DIGIT;
		int fourthDigit = a % DIGIT;
		a /= DIGIT;
		int fifthDigit = a;
		return firstDigit * secondDigit * thirdDigit * fourthDigit * fifthDigit;
	}

	public static int sumOfNumbers(int a) {
		int firstDigit = a % DIGIT;
		a /= DIGIT;
		int secondDigit = a % DIGIT;
		a /= DIGIT;
		int thirdDigit = a % DIGIT;
		a /= DIGIT;
		int fourthDigit = a % DIGIT;
		a /= DIGIT;
		int fifthDigit = a;
		return firstDigit + secondDigit + thirdDigit + fourthDigit + fifthDigit;
	}

}