import java.util.Arrays;
import java.util.Scanner;

public class arra2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int[] numbers = {1,2,-3,5,7};
		the_Sum(numbers);
		the_Product(numbers);
		double average = the_average(numbers);
		System.out.println(average);
		//prints(numbers);
		
	}
	public static void the_Sum(int[] numbers) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println(sum);
	}
	public static void the_Product(int[] numbers) {
		int prod = 1;
		for(int i = 0; i < numbers.length; i++) {
			prod *= numbers[i];
		}
		System.out.println(prod);
	}
	public static double the_average(int[] numbers) {
		int sum = 0;
		double aver;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			
		} 
		aver=  (sum) / numbers.length;
		return aver;
	}
	public static void prints(int[] numbers) {
		System.out.println(Arrays.toString(numbers));
	}

}