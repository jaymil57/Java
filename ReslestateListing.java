
public class ReslestateListing {
	public static void main (String []args) {
		Property land = new Property(1000,"Land", 2.1);
		Property estate = new Property(25000, "Estate", 1.5, 3, 4);
		System.out.println(land.tostring());
		System.out.println(estate.tostring());
		
		estate.setaskingprice(230000);
		
		System.out.println(estate.tostring());
		
	}
}
