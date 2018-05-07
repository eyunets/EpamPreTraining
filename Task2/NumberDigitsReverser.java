
public class NumberDigitsReverser {
	public final static int DIGIT = 10;

	public static int reverseNumber(int number) {

		int digit = number % DIGIT;
		number /= DIGIT;
		int result = digit;

		digit = number % DIGIT;
		number /= DIGIT;
		result = result * DIGIT + digit;

		digit = number % DIGIT;
		number /= DIGIT;
		result = result * DIGIT + digit;

		digit = number % DIGIT;
		number /= DIGIT;
		result = result * DIGIT + digit;

		digit = number % DIGIT;
		number /= DIGIT;
		result = result * DIGIT + digit;

		digit = number % DIGIT;
		number /= DIGIT;
		result = result * DIGIT + digit;

		digit = number % DIGIT;
		number /= DIGIT;
		result = result * DIGIT + digit;

		return result;
	}

}
