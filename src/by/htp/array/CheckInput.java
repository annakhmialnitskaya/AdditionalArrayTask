package by.htp.array;

public class CheckInput {
	public static boolean check(String s) {
		boolean result = true;
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException nfe) {
			result = false;
		}
		return result;
	}
}
