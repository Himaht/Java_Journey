import java.util.Scanner;

public class MovieRentalSystem {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		Movie movies = new Movie();
		Customer customers = new Customer();
		
		String movieTitle, movieGenre, movieMirector, contactInfo, MovieName;
		
		int movieRealeaseyear;
		
		movieTitle = scnr.nextLine();
		movieGenre = scnr.nextLine();
		movieMirector = scnr.nextLine();
		contactInfo = scnr.nextLine();
		MovieName = scnr.nextLine();
		
		movieRealeaseyear = scnr.nextInt();
		
		Movie movies = new Movie(movieTitle, movieMirector, movieGenre, movieRealeaseyear);
		
		System.out.println(movies);
	}

}
