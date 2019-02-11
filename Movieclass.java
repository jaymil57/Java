import java.util.Scanner;

public class Movieclass {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
	
		Movie favmovie;
		System.out.println("Enter the name of the movie: ");
		String movie = in.nextLine();
		
		System.out.println("Enter the rating of the movie: ");
		String rating = in.nextLine();
		
		System.out.println("Enter the year of the movie: ");
		int year = in.nextInt();
		
		System.out.println("Enter the run time of the movie: ");
		int runtime = in.nextInt();
		
		favmovie = new Movie(movie, rating, year, runtime);
		System.out.println(favmovie.tostring());
		
	}
	
}
