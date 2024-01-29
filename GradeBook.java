import java.util.Scanner;

public class GradeBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		int grade = scnr.nextInt();
		
		if (grade >= 0 && grade <= 49)
		{
			System.out.println("F");
		}
		else if( grade >= 50 && grade <= 59) {
			System.out.println("E");
		}
		else if(grade >= 60 && grade <= 69) {
			System.out.println("D");
		}
		else if(grade >= 70 && grade <= 79) {
			System.out.println("C");
		}
		else if(grade >= 80 && grade <= 89) {
			System.out.println("B");
		}
		else if(grade >= 90 && grade <= 99) {
			System.out.println("A");
		}
	

	}

}
