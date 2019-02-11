import java.awt.*;

public class Car {
	double averageMilesPerGallon;
	String LicensePlate;
	Color paintColor;
	boolean areTailingworking;
	
	public Car(double inputavgmpg, 
			String inputlicenseplate, 
			Color inputcarcolor,
			boolean inputaretailingworking ){
		this.averageMilesPerGallon = inputavgmpg;
		this.LicensePlate = inputlicenseplate;
		this.paintColor = inputcarcolor;
		this.areTailingworking = inputaretailingworking;
	}
	
}
