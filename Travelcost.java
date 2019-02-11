import java.util.Scanner;

public class Travelcost {
	public static void main (String[]args) {
		double distance, mpg, pricepergallon, totalcost;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the total distance in miles: " );
		distance = in.nextDouble();
		System.out.println("Enter the total mpg: " );
		mpg = in.nextDouble();
		System.out.println("Enter the price per gallon: ");
		pricepergallon = in.nextDouble();
		
		 totalcost =( (distance /mpg)*pricepergallon);
		System.out.println("The trip is going to cost you: " + totalcost);
		System.out.println();
	}
}
