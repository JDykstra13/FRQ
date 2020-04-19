
public class Runner {

	public static void main(String[] args) {
		String[] wordArray = {"wheels", "on", "the", "bus"};
		RandomStringChooser sChooser = new RandomStringChooser(wordArray);
		//System.out.print(sChooser.getNext());
		for(int k = 0; k < 6; k++) {
			System.out.print(sChooser.getNext() + " ");
		}
		
		System.out.println();
		RandomLetterChooser lc = new RandomLetterChooser("cat");
		for(int k =0; k<4; k++) {
			System.out.print(lc.getNext());
		}
		
		System.out.println();
	}
}
