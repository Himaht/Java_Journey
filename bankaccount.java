import java.util.Scanner;

public class bankaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("This program removes white spaces from inputs");
		System.out.println("Enter your account number: ");
		String accNum = scnr.nextLine();
		accNum = accNum.replace(" ", "");
		System.out.println(accNum);

	}

}
