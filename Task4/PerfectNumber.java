public class PerfectNumber {

	public boolean perfectNumber(int number) {

		int sum = 0;

		if (number != 0) {
			for (int i = 1; i < number; i++) {
				if (number % i == 0) {
					sum = sum + i;
				}
			}
		}
		return sum == number;
	}
}
