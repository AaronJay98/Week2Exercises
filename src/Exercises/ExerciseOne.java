package Exercises;

public class ExerciseOne {
	public static void main(String[] args) {
		int count = 1;
		do {
			if(count % 2 == 1) {
				System.out.println(count);
			}
			count++;
		} while(count <= 9);
	}
}
