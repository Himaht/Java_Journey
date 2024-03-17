import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayList {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("Banana");
		fruits.add("Pear");
		fruits.add("Orange");
		System.out.println(fruits);
		Collections.sort(fruits);
		System.out.println(fruits);
		
		for(int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		System.out.println("Enter 5 numbers");
		for(int i = 0; i < 5; i++) {
			int temp = scnr.nextInt();
			
			if(!numbers.contains(temp)) {
				numbers.add(temp);
			} 
			
		}//Collections.sort(numbers);
		System.out.println(numbers);
		
		
	}
}
