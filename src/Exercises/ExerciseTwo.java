package Exercises;

public class ExerciseTwo {
	public static void main(String[] args) {
		char[] theAlphabet = getAlphabetArray();
		
		for(int i = 0; i<theAlphabet.length; i++) {
			System.out.println(theAlphabet[i]);
		}
	}
	
	public static char[] getAlphabetArray() {
		char[] theAlphabet = new char[26];
		int index = 0;
		char currLetter = 'a';
		
		do {
			theAlphabet[index] = currLetter;
			index++;
			currLetter++;
		}while(index<theAlphabet.length);
		
		
		return theAlphabet;
	}
}
