import java.util.ArrayList;

public class Customer {
	private ArrayList<Movie> rentedMovie;
	private String name;
	private String contactInfo;
	
	public Customer(String name, String contactInfo) {
		this.name = name;
		rentedMovie = new ArrayList<Movie>();
		this.contactInfo = contactInfo;
	}
	public void setName(String name_) {
		name = name_;
	}
	public String getName() {
		return name;
	}
	public void setrentedMovie(ArrayList<Movie> rentedMovie_) {
		rentedMovie = rentedMovie_;
	}
	public void setcontactInfo(String contactInfo_) {
		contactInfo = contactInfo_;
	}
	public String getcontactInfo() {
		return contactInfo;
	}
	public void rentedMovielist(Movie movie) {
		rentedMovie.add(movie);
		System.out.println("Movie " + movie.getTitle() + " rented by " + name);
	}
	public void returnedMovie(Movie movie) {
		rentedMovie.remove(movie);
		System.out.println("Movie " + movie.getTitle() + " returned by " + name);
	}
	public ArrayList<Movie> getrentedMovie() {
		return rentedMovie;
	}
	public String toString() {
        return "Customer: " + name + ", Contact Info: " + contactInfo;
    }
	

}
