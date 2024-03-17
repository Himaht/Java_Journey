
public class Customer extends Movie {
	private ArrayList<Movie> rentedMovie;
	private String name;
	private String contactInfo;
	
	public Customer() {
		name = " ";
		rentedMovie = new ArrayList<>();
		contactInfo = " ";
	}
	public void setName(String name_) {
		name = name_;
	}
	public String getName() {
		return name;
	}
	public void setrentedMovie(String rentedMovie_) {
		rentedMovie = rentedMovie_;
	}
	public String getrentedMovie() {
		return rentedMovie;
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
	public String toString() {
        return "Customer: " + name + ", Contact Info: " + contactInfo;
    }
	

}
