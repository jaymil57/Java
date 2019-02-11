import java.util.Scanner;
import java.util.Arrays;
public class MealplanProject {
	public static void main (String []args) {
		int numweeks = gettotalmealweeks();
		double[] dailymealcost = new double [7];
		
		System.out.println("Before calling method:" + Array.toString(dailymealcost));
		
		getdailymealcost(dailymealcost);
		System.out.println("After calling the method: " + Array.toString(dailymealcost));
		
		double totalcost = computemealplancost(numweeks, dailymealcost);
		
		printtotalmealplancost(totalcost);
	}
	
	public static int gettotalmealweeks() {
		Scanner in = new Scanner (System.in);
		System.out.println("enter the total number of weeks in semester: ");
		int totalweeks = in.nextInt();
		return totalweeks;
		
	}
	
	public static void getdailymealcost(double[]dailycost) {
		Scanner in = new Scanner(System.in);
		
		for (int i=0; i <dailycost.length; i++) {
			System.out.println("Enter the daily cost for the day " +(i +1));
			dailycost[i] = in.nextDouble();
			
		}
	}
	
	public static double computemealplancost (int numweeks, double[] dailycost) {
		double totalcost = 0, weeklycost = 0;
		for(int i=0; i < dailycost.length; i++) {
			weeklycost += dailycost[i];
		}
		
		totalcost = weeklycost * numweeks;
		return totalcost;
	}
	
	public static void printtotalmealplantcost (double total) {
		System.out.printf("your estimate total meal plan cost for the " + 
				"semester is:  $%5.2f", total);
		System.out.println();
	}
}
