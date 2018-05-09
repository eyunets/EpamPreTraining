public class ArrayOperator {

	public static double findMin(double array[]) {
		double minElement = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] < minElement) {
				minElement = array[i];
			}
		}
		return minElement;
	}

	public static double findMax(double array[]) {
		{
			double maxElement = array[0];
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > maxElement) {
					maxElement = array[i];
				}
			}
			return maxElement;
		}
	}

	public static double findArithmeticMean(double array[]) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum / array.length;
	}

	public static double findGeometricMean(double array[]) {
		double multiply = 0;
		for (int i = 0; i < array.length; i++) {
			multiply = multiply * array[i];
		}
		return Math.pow(multiply, 1.0 / array.length);
	}

	public static boolean isSorted(double array[]) {
		boolean check = true;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				check = false;
				break;
			}
		}
		if (check == true) {
			return true;
		} else {
			check = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] < array[i + 1]) {
					check = false;
					break;
				}
			}
		}
		return check;
	}

	public static double findFirstLocalMin(double[] array) {

		for (int i = 1; i < array.length - 1; i++) {
			if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
				return array[i];
			}
		}
		return -1;
	}

	public static double findFirstLocalMax(double[] array) {

		for (int i = 1; i < array.length - 1; i++) {
			if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
				return array[i];
			}
		}
		return -1;
	}

	public static double[] reverseArray(double[] array) {

		for (int i = 0; i < array.length / 2; i++) {
			double tmp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = tmp;
		}
		return array;
	}

	/*
	 * Индивидуальное задание: 15)В одномерном массиве, состоящем из n вещественных
	 * элементов, вычислить: количество элементов массива, равных 0 и сумму
	 * элементов массива, распо- ложенных после минимального элемента.
	 */
	public static int findCountOfElementsEqualsToZero(double array[]) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				count++;
			}
		}
		return count;
	}

	public static double findSumOfElementsAfterMin(double array[]) {
		double minElement = array[0];
		int indexOfMinElement = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minElement) {
				minElement = array[i];
				indexOfMinElement = i;
			}
		}
		double sum = 0;
		for (int i = indexOfMinElement; i < array.length - 1; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

}
