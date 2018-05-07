
public class NumberAscendingChecker {
	private final static int DIGIT = 10;

	public static boolean isAscending(int number) {
		int firstDigit = number % DIGIT;
		number /= DIGIT;
		int secondDigit = number % DIGIT;
		number /= DIGIT;
		int thirdDigit = number % DIGIT;
		number /= DIGIT;
		int fourthDigit = number;
		if (firstDigit < secondDigit) {
			return false;
		} else if (secondDigit < thirdDigit) {
			return false;
		} else if (thirdDigit < fourthDigit) {
			return false;
		}

		return true;
	}

}
