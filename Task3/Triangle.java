public class Triangle {
	private Point a, b, c;

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public boolean isTriangle() {
		double ab = lengthOfTriangleSide(a, b);
		double ac = lengthOfTriangleSide(a, c);
		double cb = lengthOfTriangleSide(c, b);
		if (ab + ac <= cb) {
			return false;
		} else if (ab + cb <= ac) {
			return false;
		} else if (cb + ac <= ab) {
			return false;
		}
		return true;
	}

	public boolean isRightTriangle() {
		double ab = Math.pow(lengthOfTriangleSide(a, b), 2);
		double ac = Math.pow(lengthOfTriangleSide(a, c), 2);
		double cb = Math.pow(lengthOfTriangleSide(c, b), 2);

		if (isTriangle() == false) {
			return false;
		} else if (ab + ac == cb) {
			return true;
		} else if (ab + cb == ac) {
			return true;
		} else if (cb + ac == ab) {
			return true;
		}
		return false;
	}

	private double lengthOfTriangleSide(Point a, Point b) {
		return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
	}
}