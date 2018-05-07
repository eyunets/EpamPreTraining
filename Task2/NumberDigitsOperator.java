public class NumberDigitsOperator {
	public final static int DIGIT = 10;
	public final static int NUMBER_OF_DIGITS = 6;
	public static double calculateArithmeticMean(int number) {
		int firstDigit = number % DIGIT;
		number /= DIGIT;
		int secondDigit = number % DIGIT;
		number /= DIGIT;
		int thirdDigit = number % DIGIT;
		number /= DIGIT;
		int fourthDigit = number % DIGIT;
		number /= DIGIT;
		int fifthDigit = number % DIGIT;
		number /= DIGIT;
		int sixthDigit = number;

		return (firstDigit + secondDigit + thirdDigit + fourthDigit + fifthDigit + sixthDigit) / NUMBER_OF_DIGITS;
	}

	public static double calculateGeometricMean(int number) {
		int firstDigit = number % DIGIT;
		number /= DIGIT;
		int secondDigit = number % DIGIT;
		number /= DIGIT;
		int thirdDigit = number % DIGIT;
		number /= DIGIT;
		int fourthDigit = number % DIGIT;
		number /= DIGIT;
		int fifthDigit = number % DIGIT;
		number /= DIGIT;
		int sixthDigit = number;

		return Math.pow(firstDigit * secondDigit * thirdDigit * fourthDigit * fifthDigit * sixthDigit,
				1.0 / NUMBER_OF_DIGITS);
	}
}