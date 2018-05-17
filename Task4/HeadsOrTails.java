import java.util.Random;

public class HeadsOrTails {

	public static String throwCoin(int count) {
		int head = 0;
		Random random = new Random();
		for (int i = 0; i < count; i++) {
			if (random.nextBoolean()) {
				head++;
			}
		}
		return new String("Tails - " + (count - head) + " Heads - " + head);
	}
}
