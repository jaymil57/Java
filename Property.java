
public class Property {
	private double askingprice;
	private String propertytype;
	private double lotsize;
	private int numbaths;
	private int numbeds;
	
	public Property(double askingprice, String propertytype, double lotsize) {
		this.askingprice = askingprice;
		this.propertytype = propertytype;
		this.lotsize = lotsize;
		numbaths = 0;
		numbeds = 0;
		
	}
	
	public Property(double askingprice, String propertytype, double lotsize, int numbaths,
		int numbeds) {
		this.askingprice = askingprice;
		this.propertytype = propertytype;
		this.lotsize = lotsize;
		this.numbaths = numbaths;
		this.numbeds = numbeds ;
		
	}
	
	public String tostring() {
		return "Asking Price: $" + askingprice + "\nProperty Type: " + propertytype + 
				"\nLot Size: " + lotsize + "\nNumber of Bathrooms: " + numbaths +
				"\nNumber of bedrooms: " + numbeds;
	}
	
	public void setaskingprice (double newvalue) {
		askingprice = newvalue;
	}
}
