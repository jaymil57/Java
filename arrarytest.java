import java.util.Scanner;
import java.util.Random;
public class arrarytest {
public static void main (String []args) {
	double[] prices = new double[6];
	Scanner in = new Scanner (System.in);
	System.out.println("enter the prices:");
	prices[0]= in.nextDouble();
	prices[1]= in.nextDouble();
	prices[2]= in.nextDouble();
	prices[3]= in.nextDouble();
	prices[4]= in.nextDouble();
	prices[5]= in.nextDouble();
	
	double total = prices[0]+prices[1]+prices[2]+prices[3]+prices[4]+prices[5];
	System.out.println("total of your prices entered is: " + total);
	Random rand = new Random();
	
	prices[0]= rand.nextInt(10);
	prices[1]= rand.nextInt(10);
	prices[2]= rand.nextInt(10);
	prices[3]= rand.nextInt(10);
	prices[4]= rand.nextInt(10);
	prices[5]= rand.nextInt(10);
	System.out.println(prices[0]);
	System.out.println(prices[0] + prices[1] + prices[2] + prices[3] + prices[4] + prices[5]);
	double total1 = prices[0]+prices[1]+prices[2]+prices[3]+prices[4]+prices[5];
	System.out.println("total of  prices of random number picked is: " + total1);
}
}
