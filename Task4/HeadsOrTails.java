import java.util.Random;

public class HeadsOrTails {
	private final int HEAD = 0;
	private final int TAIL = 1;
	private final int POSSIBILITY_COUNT = 2;

	public void throwCoin(int count) {
		int tail = 0;
		int head = 0;
		int rand;
		Random random = new Random();

		for (int i = 0; i < count; i++) {

			rand = random.nextInt(POSSIBILITY_COUNT);

			if (rand == HEAD) {
				head++;
			} else if (rand == TAIL) {
				tail++;
			}
		}
		System.out.println("Tails - " + tail + " Heads - " + head);
	}
}
