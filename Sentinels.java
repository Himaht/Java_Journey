import java.util.Scanner;

public class Sentinels {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int score;
		int totalScore = 0;
		System.out.println("Enter your scores and -1 to exit progragram");
		score = keyboard.nextInt();
		
		while(score != -1) {
			totalScore += score;
			System.out.println("Enter your scores and -1 to exit progragram");
			score = keyboard.nextInt();
		}
		
		System.out.println("Your total Score is " + totalScore);

	}

}
