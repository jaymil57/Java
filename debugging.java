
public class debugging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		double average, value;
		String[] daysofweek = {"Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday"};
		value = 3.75;
		number = (int)value;
		//average = (3+5+8) / 0;
		System.out.println("First day of the week is:  " +daysofweek[1]);
		System.out.println("Last day of the week is:  " +daysofweek[6]);
		average = (3 + 5 + 8) / 3.0;
		System.out.println("Expected value is 5.33, actual value is:  " + average);
	}

}
