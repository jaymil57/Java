package studentsGrade;

import java.util.Scanner;

public class Studentgradewhileloop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello from edureka!");
		int math, physics, chemistry, history, english, compsci;
		double finalScore;
		boolean result = true;
		
		Scanner in = new Scanner (System.in);
		while(result) {
			System.out.println("Enter the Grades for Math: ");
			math = in.nextInt();
			System.out.println("Enter the Grades for Phyics: ");
			physics = in.nextInt();
			System.out.println("Enter the Grades for Chemistry: ");
			chemistry = in.nextInt();
			System.out.println("Enter the Grades for History: ");
			history = in.nextInt();
			System.out.println("Enter the Grades for English: ");
			english = in.nextInt();
			System.out.println("Enter the Grades for Computer Science: ");
			compsci = in.nextInt();
			finalScore = (math + physics + chemistry + history + english + compsci) / 6;
			
			if (finalScore > 90) {
				System.out.println("Your Grade is A");
				
			}
			else if (finalScore > 80) {
				System.out.println("Your Grade is B");
				
			}
			
			else if (finalScore > 70) {
				System.out.println("Your Grade is C");
				
			}
			
			else if (finalScore > 60) {
				System.out.println("Your Grade is D");
				
			}
			
			else if (finalScore > 50) {
				System.out.println("Your Grade is F");
				
			}
			
			else {
				System.out.println("Your Grades are Very Poor!");
			}
			
			System.out.println("Any more Students? (true or false) ");
			
			result = in.nextBoolean();
			
		}
		
		while(result);
		
		
	}

}
