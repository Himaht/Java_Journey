import java.util.Scanner;

public class newfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		double kph = scnr.nextDouble();
		
		double mph = kph * 0.621371;
		
		System.out.println("kph to mph: " + mph);

	}

}
