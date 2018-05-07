public class WeightConverter {
	public final static int GRAMS_PER_KILOGRAM = 1_000;
	public final static double TONES_PER_KILOGRAM = 0.001;
	public final static int MILLIGRAMS_PER_KILOGRAM = 1_000_000;

	public static double convertKilogramToGrams(double weightKg) {
		return weightKg * GRAMS_PER_KILOGRAM;
	}

	public static double convertKilogramToTones(double weightKg) {
		return weightKg * TONES_PER_KILOGRAM;
	}

	public static double convertKilogramToMilligrams(double weightKg) {
		return weightKg * MILLIGRAMS_PER_KILOGRAM;
	}
}