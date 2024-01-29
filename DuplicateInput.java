import java.util.Scanner;
public class DuplicateInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double input= in.nextDouble();
		while (in.hasNextDouble())
		{
		   double previous = input;
		   input = in.nextDouble();
		   if (input == previous) 
		   { 
		      System.out.println("Duplicate input"); 
		   }
		}

	}

}
