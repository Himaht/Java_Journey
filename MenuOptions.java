import java.util.ArrayList;
import java.util.Scanner;

public class MenuOptions {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner scnr = new Scanner(System.in);
		
		
		while(true) {
			displayMenu();
			System.out.println("Enter Choice");
			
			int choice = scnr.nextInt();
			if(choice == 1) {
				//add
				System.out.println("Enter number: ");
				numbers.add(scnr.nextInt());
				System.out.println("Added");
			}else if(choice == 2) {
				//remove
				System.out.println("Enter number to remove: ");
				int remnum = scnr.nextInt();
				if(numbers.contains(remnum)) {
					numbers.remove(Integer.valueOf(remnum));
					System.out.println("removed");
				} else {
					System.out.println("Not found");
				}
			}else if(choice == 3) {
				System.out.println("Your list is " + numbers );
			}else if(choice == 4) {
				System.out.println("Bye");
				break;
			}
			
		
		}
		
	}
	public static void displayMenu() {
		System.out.println("Enter a number to select");
		System.out.println("1. Add");
		System.out.println("2. Remove");
		System.out.println("3. Display");
		System.out.println("4. Exit");
	}
	


}
