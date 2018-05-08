public class Algorithms {

	private final int DIGIT_COUNT = 10;

	public int findMaxDigit(int number) {
		if (number == 0)
			return 0;
		return Math.max(number % 10, findMaxDigit(number / 10));
	}

	public boolean isPalindrome(int number) {
		return number == Integer.reverse(number);
	}

	public boolean isPrime(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public void findPrimeDivisors(int number) {
		System.out.println("Prime dividers of number " + number + " are: ");
		for (int i = 2; i <= number; i++) {
			while (number % i == 0) {
				number = number / i;
				System.out.print(i + " ");
			}

		}
		System.out.println();
	}

	public int findGCD(int number1, int number2) {
		if (number2 == 0) {
			return Math.abs(number1);
		}
		return findGCD(number2, number1 % number2);

	}

	public int findLCM(int number1, int number2) {
		return number1 * number2 / findGCD(number1, number2);
	}

	public int numDifrentElem(int number) {
		int tempNumber;
		int tempValue;
		int count = 0;
		int divisor = 10;

		for (int i = 0; i < DIGIT_COUNT; i++) {
			tempNumber = number;
			while (tempNumber != 0) {
				tempValue = tempNumber % divisor;
				tempNumber /= divisor;
				if (i == tempValue) {
					count++;
					break;
				}
			}
		}

		return count;
	}
}
