import java.util.Scanner;

public class calculateshipping {
	public static void main(String[]args) {
		for (;;) {
		double totalsale = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the total for sale: ");
		totalsale =in.nextDouble();
		if (totalsale < 25) {
			totalsale += 15;
			System.out.println(totalsale);
		}
		else if (totalsale < 50) {
			totalsale += 10;
			System.out.println (totalsale);
		}
		else if(totalsale <= 75) {
			totalsale += 5;
			
		}
		
		System.out.println("total cost for your sale is:  " + totalsale);
	
		System.out.println();
		
		}
	}
}
