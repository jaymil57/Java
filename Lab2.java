import java.util.Random;
public class Lab2 {
	public static void main (String []args) {
		Student stu1 = new Student ("john" , "123456789");
		Student stu2 = new Student("jane", "9384535235");
		Student stu3 = new Student ("doe", "329847328");
		
		stu1.enroll("Math251");
		stu1.enroll("eng105");
		stu1.enroll("Histor101");
		
		stu1.showCourses();
		stu1.checkBalance();
		stu1.payTuition(600);
		stu1.checkBalance();
		System.out.println(stu1.toString());
		
		
		}
}

class Student {
	String name;
	String ssn;
	private String email;
	private static int id=1000;
	private String UserId;
	private String courses = "";
	private static final int costofcourse = 800;
	private int balance;
	private String city, state,phone;
	
	
	
	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public Student (String name, String ssn) {
		id++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
	}
	
	
	
	private void setEmail() {
		email = name .toLowerCase() + "." + id + "@sdetuniversity.com";
		System.out.println("your email : " + email);
	}
	
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int randnum = (int) (Math.random()  * (max - min)) ;
		randnum = randnum + min;
		UserId = id  + randnum + ssn.substring(6);
		System.out.println("Your user id: " + UserId);
	}
	


public void enroll(String course) {
	this.courses = this.courses + "\n" + course;
	System.out.println(course);
	balance = costofcourse + balance;
	System.out.println("total cost: " + balance);
}

public void payTuition(int amount) {
	
	System.out.println("Payment: " + amount);
	balance = balance - amount;
}

public void checkBalance() {
	System.out.println("Your total Balance is: " + balance);
}

public void showCourses() {
	System.out.println("the courses you enrolled in are: " + courses);
}

public String toString() {
	return "[Name " + name + "]\n[Courses" + courses + "]\n[Balance: "
			+ balance + "]";
}

}