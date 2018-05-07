public class Dragon {

	public static final int AGE_PERIOD_FIRST = 200;
	public static final int AGE_PERIOD_SECOND = 300;
	public static final int HEADS_PERIOD_FIRST = 3;
	public static final int HEADS_PERIOD_SECOND = 2;
	public static final int HEADS_ON_BIRTH = 3;
	public int years;

	public Dragon(int years) {
		this.years = years;
	}

	public int countDragonHeads() {
		int heads = HEADS_ON_BIRTH;
		if (years < 0) {
			System.out.println("Dragon is still in planning stadio");
		} else if (years < AGE_PERIOD_FIRST) {
			heads = heads + years * HEADS_PERIOD_FIRST;
		} else if (years < AGE_PERIOD_SECOND) {
			heads = heads + HEADS_PERIOD_FIRST * AGE_PERIOD_FIRST + HEADS_PERIOD_SECOND * (years - AGE_PERIOD_FIRST);
		} else {
			heads = heads + HEADS_PERIOD_FIRST * AGE_PERIOD_FIRST
					+ HEADS_PERIOD_SECOND * (AGE_PERIOD_SECOND - AGE_PERIOD_FIRST) + (years - AGE_PERIOD_FIRST);
		}
		return heads;
	}

	public int countDragonEyes() {
		return countDragonHeads() * 2;
	}
}