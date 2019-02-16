package emailapp;
import java.util.Scanner;
public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Email em1 = new Email("John","Smith");
		
		em1.setAlternateEmail("js@gmail.com");
		System.out.println("Your alternate email: " + em1.getalternateEmail());
		
		System.out.println(em1.showInfo());
	}

}
