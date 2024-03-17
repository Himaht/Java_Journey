
public class Movie {
	private String title;
	private String genre;
	private String director;
	private int releaseYear;
	private boolean isAvailable;
	
	public Movie(String the_title, String the_director, String the_genre,int the_releaseYear) {
		title = the_title;
		director = the_director;
		genre = the_genre;
		releaseYear = the_releaseYear;
		isAvailable = true;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGenre() {
		return genre;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getDirector() {
		return director;
	}
	public void setReleaseyear(int release) {
		releaseYear = release;
	}
	public int getReleaseyear() {
		return releaseYear;
	}
	public boolean isAvailable() {
        return isAvailable;
    }
	public void availability() {
		if(isAvailable) {
			isAvailable = false;
			System.out.println("Movie " + title + " has been rented");
		}else {
			System.out.println("Movie " + title + " is available");
		}
	}
	public String returnedMovie() {
		if(!isAvailable) {
			isAvailable = true;
			System.out.println("Movie " + title + " has been returned");
		}else {
			System.out.println("Movie " + title + " has not been returned ");
		}
		
	}
	public String toString() {
		return "The title of the movie is " + title + "of genre " + genre +
				". The move was released " + releaseYear + " and directed by "+ director + ".";
	} 

}
