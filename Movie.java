
public class Movie {
	private String moviename, rating;
	private int year;
	private int runtime;
	

	public Movie(String title, String rating, int year, int runtime ) {
		this.moviename = title;
		this.rating = rating;
		this.year = year;
		this.runtime = runtime;
	}
	
	
	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

public String tostring() {
	return "Movie Title" + moviename + "\n Rating" + rating + "\n Year: " + year + 
			"\n Movie Run Time: " + runtime;
}
	
}
