import java.util.Random;

public class HeadsOrTails {
	private final static boolean HEAD = true;
	private final static boolean TAIL = false;

	public static void throwCoin(int count) {
		int tail = 0;
		int head = 0;
		boolean rand;
		Random random = new Random();

		for (int i = 0; i < count; i++) {

			rand = random.nextBoolean();

			if (rand == HEAD) {
				head++;
			} else if (rand == TAIL) {
				tail++;
			}
		}
		System.out.println("Tails - " + tail + " Heads - " + head);
	}
}

