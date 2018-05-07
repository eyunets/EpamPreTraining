import java.util.Random;

public class Mood {
	public String showUserMood() {
		int MOOD_QUANTITY = 3;
		String mood = ":(";

		Random rand = new Random();
		int randomNum = rand.nextInt(MOOD_QUANTITY);

		switch (randomNum) {
		case 0:
			mood = ":)";
			break;
		case 1:
			mood = ":|";
			break;
		}

		return mood;
	}
}
