public class Algorithms {

	private static final int DIGIT_COUNT = 10;
	private static final int DIVISOR = 10;

	public static int findMaxDigit(int number) {
		if (number == 0)
			return 0;
		return Math.max(number % 10, findMaxDigit(number / 10));
	}

	public static boolean isPalindrome(int number) {
		return number == Integer.reverse(number);
	}

	public static boolean isPrime(int number) {
		int iterationCount = number / 2;
		for (int i = 2; i < iterationCount; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static String findPrimeDIVISORs(int number) {
		StringBuilder stringBuilder = new StringBuilder("Prime dividers of number " + number + " are: ");
		for (int i = 2; i <= number; i++) {
			while (number % i == 0) {
				number = number / i;
				stringBuilder.append(i + " ");
			}
		}
		return stringBuilder.toString();
	}

	public static int findGCD(int number1, int number2) {
		if (number2 == 0) {
			return Math.abs(number1);
		}
		return findGCD(number2, number1 % number2);

	}

	public static int findLCM(int number1, int number2) {
		return number1 * number2 / findGCD(number1, number2);
	}

	public static int numDifrentElem(int number) {
		int tempNumber;
		int tempValue;
		int count = 0;

		for (int i = 0; i < DIGIT_COUNT; i++) {
			tempNumber = number;
			while (tempNumber != 0) {
				tempValue = tempNumber % DIVISOR;
				tempNumber /= DIVISOR;
				if (i == tempValue) {
					count++;
					break;
				}
			}
		}
		return count;
	}
}
