package Task1;

public class Task1 {
	public static void main(String[] args) {
		Task1.TestByte();
	}

	public static void TestInt() {
		int a = 100;
		int b = 20;
		int result = 0;

		// addition
		result = a + b;
		System.out.printf("%d + %d = %d\n", a, b, result);

		// multiplication
		result = a * b; // int overflow
		System.out.printf("%d * %d = %d\n", a, b, result);

		// division
		result = b / a;
		System.out.printf("%d / %d = %d\n", b, a, result);

		// binary XOR
		result = a ^ b;
		System.out.printf("%d ^ %d = %d\n", a, b, result);
		System.out.print("In binary form: ");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(result));

		// binary OR
		result = a | b;
		System.out.printf("%d | %d = %d\n", a, b, result);
		System.out.print("In binary form: ");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(result));

		// binary AND
		result = a & b;
		System.out.printf("%d & %d = %d\n", a, b, result);
		System.out.print("In binary form: ");
		System.out.printf(" %s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(result));

		// binary NOT
		result = ~b;
		System.out.printf("%d = ~%d\n", b, result);
		System.out.print("In binary form: ");
		System.out.printf("%s = ~%s\n", Integer.toBinaryString(b), Integer.toBinaryString(result));

		// right shift
		result = a >> 2;
		System.out.printf("%d >> 2 = %d\n", a, result);
		System.out.print("In binary form: ");
		System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(result));

		// left shift
		result = a << 2;
		System.out.printf("%d<< 2 = %d\n", a, result);
		System.out.print("In binary form: ");
		System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(result));

		// right shift zero fill
		result = a >>> 3;
		System.out.printf("%d >>> 3 = %d\n", a, result);
		System.out.print("In binary form: ");
		System.out.printf(" %s >> 3 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(result));

	}

	public static void TestBoolean() {
		boolean a = true;
		boolean b = false;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// logical OR
		System.out.println("a | b = " + (a | b));

		// logical short OR
		System.out.println("a || b = " + (a || b));

		// logical XOR
		System.out.println("a ^ b = " + (a ^ b));
		System.out.println("a ^ a = " + (a ^ a));

		// logical AND
		System.out.println("a & b = " + (a & b));

		// logical short AND
		System.out.println("a && b = " + (a && b));

		// assignment
		System.out.println("a = b = " + (a = b));

		// logical not
		System.out.println("!b = " + (!b));
	}

	public static void TestByte() {
		byte a = 100;
		byte b = 20;
		byte result = 0;

		// addition
		result = (byte) (a + b);
		System.out.printf("%d + %d = %d\n", a, b, result);

		// multiplication
		result = (byte) (a * b); // byte overflow
		System.out.printf("%d * %d = %d\n", a, b, result);

		// division
		result = (byte) (b / a);
		System.out.printf("%d / %d = %d\n", b, a, result);

		// binary XOR
		result = (byte) (a ^ b);
		System.out.printf("%d ^ %d = %d\n", a, b, result);
		System.out.print("In binary form: ");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(result));

		// binary OR
		result = (byte) (a | b);
		System.out.printf("%d | %d = %d\n", a, b, result);
		System.out.print("In binary form: ");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(result));

		// binary AND
		result = (byte) (a & b);
		System.out.printf("%d & %d = %d\n", a, b, result);
		System.out.print("In binary form: ");
		System.out.printf(" %s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(result));

		// binary NOT
		result = (byte) ~b;
		System.out.printf("%d = ~%d\n", b, result);
		System.out.print("In binary form: ");
		System.out.printf("%s = ~%s\n", Integer.toBinaryString(b), Integer.toBinaryString(result));

		// right shift
		result = (byte) (a >> 2);
		System.out.printf("%d >> 2 = %d\n", a, result);
		System.out.print("In binary form: ");
		System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(result));

		// left shift
		result = (byte) (a << 2);
		System.out.printf("%d<< 2 = %d\n", a, result);
		System.out.print("In binary form: ");
		System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(result));

		// right shift zero fill
		result = (byte) (a >>> 3);
		System.out.printf("%d >>> 3 = %d\n", a, result);
		System.out.print("In binary form: ");
		System.out.printf(" %s >> 3 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(result));

	}

	public static void TestChar() {
		char a = '1';
		char b = '2';
		char result = '0';

		// addition
		result = (char) (a + b);
		System.out.printf("%c + %c = %c\n", a, b, result);

		// multiplication
		result = (char) (a * b);
		System.out.printf("%c * %c = %c\n", a, b, result);

		// division
		result = (char) (b / a);
		System.out.printf("%c / %c = %c\n", b, a, result);

		// binary XOR
		result = (char) (a ^ b);
		System.out.printf("%c ^ %c = %c\n", a, b, result);
		System.out.print("In binary form: ");
		System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(result));

		// binary OR
		result = (char) (a | b);
		System.out.printf("%c | %c = %c\n", a, b, result);
		System.out.print("In binary form: ");
		System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(result));

		// binary AND
		result = (char) (a & b);
		System.out.printf("%c & %c = %c\n", a, b, result);
		System.out.print("In binary form: ");
		System.out.printf(" %s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b),
				Integer.toBinaryString(result));

		// binary NOT
		result = (char) ~b;
		System.out.printf("%c = ~%c\n", b, result);
		System.out.print("In binary form: ");
		System.out.printf("%s = ~%s\n", Integer.toBinaryString(b), Integer.toBinaryString(result));

		// right shift
		result = (char) (a >> 2);
		System.out.printf("%c >> 2 = %c\n", a, result);
		System.out.print("In binary form: ");
		System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(result));

		// left shift
		result = (char) (a << 2);
		System.out.printf("%c<< 2 = %c\n", a, result);
		System.out.print("In binary form: ");
		System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(result));

		// right shift zero fill
		result = (char) (a >>> 3);
		System.out.printf("%c >>> 3 = %c\n", a, result);
		System.out.print("In binary form: ");
		System.out.printf(" %s >> 3 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(result));

	}

}
