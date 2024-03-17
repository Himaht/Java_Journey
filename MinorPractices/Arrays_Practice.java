import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Practice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int[] numbers = {1,2,-3,5,7};
		the_Sum(numbers);
		the_Product(numbers);
		the_average(numbers);
		prints(numbers);
		
	}
	public static void the_Sum(int[] numbers) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
	}
	public static void the_Product(int[] numbers) {
		int prod = 0;
		for(int i = 0; i < numbers.length; i++) {
			prod *= numbers[i];
		}
	}
	public static void the_average(int[] numbers) {
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			sum /= numbers.length;
		}
	}
	public static void prints(int[] numbers) {
		System.out.println(Arrays.toString(numbers));
	}

}

/*System.out.println("Enter length of array");
int lenght_num = in.nextInt();

int[] my_Array = new int[lenght_num];
for(int i = 0; i < my_Array.length; i++) {
	//System.out.println(my_Array[i]);
	my_Array[i] = in.nextInt();
	
}
System.out.println(Arrays.toString(my_Array));*/
