
public class Overloadingtest {
	public static void main (String[]args) {
		
		System.out.println("the average of three integers 3, 5, 8: " +
		average(3, 5, 8));
		System.out.println("the average of three integers 4.0, 6.0, 18.0: " +
		average(4.0,6.0,16.0));
		
	}
	
	
	
	public static double average(int x, int y, int z) {
		return (x + y +z)/3.0;
	}
	
	public static double average(double x, double y, double z) {
		return (x + y +z)/3;
		
	}
	
	
}
