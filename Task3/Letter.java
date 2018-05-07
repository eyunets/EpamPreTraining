
public class Letter {
	public boolean isVowel1(char ch) {
		switch (Character.toLowerCase(ch)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		}
		return false;
	}

	public boolean isVowel2(char ch) {
		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;

	}

	public boolean isVowel3(char ch) {
		ch = Character.toLowerCase(ch);
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (char v : vowels) {
			if (ch == v) {
				return true;
			}
		}
		return false;

	}

	public boolean isVowel4(char ch) {
		String s = (ch + "").toLowerCase();
		if (s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u")) {
			return true;
		}
		return false;
	}
}