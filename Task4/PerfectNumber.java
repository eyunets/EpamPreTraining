public class PerfectNumber {

	public static boolean isPerfectNumber(int number) {

		int sum = 1;
		
		if (number != 0) {
			for (int i = 2; i <= number/2; i++) {
				if (number % i == 0) {
					sum = sum + i;
				}
			}
		}
		return sum == number;
	}
}
