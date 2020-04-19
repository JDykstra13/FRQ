
public class RandomLetterChooser extends RandomStringChooser{

	public RandomLetterChooser(String str) {
		super(getSingleLetters(str));
	}
	
	public static String[] getSingleLetters(String str) {
		String[] arr = new String[str.length()];
		for(int i = 0; i<str.length(); i++) {
			arr[i] = "" + str.charAt(i);
		}
		return arr;
	}
}