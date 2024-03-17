
public class minAndMax {

	public static void main(String[] args) {
		int[] numbers = {2,4,5,3,-12,5,44,8};
		min(numbers);
		max(numbers);
		
		int[] val = {1,2,3};
		
		int[] las = {4,5,6,};
		System.out.println(vall(val,las));
		
		
	}
	public static void min(int[] numbers) {
		int small = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(small > numbers[i]) {
				small = numbers[i];
			}
		} System.out.println(small);
	} 
	public static void max(int[] numbers) {
		int large = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(large < numbers[i]) {
				large = numbers[i];
			}
	}System.out.println(large);
	}
	public static int[] vall(int[] numbers, int[] values) {
		
		int[] newValue = new int[numbers.length + values.length]; 
		int star = newValue[0];
		int end = newValue.length-1;
		
		for(int i = 0; i < numbers. length; i++ ) {
			newValue[i] = numbers[i];
			
		}
		
		
		return newValue;
	}

}
