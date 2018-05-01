package Task2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Task2.kgToOthers();
		Task2.ringSquare();
		Task2.swapVar();
		Task2.isNumberAscending();
		Task2.multAndSumOfNumber();
		Task2.averageSumAndMult();
		Task2.reverseNumber();
	}

	public static void kgToOthers() {
		int kg = 0;
		long mg = 0;
		int gr = 0;
		int ton = 0;

		System.out.print("Enter dinosaur weight : ");
		Scanner scanner = new Scanner(System.in);
		kg = scanner.nextInt();

		gr = kg * 1000;
		mg = gr * 1000;
		ton = kg / 1000;
		System.out.printf("miligram %d\ngram %d\nton %d\n", mg, gr, ton);
	}

	public static void ringSquare() {
		double r1 = 0;
		double r2 = 0;
		double squareOfR1 = 0;
		double squareOfR2 = 0;
		double result = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter radius of 1 circle ");
		r1 = scanner.nextDouble();
		System.out.print("Enter radius of 2 circle ");
		r2 = scanner.nextDouble();

		squareOfR1 = Math.PI * Math.pow(r1, 2);
		squareOfR2 = Math.PI * Math.pow(r2, 2);

		result = squareOfR1 - squareOfR2;

		System.out.printf("Square of ring is : %.2f \n", result);
	}

	public static void swapVar() {
		int a = 5;
		int b = 11;
		System.out.println("a = " + a + ", b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a + ", b = " + b);
	}

	public static void isNumberAscending() {
		int number = 7894;
		boolean result = false;
		int thousands = number / 1000;
		int hundreds = (number / 100) % 10;
		int dozens = (number / 10) % 10;
		int units = number % 10;
		System.out.println("Is number ascending? " + thousands + " " + hundreds + " " + dozens + " " + units);
		if (thousands < hundreds) {
			if (hundreds < dozens) {
				if (dozens < units) {
					result = true;
					System.out.println(result);
				} else {
					System.out.println(result);
				}
			} else {
				System.out.println(result);
			}
		} else {
			System.out.println(result);
		}
	}

	public static void multAndSumOfNumber() {
		int number = 54321;
		int fifthNumber = number / 10000;
		int fourthNumber = (number / 1000) % 10;
		int thirdNumber = (number / 100) % 10;
		int secondNumber = (number / 10) % 10;
		int firstNumber = number % 10;
		long mult = fifthNumber * fourthNumber * thirdNumber * secondNumber * firstNumber;
		int sum = fifthNumber + fourthNumber + thirdNumber + secondNumber + firstNumber;
		System.out.println("Mult = " + mult + " Sum = " + sum);
	}

	public static void averageSumAndMult() {
		int number = 654321;
		int sixthNumber = number / 100000;
		int fifthNumber = (number / 10000) % 10;
		int fourthNumber = (number / 1000) % 10;
		int thirdNumber = (number / 100) % 10;
		int secondNumber = (number / 10) % 10;
		int firstNumber = number % 10;
		double sum = (sixthNumber + fifthNumber + fourthNumber + thirdNumber + secondNumber + firstNumber) / 6;
		double mult = (sixthNumber * fifthNumber * fourthNumber * thirdNumber * secondNumber * firstNumber);
		mult = Math.pow(mult, 1.0 / 6.0);
		System.out.println("Average arithmetic of " + number + " = " + sum);
		System.out.println("Average geometric of " + number + " = " + mult);

	}

	public static void reverseNumber() {
		int number = 7654321;
		int seventhNumber = number / 1000000;
		int sixthNumber = (number / 100000) % 10;
		int fifthNumber = (number / 10000) % 10;
		int fourthNumber = (number / 1000) % 10;
		int thirdNumber = (number / 100) % 10;
		int secondNumber = (number / 10) % 10;
		int firstNumber = number % 10;
		int reversNum = seventhNumber + sixthNumber * 10 + fifthNumber * 100 + fourthNumber * 1000 + thirdNumber * 10000
				+ secondNumber * 100000 + firstNumber * 1000000;
		System.out.println("Reverse of number " + number + " = " + reversNum);
	}

}