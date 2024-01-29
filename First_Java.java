import java.util.Scanner;

public class First_Java {

	public static void main(String[] args) { //method
		System.out.println("What is your name?");

	
	//type   identifier  = new type();
	Scanner scanner = new Scanner(System.in);
	String name = scanner.nextLine();
	
	System.out.println("Hello " + name);
	int x = 5; //Primitive
	//Integer y = 5 ; //object(5 is autoboxed )
	
	System.out.println(x);
	int cost = in.nextInt
	
	
	}

}
//class- contains everything and has members
//methods- Do something
//argument - what you pass to a method(part of a calling)
//parameter- variables to store arguments(part of a definition)
//properties- store something
//access modifier (public)- who can use
//static - No instance of the class is needed
//object- instance of a class
//variable - stores some value
//expression- evaluates to a value
//literal- just the value of a string
//statically typed- variables are given data types up front(before compiling)
//dynamically typed- variables do not have types
//primitive types- Int, short, double, long, byte
//compound types- 
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