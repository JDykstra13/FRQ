import java.util.ArrayList;

public class RandomStringChooser {
	
	private String[] a;
	private int cur;
	
	public RandomStringChooser(String[] arr) {
		cur = 0;
		a = arr;
		shuffle();
	}
	
	public String getNext(){
		if(cur >= a.length) {
			return "NULL";
		}
		else {
			return a[cur++];
		}
	}
	private void shuffle() {
		String temp;
		int rand;
		
		for(int i = 0; i<a.length; i++) {
			// swap the string at index i with an element at a random index
			rand = (int)(Math.random() * a.length);
			temp = a[i];
			a[i] = a[rand];
			a[rand] = temp;
		}
	}
	/*
	private String[] wordArray;
	private boolean[] place;
	private int index;
	
	// constructor
	RandomStringChooser(String[] arr){
		wordArray = arr;
		place = new boolean[wordArray.length - 1];
	}
	
	public String getNext() {
		String ret = "";
		
		index = (int)(Math.random()*(wordArray.length - 1));
		if(!place[index]) {
			ret = wordArray[index];
			place[index] = true;
		}
		else {
			return "null";
		}
			
		return ret;
	}
	*/
	
}
