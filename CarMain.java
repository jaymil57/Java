import java.awt.Color;


public class CarMain {
	public static void main(String []args) {
		
		Car car = new Car(25.0, "J99HEP", 
				 Color.black,true);
	System.out.println("My car license plate is: " + car.LicensePlate );
	}
}
