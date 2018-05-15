
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

	public static double findFirstLocalMin(double[][] array) {
		return -1;
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

	private static boolean isLocalMin(double[][] array, int x, int y) {
		if (x != 0 && y != 0 && x != array.length - 1 && y != array[0].length - 1) {
			return array[x][y] < array[x - 1][y] && array[x][y] < array[x + 1][y] && array[x][y] < array[x][y - 1]
					&& array[x][y] < array[x][y + 1];
		}
		return false;
	}

	private static boolean isLocalMax(double[][] array, int x, int y) {
		if (x != 0 && y != 0 && x != array.length - 1 && y != array[0].length - 1) {
			return array[x][y] > array[x - 1][y] && array[x][y] > array[x + 1][y] && array[x][y] > array[x][y - 1]
					&& array[x][y] > array[x][y + 1];
		}
		return false;
	}

	public static int[] findLocalMax(double[][] array) {
		int[] index = { -1, -1 };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (isLocalMax(array, i, j)) {
					index[0] = i;
					index[1] = j;
					return index;
				}
			}
		}
		return index;
	}

	public static int[] findLocalmin(double[][] array) {
		int[] index = { -1, -1 };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (isLocalMin(array, i, j)) {
					index[0] = i;
					index[1] = j;
					return index;
				}
			}
		}
		return index;
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

	public static double findArraySum(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + Math.abs(array[i]);
		}
		return sum;
	}
}
