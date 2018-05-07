public class RingSquare {
	public static double calculateRingSquare(double r1, double r2) {
		return calculateCircleSquare(r1) - calculateCircleSquare(r2);
	}

	public static double calculateCircleSquare(double radius) {
		return radius * radius * Math.PI;
	}
}