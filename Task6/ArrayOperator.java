
public class ArrayOperator {
	public static double findMax(double[][] array) {
		double max = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
		}
		return max;
	}

	public static double findMin(double[][] array) {
		double min = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < min) {
					min = array[i][j];
				}
			}
		}
		return min;
	}

	public static double findArithmeticMean(double[][] array) {
		double sum = 0;
		double size = array.length * array[0].length;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum = sum + array[i][j];
			}
		}
		return sum / size;
	}

	public static double findGeometricMean(double[][] array) {
		double multiply = 1;
		double size = array.length * array[0].length;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				multiply = multiply * array[i][j];
			}
		}
		return Math.pow(multiply, 1.0 / size);
	}

	public static int[] findFirstLocalMin(double[][] array) {

		int[] index = new int[] { -1, -1 };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == 0) {
					if (j == 0) {
						if ((array[i][j] < array[i][j + 1]) && (array[i][j] < array[i + 1][j])) {
							index[0] = i;
							index[1] = j;
							return index;
						}
					} else if (j == (array[i].length - 1)) {
						if ((array[i][j] < array[i][j - 1]) && (array[i][j] < array[i + 1][j])) {
							index[0] = i;
							index[1] = j;
							return index;
						}
					} else if ((array[i][j] < array[i][j + 1]) && (array[i][j] < array[i][j - 1])
							&& (array[i][j] < array[i + 1][j])) {
						index[0] = i;
						index[1] = j;
						return index;
					}
				} else if (i == (array.length - 1)) {
					if (j == 0) {
						if ((array[i][j] < array[i][j + 1]) && (array[i][j] < array[i - 1][j])) {
							index[0] = i;
							index[1] = j;
							return index;
						}
					} else if (j == (array[i].length - 1)) {
						if ((array[i][j] < array[i][j - 1]) && (array[i][j] < array[i - 1][j])) {
							index[0] = i;
							index[1] = j;
							return index;
						}
					} else if ((array[i][j] < array[i][j + 1]) && (array[i][j] < array[i][j - 1])
							&& (array[i][j] < array[i - 1][j])) {
						index[0] = i;
						index[1] = j;
						return index;
					}

				} else if ((array[i][j] < array[i][j + 1]) && (array[i][j] < array[i][j - 1])
						&& (array[i][j] < array[i + 1][j]) && (array[i][j] < array[i - 1][j])) {
					index[0] = i;
					index[1] = j;
					return index;
				}
			}
		}
		return index;
	}

	public static int[] findFirstLocalMax(double[][] array) {

		int[] index = { -1, -1 };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == 0) {
					if (j == 0) {
						if ((array[i][j] > array[i][j + 1]) && (array[i][j] > array[i + 1][j])) {
							index[0] = i;
							index[1] = j;
							return index;
						}
					} else if (j == (array[i].length - 1)) {
						if ((array[i][j] > array[i][j - 1]) && (array[i][j] > array[i + 1][j])) {
							index[0] = i;
							index[1] = j;
							return index;
						}
					} else if ((array[i][j] > array[i][j + 1]) && (array[i][j] > array[i][j - 1])
							&& (array[i][j] > array[i + 1][j])) {
						index[0] = i;
						index[1] = j;
						return index;

					}
				} else if (i == (array.length - 1)) {
					if (j == 0) {
						if ((array[i][j] > array[i][j + 1]) && (array[i][j] > array[i - 1][j])) {
							index[0] = i;
							index[1] = j;
							return index;
						}
					} else if (j == (array[i].length - 1)) {
						if ((array[i][j] > array[i][j - 1]) && (array[i][j] > array[i - 1][j])) {
							index[0] = i;
							index[1] = j;
							return index;
						}
					} else if ((array[i][j] > array[i][j + 1]) && (array[i][j] > array[i][j - 1])
							&& (array[i][j] > array[i - 1][j])) {
						index[0] = i;
						index[1] = j;
						return index;
					}

				} else if ((array[i][j] > array[i][j + 1]) && (array[i][j] > array[i][j - 1])
						&& (array[i][j] > array[i + 1][j]) && (array[i][j] > array[i - 1][j])) {
					index[0] = i;
					index[1] = j;
					return index;
				}
			}
		}

		return index;
	}

	public static double[][] transposeMatrix(double[][] array) {
		if (array.length == array[0].length) {
			double temp = 0;
			for (int i = 0; i < array.length; i++)
				for (int j = i; j < array[0].length; j++) {
					temp = array[i][j];
					array[i][j] = array[j][i];
					array[j][i] = temp;
				}
		}
		return array;
	}

	/*
	 * Индивидуальное задание 15)Среди строк заданной матрицы, содержащих только
	 * чётные элементы, найти строку с максимальной суммой модулей элементов.
	 */
	public static int findMaxLine(double[][] array) {
		int index = 0;
		double tempSum = 0;
		double maxSum = findArraySum(array[0]);
		for (int i = 1; i < array.length; i++) {
			tempSum = findArraySum(array[i]);
			if (tempSum > maxSum) {
				maxSum = tempSum;
				index = i;
			}
		}
		return index;
	}

	private static double findArraySum(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + Math.abs(array[i]);
		}
		return sum;
	}
}
