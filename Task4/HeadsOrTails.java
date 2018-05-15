import java.util.Random;

public class HeadsOrTails {

	public static void throwCoin(int count) {
		int head = 0;
		boolean rand;
		Random random = new Random();

		for (int i = 0; i < count; i++) {

			rand = random.nextBoolean();

			if (rand) {
				head++;
			}
		}
		System.out.println("Tails - " + (count - head) + " Heads - " + head);
	}
}
