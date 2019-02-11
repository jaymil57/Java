import java.util.Scanner;
public class Methodtest {
	public static void main(String[]args) {
		for (;;) {
		double x, y, z;
		double avg;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the value of three numbers: ");
		x = in.nextDouble();
		y = in.nextDouble();
		z =in.nextDouble();
		
		avg = average(x,y,z);
		System.out.println("the average is: " + avg);
		System.out.println();
	}
	}
	
	public static double average(double a, double b, double c) {
		double avg = (a + b + c) / 3;
		return avg;
	}
}
