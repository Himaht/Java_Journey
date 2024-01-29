import java.util.Random;

public class DiceGame {

	public static void main(String[] args) {
		Random coolNum = new Random();
		int x = coolNum.nextInt(6) + 1; //  to get numbers from 1 to 6 --int x = coolNum.nextInt(6) gets numbers from 0-5
		System.out.println("You rolled a " + x);
	}

}
