import java.util.Scanner;

public class MovieRentalSystem {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//Movie movies = new Movie();
		//Customer customers = new Customer();
		
		String movieTitle, movieGenre, movieMirector, contactInfo, MovieName;
		
		int movieRealeaseyear;
		
		System.out.println("Enter Movie Title");
		movieTitle = scnr.nextLine();
		System.out.println("Enter Movie Genre");
		movieGenre = scnr.nextLine();
		System.out.println("Enter Movie Director");
		movieMirector = scnr.nextLine();
		System.out.println("Enter Customer's Contact Information");
		contactInfo = scnr.nextLine();
		System.out.println("Enter customer's name");
		MovieName = scnr.nextLine();
		
		System.out.println("Enter realease year");
		movieRealeaseyear = scnr.nextInt();
		
		Movie movies = new Movie(movieTitle, movieMirector, movieGenre, movieRealeaseyear);
		
		Customer customers = new Customer(MovieName, contactInfo);
		
		customers.rentedMovielist(movies);
		
		customers.getrentedMovie();
		
		System.out.println(movies);

		movies.availability();

        	movies.returnedMovie();
	}

}
