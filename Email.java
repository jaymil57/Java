package emailapp;
import java.util.Scanner;
import java.util.Random;
public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String email;
	private String companySuffix = "aeycompany.com";
	private int defaultpasswordlength = 10;
	//constructor
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName  = lastName;
		System.out.println("Email Create: " + this.firstName + " " + this.lastName);
		
		this.department = setDepartment();
		System.out.println("Department:  " + this.department);
		
		this.password = randomPassword(defaultpasswordlength);
		System.out.println("Your password is: " + this.password);
		
		email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);
	}
	//call a method ask for department
	private String setDepartment() {
		System.out.println("Department Code \n1 for Sales\n2 for Development\n3 For "
				+ "Acocunting\n0 for none\n Enter Department Code: \n");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if (deptChoice == 1) {return "sales";}
		else if (deptChoice == 2) {return "Development";}
		else if (deptChoice == 3) {return "Accounting";}
		else {return "None";}
	}
	//generate a random password
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int)( Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			
		}
		return new String (password);
	}
	//set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	//set the aleternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//change the password

	public void changePassword (String password) {
		this.password = password;
	}
	
	public int getmailboxCapacity() {
		return  mailboxCapacity;}
	public String getalternateEmail() {
		return alternateEmail;}
	public String password () {
		return password;}
	
}
