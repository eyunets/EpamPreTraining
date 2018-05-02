public class Task3 {

	public static void main(String[] args) {
		Task3.isTriangle(4, 4, 4, 2, 5, 3);
		Task3.countDragonHeads(210);
		Task3.isVowel1('w');
		Task3.isVowel2('a');
		Task3.isVowel3('e');
		Task3.moodSensor();
		Task3.nextDay(8, 12, 1994);
	}

	public static void print(Object msg) {
		System.out.println(msg);
	}

	public static void isTriangle(double x1, double x2, double x3, double y1, double y2, double y3) {

		boolean triangle = true;
		boolean rectangular = false;
		double firstSide = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		double secondSide = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double thirdSide = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

		if (firstSide + secondSide <= thirdSide) {
			triangle = false;
		} else if (firstSide + thirdSide <= secondSide) {
			triangle = false;
		} else if (secondSide + thirdSide <= secondSide) {
			triangle = false;
		}

		if (Math.pow(firstSide, 2) + Math.pow(secondSide, 2) == Math.pow(thirdSide, 2)) {
			rectangular = true;
		} else if (Math.pow(firstSide, 2) + Math.pow(thirdSide, 2) == Math.pow(secondSide, 2)) {
			rectangular = true;
		} else if (Math.pow(secondSide, 2) + Math.pow(thirdSide, 2) == Math.pow(secondSide, 2)) {
			rectangular = true;
		}

		System.out.println("Is triangle - " + triangle + " Is rectangular- " + rectangular);
	}

	public static void countDragonHeads(int years) {
		int heads = 0;
		int eyes = 0;
		if (years > 200 && years < 300) {
			heads = ((years - 200) * 2) + (200 * 3);
		} else if (years > 300) {
			heads = years - 300 + (100 * 2) + 200 * 3;
		} else {
			heads = years * 3;
		}
		eyes = heads * 2;
		System.out.println(years + " years Dragon has " + heads + " heads and " + eyes + " eyes.");
	}

	public static void isVowel1(char ch) {
		boolean isVowel = false;
		String character = new String(""+ch);
		switch (character.toLowerCase().charAt(0)) {
		case 'a':
			isVowel = true;
			break;
		case 'e':
			isVowel = true;
			break;
		case 'i':
			isVowel = true;
			break;
		case 'o':
			isVowel = true;
			break;
		case 'u':
			isVowel = true;
			break;
		}
		if (isVowel) {
			System.out.println("Character " + ch + " is vowel");
		} else {
			System.out.println("Character " + ch + " is not vowel");
		}
	}

	static void isVowel2(char ch) {
		String character = new String(""+ch);
		ch = character.toLowerCase().charAt(0);
		boolean isVowel = false;
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			isVowel = true;
		}
		if (isVowel) {
			System.out.println("Character " + ch + " is vowel");
		} else {
			System.out.println("Character " + ch + " is not vowel");
		}

	}

	static void isVowel3(char ch) {
		String character = new String(""+ch);
		ch = character.toLowerCase().charAt(0);
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		boolean isVowel = false;
		for (char v : vowels) {
			if (ch == v) {
				isVowel = true;
			}
		}
		if (isVowel) {
			System.out.println("Character " + ch + " is vowel");
		} else {
			System.out.println("Character " + ch + " is not vowel");
		}

	}

	static void moodSensor() {
		char ch = '\u2639';
		char ch1 = '\u2620';
		char ch2 = '\u263A';
		Task3.print("User's mood is: ");
		int rand = (int) (Math.random() * 3);
		switch (rand) {
		case 0:
			Task3.print(ch);
			break;
		case 1:
			Task3.print(ch1);
			break;
		case 2:
			Task3.print(ch2);
			break;
		}
	}

	public static void nextDay(int day, int month, int year) {

		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day < 30) {
				day += 1;
			} else {
				day = 1;
				month += 1;
			}
		} else if (month == 2) {
			if (year % 4 != 0 & year % 100 != 0 & year % 400 != 0) {
				if (day < 28) {
					day += 1;
				} else {
					day = 1;
					month += 1;
				}
			} else {
				if (day < 29) {
					day += 1;
				} else {
					day = 1;
					month += 1;
				}
			}
		} else if (month == 12) {
			if (day < 31) {
				day += 1;
			} else {
				day = 1;
				month = 1;
				year += 1;
			}
		} else {
			if (day < 31) {
				day += 1;
			} else {
				day = 1;
				month += 1;
			}
		}
		System.out.println("The next day is " + day + "." + month + "." + year);
	}

}