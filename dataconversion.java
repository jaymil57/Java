
public class dataconversion {
	public static void main(String[]args) {
		System.out.println((3+5+8)/3);
		System.out.println((3+5+8)/3.0);
		double volume = 4/3 * Math.PI * 10*10*10;
		double real_volume = 4/3.0 *Math.PI * 10*10*10;
		System.out.println(volume);
		System.out.println(real_volume);
		
		double fahrenheit = 500;
		double celcius = (fahrenheit - 32) * (5/9.0);
		System.out.println(celcius);
	}
	
}
